package fittrack.messages;

public class Messages {
    public static final String SEPARATOR = "__________________________________________________"
            + "__________________________________________________";

    public static final String SET_USER_COMMAND = "set";
    public static final String HELP_COMMAND = "help";
    public static final String ADD_SESSION_COMMAND = "add";
    public static final String LIST_SESSIONS_COMMAND = "list";
    public static final String VIEW_SESSION_COMMAND = "view";
    public static final String EDIT_EXERCISE_COMMAND = "edit";
    public static final String DELETE_SESSION_COMMAND = "delete";
    public static final String ADD_REMINDER_COMMAND = "remind";
    public static final String DELETE_REMINDER_COMMAND = "delete-remind";
    public static final String LIST_REMINDER_COMMAND = "list-remind";
    public static final String LIST_UPCOMING_REMINDER_COMMAND = "upcoming-remind";
    public static final String EXIT_COMMAND = "exit";
    public static final String ADD_GOAL = "add_goal";
    public static final String DELETE_GOAL = "delete_goal";
    public static final String LIST_GOAL = "LIST_goal";
    public static final String PULL_UP_ACRONYM = "PU";
    public static final String SHUTTLE_RUN_ACRONYM = "SR";
    public static final String SIT_AND_REACH_ACRONYM = "SAR";
    public static final String SIT_UP_ACRONYM = "SU";
    public static final String STANDING_BROAD_JUMP_ACRONYM = "SBJ";
    public static final String WALK_AND_RUN_ACRONYM = "WAR";
    public static final String ADD_WATER_COMMAND = "add-water";
    public static final String DELETE_WATER_COMMAND = "delete-water";
    public static final String LIST_WATER_COMMAND = "list-water";
    public static final String ADD_FOOD_COMMAND = "add-food";
    public static final String DELETE_FOOD_COMMAND = "delete-food";
    public static final String LIST_FOOD_COMMAND = "list-food";
    public static final String ADD_CALORIES_COMMAND = "add-calories";
    public static final String DELETE_CALORIES_COMMAND = "delete-calories";
    public static final String LIST_CALORIES_COMMAND = "list-calories";
    public static final String ADD_MOOD = "add-mood";
    public static final String DELETE_MOOD_COMMAND = "delete-mood";
    public static final String LIST_MOOD_COMMAND = "list-mood";

    public static final String INIT_SENTENCE = "Hello! I'm FitTrack."
            + System.lineSeparator() + "Please input your gender and age:";
    public static final String HELP_MESSAGE = "COMMAND                                                          EXAMPLE"
            + System.lineSeparator() + "help                                                             help"
            + System.lineSeparator() + "set (gender) (age)                                               set male 12"
            + System.lineSeparator() + "add (session name)                                               add session1"
            + System.lineSeparator() + "list                                                             list"
            + System.lineSeparator() + "view (session index)                                             view 1"
            + System.lineSeparator() + "edit (session index) (exercise acronym) (repetitions/time)       edit 1 PU 1"
            + System.lineSeparator() + "delete (session index)                                           delete 1"
            + System.lineSeparator() + "remind (Event / Task) (deadline)                                 remind " +
            "NAPFA DD/MM/YYYY"
            + System.lineSeparator() + "list-remind                                                      list-remind "
            + System.lineSeparator() + "delete-remind (reminder index)                                   delete-remind"
            + "1"
            + System.lineSeparator() + "upcoming-remind                                                  "+
            "upcoming-remind"
            + System.lineSeparator() + "add-goal (goal name) (deadline)                                  add-goal run" +
            " 12/12/2024 14:00:00"
            + System.lineSeparator() + "delete-goal (goal index)                                         delete-goal 1"
            + System.lineSeparator() + "list-goal                                                        list-goal"
            + System.lineSeparator() + "add-water (amount)                                               add-water 500"
            + System.lineSeparator() + "delete-water (index)                                             delete-water 1"
            + System.lineSeparator() + "list-water                                                       list-water"
            + System.lineSeparator() + "add-food (food item)                                             add-food apple"
            + System.lineSeparator() + "delete-food (index)                                              delete-food 1"
            + System.lineSeparator() + "list-food                                                        list-food"
            + System.lineSeparator() + "add-calories (calorie amount)                                    add-calories"
            + "200"
            + System.lineSeparator() + "delete-calories (index)                                          "
            + "delete-calories 1"
            + System.lineSeparator() + "list-calories                                                    list-calories"
            + System.lineSeparator() + "add-mood (mood description) (date) (time) (description)          add-mood"
            + "happy 01/11/2024 18:30:00 feeling healthy"
            + System.lineSeparator() + "delete-mood (mood ID)                                            delete-mood 1"
            + System.lineSeparator() + "list-mood                                                        list-mood"
            + System.lineSeparator() + "exit                                                             exit";
    public static final String LIST_SESSION_MESSAGE = "Here are your training sessions:";
    public static final String LIST_SESSION_EMPTY_MESSAGE = "Your session list is currently empty.";
    public static final String ADD_SESSION_MESSAGE = "Got it. I've added a new training session:";
    public static final String DELETE_SESSION_MESSAGE = "Got it. I've deleted this training session:";

