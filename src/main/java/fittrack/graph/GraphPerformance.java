package fittrack.graph;

import fittrack.enums.Exercise;
import fittrack.trainingsession.TrainingSession;
import fittrack.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class GraphPerformance extends GraphBase {

    static final int INVALID_TIME_VALUE = -1;
    static final int DATETIME_LENGTH = 16; //Length of Date format without spaces
    public static final int Y_TIME_OFFSET = 6;

    //Returns line with properly spaced descriptions for the X axis
    private static String formatXHeaderDesc(int numSessions,
            ArrayList<TrainingSession> sessionList, int maxXHeaderLength) {
        StringBuilder descriptions = new StringBuilder();
        for (int i = 0; i < numSessions; i++) {
            descriptions.append(centerText(sessionList.get(i).getSessionDescription(), maxXHeaderLength));
        }
        return descriptions.toString();
    }

    //Returns line with properly spaced descriptions for the X axis
    private static String formatXHeaderDate(int numSessions,
            ArrayList<TrainingSession> sessionList, int maxXHeaderLength) {
        StringBuilder dates = new StringBuilder();
        for (int i = 0; i < numSessions; i++) {
            dates.append(centerText(sessionList.get(i).getSessionDatetime(), maxXHeaderLength));
        }
        return dates.toString();
    }

    //Getting the X axis for the performance graph
    static String generateXHeader(int numSessions, ArrayList<TrainingSession> sessionList,
            int maxXHeaderLength, int yOffset){
        String xHeadersDate = formatXHeaderDate(numSessions, sessionList, maxXHeaderLength);
        String xHeadersDesc = formatXHeaderDesc(numSessions, sessionList, maxXHeaderLength);

        //Adding any offset needed due to Y axis labels
        return generateChar(yOffset, ' ') +  xHeadersDesc + System.lineSeparator()
                + generateChar(yOffset, ' ') + xHeadersDate;
    }

    // Return minimum height of graph
    static int getMinTimePerformance(ArrayList<TrainingSession> sessionList, Exercise exercise,
            int numTrainingSessions){
        // case 1: There are no data found in All sessions;
        boolean isAllDataInvalid = checkDataValidity(sessionList, exercise, numTrainingSessions);
        if (isAllDataInvalid) {
            return INVALID_TIME_VALUE;
        }
        // invariant: there exist 1 session that has data
        // case 2: return the minPerformance of the session
        int sessionIndex = 0;
        int minExercisePerformance;
        minExercisePerformance = extractMin(sessionList, exercise, numTrainingSessions, sessionIndex);
        return minExercisePerformance;
    }

    private static int extractMin(ArrayList<TrainingSession> sessionList, Exercise exercise, int numTrainingSessions, int sessionIndex) {
        int minExercisePerformance;
        // find the first session that has valid data and set as min
        do {
            minExercisePerformance = sessionList.get(sessionIndex).getExercisePerformance(exercise);
            sessionIndex += 1;
        } while (minExercisePerformance == INVALID_TIME_VALUE);

        // find existence of session that has a smaller valid data
        for (int i = sessionIndex; i < numTrainingSessions; i++) {
            int exercisePerformance = sessionList.get(i).getExercisePerformance(exercise);
            if (exercisePerformance < minExercisePerformance && exercisePerformance != INVALID_TIME_VALUE) {
                minExercisePerformance = exercisePerformance;
            }
        }
        return minExercisePerformance;
    }

    // check if there is a single valid data in sessions
    private static boolean checkDataValidity(ArrayList<TrainingSession> sessionList, Exercise exercise, int numTrainingSessions) {
        boolean isAllDataInvalid = true;
        for (int i = 0; i < numTrainingSessions; i++) {
            int exercisePerformance = sessionList.get(i).getExercisePerformance(exercise);
            if (exercisePerformance != -1) {
                isAllDataInvalid = false;
                break;
            }
        }
        return isAllDataInvalid;
    }

    //Getting the maximum height for the graph
    static int getMaxExercisePerformance(ArrayList<TrainingSession> sessionList, Exercise exercise,
            int numTrainingSessions){
        int maxExercisePerformance = 0;
        for(int i = 0; i < numTrainingSessions; i++) {
            int exercisePerformance = sessionList.get(i).getExercisePerformance(exercise);
            if (exercisePerformance > maxExercisePerformance) {
                maxExercisePerformance = exercisePerformance;
            }
        }
        return maxExercisePerformance;
    }

    public static void graphExercisePerformance(Exercise exercise, ArrayList<TrainingSession> sessionList) {
        System.out.print("Here's your progression for " + exercise.toString() + " over your training sessions:"
                + System.lineSeparator() + System.lineSeparator());

        StringBuilder graph = new StringBuilder();
        int numSessions = sessionList.size();
        int maxExercisePerformance = getMaxExercisePerformance(sessionList, exercise, numSessions);
        int minExercisePerformance = getMinTimePerformance(sessionList, exercise, numSessions);
        int maxXHeaderLength = Math.max(DATETIME_LENGTH, TrainingSession.getLongestSessionDescription());
        int yOffset;

        // Prepare Y axis and main content
        if (exercise == Exercise.WALK_AND_RUN || exercise == Exercise.SHUTTLE_RUN) {
            yOffset = Y_TIME_OFFSET;
            graph.append(GraphPerformanceTime.graphExerciseTime(exercise, sessionList, minExercisePerformance,
                    maxExercisePerformance, maxXHeaderLength));
        } else {
            yOffset = String.valueOf(maxExercisePerformance).length() - 1;
            graph.append(GraphPerformanceRepsDistance.graphExerciseRepsDistance(exercise, sessionList,
                    maxExercisePerformance, maxXHeaderLength, numSessions));
        }

        // Prepare X-axis headers
        graph.append(generateXHeader(numSessions, sessionList, maxXHeaderLength, yOffset));
        // Print graph to CLI
        System.out.print(graph + System.lineSeparator() + System.lineSeparator());
    }
}
