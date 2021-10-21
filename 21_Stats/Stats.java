/**
  Heroes of the Zeroes - Jomin Zhang, Nafiz Labib, Jing Yi Feng
  APCS
  HW 21 - STAtisTically Speaking
  2021-10-20
  Disco -
  - Java gave an error with type conversion for sqrt and cbrt functions. Everything else worked without typecasting.
  - In testing with StatsDriver, the geoMean function returned zero for the sqrt of negative numbers
  QCC -
  -  How would you return an int from sqrt and cbrt functions without typecasting?
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


  //main method for testing functionality
  public static void main( String[] args ) {
    System.out.println("Test pass");
  }

}//end class
