public class Main {
    private static final String[] valid = {"(84)-(0978489648)", "(74)-(0666666666)", "(84)-(0111111111)"};
    private static final String[] invalid = {"(a4)-(0978489648)", "(74)-(8666666666)", "(&4)-(b111111111)"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        boolean isValid;

        for (String phoneNumber : valid){
            isValid = validatePhoneNumber.isValidatePhoneNumber(phoneNumber);
            System.out.println("Phone number: "+phoneNumber+" is valid: "+isValid);
        }
        System.out.println("-------------");
        for (String phoneNumber : invalid){
            isValid = validatePhoneNumber.isValidatePhoneNumber(phoneNumber);
            System.out.println("Phone number: "+phoneNumber+" is valid: "+isValid);
        }
    }
}