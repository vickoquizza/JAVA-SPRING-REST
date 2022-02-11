package Topic3;

import java.util.*;
import java.util.stream.Collectors;

public class PassWordCracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> passwords = new ArrayList<>();
        String passwordAttempt = "";

        System.out.println("passwords");
        passwords = Arrays.asList(scan.nextLine().toLowerCase().split("\\s+"));
        System.out.println("Password attempt");
        passwordAttempt = scan.nextLine().toLowerCase();

        String finalPasswordAttempt = passwordAttempt;


        




    }
}
