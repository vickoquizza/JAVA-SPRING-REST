public class PrintLeapYears{
  public static void main(String args[]){
    final int firstYear = 999;
    final int lastYear = 2010;

    int counter = firstYear;
    while(counter <= lastYear){

      if (((counter % 4 == 0) && (counter % 100 != 0)) || (counter % 400 == 0)){
          System.out.println("LEAP YEAR FIND! is " + counter);
      }
      ++counter;
    }
  }
}
