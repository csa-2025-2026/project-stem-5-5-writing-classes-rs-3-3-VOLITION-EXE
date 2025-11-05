import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner N = new Scanner(System.in);
    boolean isOn = true;
    /*
    String Firstname;
    String Lastname;
    int Age;
    int SSN;
    System.out.println("Enter the person's first name:");
    Firstname = N.nextLine();
    System.out.println("Enter the person's last name:");
    Lastname = N.nextLine();

    System.out.println("Enter the person's age:");
    Age = N.nextInt();

    System.out.println("Enter the person's social security number:");
    SSN = N.nextInt();

    Person p = new Person(Firstname, Lastname, Age, SSN);
    p.print();
    */
    Oven O = new Oven(450, 70);
    System.out.println("Maximum oven temperature:\n"+O.getMaxTemp());
    System.out.println("Starting temperature of the oven:\n"+O.getCurrentTemp());
    while(isOn){
      System.out.println(O.toString());
      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\"");
      switch(N.nextLine()){
        case "p":
          O.preheat(N.nextInt());
          break;
        case "o":
          O.turnOff();
          break;
        case "r":
          O.preheat(70);
          break;
        case "q":
          isOn = false;
          break;
      }
    }
    
  }
}
