public class array {
  public static double[] powArray(double[] a, int x){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++){
      b[i] = Math.pow(a[i],x);
      System.out.println(b[i]);
    }
    return b;
  }
  public static int indexOfMax(int[] a){
    int biggest = a[0];
    int index = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] > biggest){
        biggest = a[i];
        index = i;
      }
    }
    System.out.println(index);
    return index;
  }
  public static void main (String[] args){
    double[] kekArray = powArray(new double[]{1,2,4},3);
    indexOfMax(new int[]{1,3,7,2});
  }
}
