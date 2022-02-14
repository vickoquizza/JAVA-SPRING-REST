package Topic3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PassWordCracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> passwords;
        String passwordAttempt;

        System.out.println("passwords");
        passwords = Arrays.asList(scan.nextLine().toLowerCase().split("\\s+"));
        System.out.println("Password attempt");
        passwordAttempt = scan.nextLine().toLowerCase();

        List<String> coincidences = passWordCracker(passwords, passwordAttempt);

        String coincidencesString  = coincidences.stream().collect(Collectors.joining(" "));

        if (passwords.stream().allMatch(password -> coincidences.contains(password))){
            System.out.println(coincidencesString);
        }else{
            System.out.println("WRONG PASSWORD");
        }



    }

   static List<String> passWordCracker(List<String> passwords, String passwordAttempt){
       return passwords.stream()
               .filter(passwordAttempt::startsWith)
               .flatMap(password -> Stream.concat(Stream.of(password), passWordCracker(passwords, passwordAttempt.substring(password.length())).stream()))
               .collect(Collectors.toList());
    }


}