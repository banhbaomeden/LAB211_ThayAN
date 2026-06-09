package validate;

import constant.Message;

public final class Validation {

    private Validation() {
    }
    
    //Kiểm tra mã bác sĩ
    public static String inputCode(String input) {
        //Kiểm tra rỗng
        if (input == null || input.trim().isEmpty()) {
            System.out.println(Message.CODE_EMPTY);
            return null;
        }
        //Chỉ cho phép chữ, số và khoảng trắng
        if (!input.matches("[a-zA-Z0-9 ]+")) {
            System.out.println(Message.CODE_INVALID);
            return null;
        }

        return input;
    }
    //Kiểm tra name hoặc specialization
    public static String inputString(String input, String msg) {
        //kiểm tra rỗng
        if (input == null || input.trim().isEmpty()) {
            System.out.println(msg);
            return null;
        }
        //chỉ cho nhập chữ và khoảng trắng
        if (!input.matches("[a-zA-Z ]+")) {
            System.out.println(Message.INVALID_VALUE);
            return null;
        }

        return input;
    }
    //Kiểm tra availability
    public static int inputAvailability(String input)
            throws Exception {

        try {
            
            int n = Integer.parseInt(input);
            //availability phải >= 0
            if (n < 0) {
                //ném exception nếu không hợp lệ
                throw new Exception(Message.AVAILABILITY_INVALID);
            }
            //Hợp lệ
            return n;

        } catch (NumberFormatException e) {
            //Nếu nhập không phải số
            throw new Exception(Message.AVAILABILITY_NUMBER);
        }
    }
    //Kiểm tra lựa chọn menu
    public static int checkInputIntLimit(String input, int min, int max) {

        try {

            int result = Integer.parseInt(input);
            //Kiểm tra trong khoảng min-max
            if (result >= min && result <= max) {
                return result;
            }

        } catch (NumberFormatException e) {
        }

        System.out.println(Message.INPUT_RANGE + min + " to " + max);
        return -1;
    }
}