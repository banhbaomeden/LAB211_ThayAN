package utils;

import constant.Message;

public final class Validation {

    // Constructor private để không cho tạo object
    private Validation() {
    }

    // Kiểm tra điểm nằm trong khoảng min - max
    public static float checkInput(
            String input,
            float min,
            float max) {

        try {

            // Chuyển chuỗi sang kiểu float
            float value = Float.parseFloat(input);

            // Kiểm tra điểm có nằm trong khoảng cho phép không
            if (value >= min && value <= max) {

                // Hợp lệ
                return value;
            }

            // Không hợp lệ thì ném Exception
            throw new IllegalArgumentException(
                    Message.MARK_RANGE);

        } catch (NumberFormatException e) {

            // Người dùng nhập không phải số
            throw new IllegalArgumentException(
                    Message.MARK_NUMBER);
        }
    }

    // Kiểm tra Name không rỗng và chỉ chứa chữ
    public static String checkName(String input) {

        // Kiểm tra dữ liệu rỗng
        if (input == null || input.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    Message.NAME_EMPTY);
        }

        // Chỉ cho phép chữ cái và khoảng trắng
        if (!input.matches("[a-zA-Z ]+")) {

            throw new IllegalArgumentException(
                    Message.INVALID_NAME);
        }

        // Xóa khoảng trắng đầu và cuối rồi trả về
        return input.trim();
    }

    // Kiểm tra Class không rỗng và chỉ chứa chữ + số
    public static String checkClass(String input) {

        // Kiểm tra rỗng
        if (input == null || input.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    Message.CLASS_EMPTY);
        }

        // Chỉ cho phép chữ và số
        if (!input.matches("[a-zA-Z0-9]+")) {

            throw new IllegalArgumentException(
                    Message.INVALID_CLASS);
        }

        // Hợp lệ
        return input.trim();
    }

    // Kiểm tra lựa chọn tiếp tục chương trình
    public static boolean checkYN(String input) {

        // Nếu nhập Y hoặc y
        if (input.equalsIgnoreCase("Y")) {
            return true;
        }

        // Nếu nhập N hoặc n
        if (input.equalsIgnoreCase("N")) {
            return false;
        }

        // Nếu không phải Y hoặc N
        throw new IllegalArgumentException(
                Message.YN_INVALID);
    }
}