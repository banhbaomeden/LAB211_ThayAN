package constant;

public final class Message {

    private Message() {
    }

    // Validation
    public static final String CODE_EMPTY
            = "Code cannot be empty.";

    public static final String CODE_INVALID
            = "Code must not contain special characters.";

    public static final String INVALID_VALUE
            = "Invalid value.";

    public static final String AVAILABILITY_INVALID
            = "Availability must be >= 0.";

    public static final String AVAILABILITY_NUMBER
            = "Availability must be a number.";

    public static final String INPUT_RANGE
            = "Please enter number from ";

    // Menu
    public static final String ENTER_CHOICE = "Enter your choice: ";

    public static final String EXIT_PROGRAM = "Exit program";
    public static final String INVALID_CHOICE = "Invalid choice!";

    public static final String MENU_TITLE
            = "========= Doctor Management =========";

    public static final String MENU_ADD
            = "1. Add Doctor";

    public static final String MENU_UPDATE
            = "2. Update Doctor";

    public static final String MENU_DELETE
            = "3. Delete Doctor";

    public static final String MENU_SEARCH
            = "4. Search Doctor";

    public static final String MENU_EXIT
            = "5. Exit";

    public static final String ADD_DOCTOR
            = "--------- Add Doctor ----------";

    public static final String UPDATE_DOCTOR
            = "--------- Update Doctor -------";

    public static final String DELETE_DOCTOR
            = "--------- Delete Doctor -------";

    public static final String SEARCH_DOCTOR
            = "---------- Search Doctor --------";

    public static final String SEARCH_RESULT
            = "--------- Result -----------";

    public static final String ENTER_CODE
            = "Enter Code: ";

    public static final String ENTER_NAME
            = "Enter Name: ";

    public static final String ENTER_SPECIALIZATION
            = "Enter Specialization: ";

    public static final String ENTER_AVAILABILITY
            = "Enter Availability: ";

    public static final String ENTER_TEXT
            = "Enter text: ";

    public static final String CODE_ALREADY_EXISTS
            = "Code already exists!";

    public static final String CODE_NOT_FOUND
            = "Code not found";

    public static final String NAME_EMPTY
            = "Name cannot be empty";

    public static final String SPECIALIZATION_EMPTY
            = "Specialization cannot be empty";
    
    public static final String SEARCH_EMPTY
        = "Search text cannot be empty.";

    // View
    public static final String DOCTOR_HEADER
            = "Code\tName\tSpecialization\tAvailability";

    // Controller
    public static final String ADD_SUCCESS
            = "Add doctor successfully.";

    public static final String UPDATE_SUCCESS
            = "Update doctor successfully.";

    public static final String DELETE_SUCCESS
            = "Delete doctor successfully.";

    public static final String CODE_NOT_EXIST
            = "Code does not exist.";

    public static final String NO_DOCTOR_FOUND
            = "No doctor found.";
}
