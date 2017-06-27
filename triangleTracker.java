import java.io.Console;

public class triangleTracker {
  public static void main(String[] args){

  Console myConsole = System.console();
  //get side one
  System.out.println("Enter a length for side1");
  int side1 = Integer.parseInt(myConsole.readLine());
  //get side two
  System.out.println("Enter a length for side2");
  int side2 = Integer.parseInt(myConsole.readLine());
  //get side three
  System.out.println("Enter a length for side3");
  int side3 = Integer.parseInt(myConsole.readLine());

  Triangle myTri = new Triangle(side1,side2,side3);
  System.out.println("Your triangle is ");
  System.out.println(myTri.type());
  }
}
