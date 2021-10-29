/**
  Heroes of the Zeroes - Jomin Zhang, Nafiz Labib, Jing Yi Feng
  APCS
  HW 26 - GCD Three Ways
  2021-10-28
  Time Spent - .5 hours
  Disco -
  - If else statements have to be used in gcdEW since the larger number is getting replaced by the difference between the larger and smaller number, meaning that Java has to be able to check which is the new larger number
  QCC -
  -  Is the recursive or while loop faster?
  - In what scenarios is each more practical/ more efficient?
 **/

 // Skeleton taken from closet

public class Stats {

  public static int mean(int a, int b) {
    return (a + b) / 2;
  }

  public static double mean(double a, double b) {
    return (a + b) / 2;
  }

  public static int max(int a, int b) {
    if (a >= b){
      return a;
    }
    else {
      return b;
    }
  }

  public static double max(double a, double b) {
    if (a >= b){
      return a;
    }
    else {
      return b;
    }
  }

  public static int geoMean(int a, int b) {
    return (int) Math.sqrt(a * b);
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a * b);
  }

  public static int max(int a, int b, int c) {
    if (a >= b){
      if (a >= c){
        return a;
      }
      else {
        return c;
      }
    }
    else {
      if (b >= c){
        return b;
      }
      else {
        return c;
      }
    }
  }

  public static double max(double a, double b, double c) {
    if (a >= b){
      if (a >= c){
        return a;
      }
      else {
        return c;
      }
    }
    else {
      if (b >= c){
        return b;
      }
      else {
        return c;
      }
    }
  }

  public static int geoMean(int a, int b, int c) {
    return (int) Math.cbrt(a*b*c);
  }

  public static double geoMean(double a, double b, double c) {
    return Math.cbrt(a*b*c);
  }
  public static int gcd(int a, int b){
    int counter = 0;
    int gcd = 0;
    if (a > b){
      while (counter < b){
        counter += 1;
        if ((a % counter == 0) && (b % counter == 0)){
          gcd = counter;
        }
      }
    }
    else {
      while (counter < a){
        counter += 1;
        if ((a % counter == 0) && (b % counter == 0)){
          gcd = counter;
        }
      }
    }
    return gcd;
  }

  public static int gcdER(int a, int b){
    if (a >= b){
      if (b != 0){
        return gcdER(b, a % b);
      }
      else {
        return a;
      }
    }
    else {
      if (a != 0){
        return gcdER(a, b % a);
      }
      else {
        return b;
      }
    }
  }

  public static int gcdEW(int a, int b){
    while (a != b){
      if (a > b){
        a = a - b;
      }
      else {
        b = b - a ;
      }
    }
    return a;
  }


  //main method for testing functionality
  public static void main( String[] args ) {
    System.out.println(gcd(10,35));
    System.out.println(gcd(35,10));
    System.out.println(gcdER(10,35));
    System.out.println(gcdER(35,10));
    System.out.println(gcdEW(10,35));
    System.out.println(gcdEW(35,10));
  }

}//end class
