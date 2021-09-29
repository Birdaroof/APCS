public class methods {
  public static boolean isDivisble (int n, int m){
    if (n % m == 0) {
      System.out.println("The number " + n + " is divisble by " + m);
      return true;
    }
    return false;
  }
  public static boolean isTriangle (int x, int y, int z){
    return x + y > z && y + z > x && x + z > y;
  }
  public static int ack (int x, int y){
    if (x == 0){
      return y + 1;
    }
    else if (x >0 && y == 0){
      return ack(x-1,1);
    }
    else {
      return ack(x-1,ack(x,y-1));
    }
  }
  public static void main (Strings[] args){
    System.out.println(isDivisble(4,2));
    System.out.println(isTriangle(1,2,3));
    System.out.println(ack(2,0));
  }
}