    public static final String LIST_REMINDER_MESSAGE = "Here are your reminders:";
    public static final String LIST_REMINDER_EMPTY_MESSAGE = "Your reminder list is currently empty.";
    public static final String ADD_REMINDER_MESSAGE = "Got it. I've added a new reminder";
    public static final String DELETE_REMINDER_MESSAGE = "Got it. I've deleted this reminder:";
    public static final String NO_UPCOMING_REMINDERS = "There are no reminders due in the next week.";

    public static final String ADD_GOAL_MESSAGE = "Got it. I've added a new goal:";
    public static final String DELETE_GOALS_MESSAGE = "Got it. I've deleted this goal.";
    public static final String LIST_GOAL_MESSAGE = "Here is your goal list!";

    public static final String ADD_WATER_MESSAGE = "Got it. I've added <WATER_ML> of water.";
    public static final String DELETE_WATER_MESSAGE = "Got it. I've deleted <WATER_ML> of water.";
    public static final String LIST_WATER_MESSAGE = "Here is your water intake (in ml):";

    public static final String ADD_FOOD_MESSAGE = "Got it. I've added food item: ";
    public static final String DELETE_FOOD_MESSAGE = "Got it. I've deleted food item: ";
    public static final String LIST_FOOD_MESSAGE = "Here is your food intake list: ";

    public static final String ADD_CALORIES_MESSAGE = "Got it. I've added calorie intake:";
    public static final String DELETE_CALORIES_MESSAGE = "Got it. I've deleted the calorie intake.";
    public static final String LIST_CALORIES_MESSAGE = "Here is your calorie intake:";


    public static final String MALE_GENDER = "male";
    public static final String FEMALE_GENDER = "female";
    public static final String INVALID_USER_INFO_MESSAGE = "Please provide a valid gender and age (male/female 12-24).";
    public static final String INVALID_SESSION_NAME_MESSAGE = "Please provide a valid session name.";
    public static final String INVALID_SESSION_INDEX_MESSAGE = "Please provide a valid session index.";
    public static final String INVALID_EXERCISE_DETAILS_MESSAGE = "Please provide a valid session index, station and reps.";
    public static final String INVALID_EXERCISE_ACRONYM_MESSAGE = "Invalid exercise acronym: ";
    public static final String INVALID_PULL_UP_REPETITIONS_MESSAGE = "Invalid Pull Up repetitions: ";
    public static final String INVALID_SHUTTLE_RUN_TIMING_MESSAGE = "Invalid Shuttle Run timing: ";
    public static final String INVALID_SIT_AND_REACH_DISTANCE_MESSAGE = "Invalid Sit and Reach distance: ";
    public static final String INVALID_SIT_UP_REPETITIONS_MESSAGE = "Invalid Sit Up repetitions: ";
    public static final String INVALID_STANDING_BROAD_JUMP_DISTANCE_MESSAGE = "Invalid Standing Broad Jump distance: ";
    public static final String INVALID_WALK_AND_RUN_TIMING_MESSAGE = "Invalid Walk and Run timing: ";

    public static final String ADD_MOOD_MESSAGE = "Mood log added: ";
    public static final String DELETE_MOOD_MESSAGE = "Mood log deleted with ID: ";
    public static final String LIST_MOOD_MESSAGE = "Your mood logs: ";

    public static final String NONNUMERICAL_INDEX_MESSAGE = "Please provide a valid numerical index.";
    public static final String INDEX_OUT_OF_BOUNDS_MESSAGE = "Sorry, but that index is not within the list.";

    public static final String INVALID_INPUT_MESSAGE = "I'm sorry, I don't know what that means.";
    public static final String EXIT_MESSAGE = "Bye! Hope to see you again soon!";
}
