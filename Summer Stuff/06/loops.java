public class loops {
  public static double power (double x, int y){
    int count = 1;
    double val = x;
    while (count < y){
      val = val * x;
      count = count + 1;
    }
    return val;
  }
  public static int factorial (int x){
    int count = x-1;
    int val = x;
    if (count <= 0){
      return 1;
    }
    while (count > 0){
      val = val * count;
      count = count - 1;
    }
    return val;
  }
  public static double myExp(double x, int y){
    
  }
  public static void main (String[] args){
    System.out.println(power(2,3));
    System.out.println(factorial(3));
  }
}
