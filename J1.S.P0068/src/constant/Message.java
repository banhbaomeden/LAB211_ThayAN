package constant;

public final class Message {

    private Message() {
    }

    // ===== TITLE =====
    public static final String PROGRAM_TITLE
            = "====== Collection Sort Program ======";

    public static final String INPUT_STUDENT
            = "Please input student information";

    // ===== INPUT =====
    public static final String ENTER_NAME
            = "Name: ";

    public static final String ENTER_CLASS
            = "Classes: ";

    public static final String ENTER_MARK
            = "Mark: ";

    public static final String CONTINUE
            = "Do you want to continue (Y/N): ";

    // ===== VALIDATION =====
    public static final String NAME_EMPTY
            = "Name cannot be empty.";

    public static final String CLASS_EMPTY
            = "Class cannot be empty.";

    public static final String INVALID_NAME
            = "Name must contain letters only.";

    public static final String INVALID_CLASS
            = "Class is invalid.";

    public static final String MARK_NUMBER
            = "Mark must be a number.";

    public static final String MARK_RANGE
            = "Mark must be from 0 to 100.";

    public static final String YN_INVALID
            = "Please input Y or N.";

    // View
    public static final String LIST_EMPTY
            = "No data available.";

    public static final String STUDENT_INFO
            = "==============Student ";

    public static final String STUDENT_INFO_END
            = "===============";
}
