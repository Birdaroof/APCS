import java.util.Scanner;

public class CtoF {
  public static void main (String[] args){
    System.out.print("Celcius: ");
    double c ;
    Scanner in = new Scanner(System.in);
    c = in.nextDouble();
    double f = c * 9 / 5 + 32;
    System.out.printf("%.1f C = %.1f F", c, f);
  }
}
