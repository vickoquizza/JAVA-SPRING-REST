//Nested clases and how to define them


public class Manager extends Employee {
  public Manager() {
  }
  . . .
  public class DirectReports {
  . . .
  }
  }
// Meanwhile, in another method somewhere...
public static void main(String[] args) {
  Manager manager = new Manager();
  Manager.DirectReports dr = manager.new DirectReports();
}


//Inner static classes

public class Manager extends Employee {
  . . .
  public static class ManagerComparator implements Comparator<Manager> {
  . . .
  }
  }
// Meanwhile, in another method somewhere...
public static void main(String[] args) {
  Manager.ManagerComparator mc = new Manager.ManagerComparator();
  . . .
}
