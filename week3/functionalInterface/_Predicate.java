package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String phoneNumber = "07000000000";

        //Whithout Predicate
        System.out.println(isPhoneNumberValid(phoneNumber));

        //With predicate
        System.out.println(isPhoneNValid.test(phoneNumber));

        //Encadenando predicados
        System.out.println(isPhoneNValid.and(contains3).test(phoneNumber));
    }

    static Predicate<String> isPhoneNValid =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> contains3 =
            phoneNumber -> phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
