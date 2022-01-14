import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.nio.charset.Charset;


public class excercise36_37_38_39_40_41{
  public static void main(String args[]){

    //Excercise 36
    Scanner scan = new Scanner(System.in);
    /*
    System.out.println("Input the latitude of coordinate 1:");
    double lat1 = scan.nextDouble();
    System.out.println("Input the longitude of coordinate 1:");
    double long1 = scan.nextDouble();
    System.out.println("Input the latitude of coordinate 2:");
    double lat2 = scan.nextDouble();
    System.out.println("Input the longitude of coordinate 2:");
    double long2 = scan.nextDouble();
    double earthRadius = 6371.01;

    double area = earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));

    System.out.println("Input the longitude of coordinate 2:" + area + " km");
    */

    //Excercise 37
    String phrase = scan.nextLine();
    int phraseLength = phrase.length() - 1;
    char[] aux = new char[phrase.length()];

    for (int i = 0; i < phrase.length(); i++) {
        aux[i] = phrase.charAt(i);
    }

    while(phraseLength >= 0){
        System.out.print(aux[phraseLength--]);
    }

    //Excercise 38
    String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
    char[] charsOfTest = test.toCharArray();
    int digits = 0;
    int letter = 0;
    int space = 0;
    int other = 0;

    for(int i = 0; i < test.length(); i++){
      if (Character.isDigit(charsOfTest[i])){
        digits++;
      }else if (Character.isLetter(charsOfTest[i])){
        letter++;
      }else if (Character.isSpace(charsOfTest[i])){
        space++;
      }else {
        other++;
      }
    }

    System.out.println("The String is: " + test);
    System.out.println("Total numbers: " + digits);
    System.out.println("Total letters: " + letter);
    System.out.println("Total spaces: " + space);
    System.out.println("other: " + other);

    //Excercise 39

    int counter = 0;

    for(int primerNum = 1; primerNum <= 4; primerNum++){
      for(int segundoNum = 1; segundoNum <= 4; segundoNum++){
        for(int tercerNum = 1; tercerNum <= 4; tercerNum++){
          if (primerNum != segundoNum && segundoNum != tercerNum && primerNum != tercerNum){
            counter++;
            System.out.println(primerNum + "" + segundoNum + "" +  tercerNum);
          }
        }
      }
    }

    System.out.println("La cantidad de combinaciones es: " + counter);

    //Excercise 40
    Set<String> available = Charset.availableCharsets().keySet();

    for(String element : available){
      System.out.println(element);
    }

    //Excercise 41
    char[] toASCII = scan.nextLine().toCharArray();
    char toConvert = toASCII[0];
    int ASCIIConverted = toConvert;

    System.out.println(ASCIIConverted);

  }

}
