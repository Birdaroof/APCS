/***
Heroes of the Zeroes - Nafiz Labib, Jing Yi Feng, Jomin Zhang
APCS
HW 29 - Which Way Do You Roll?
2021-11-02
Time Spent: ~ 1 hour
DISCO -
- To use command line for this program, you enter "java Commafier <integer number of your choice>" once compiling is successful
- parseInt is for converting integer values to String.
QCC -
- I've heard about something called scanner that can be used in place of the foreach loop (I think) to take values in command line. Can it be used here, and if so, how? (Not related to curriculum so far, just asking.)
***/

public class Commafier{
  public static String commafyF(int n){
    String numStr = Integer.toString(n);
    String commaStr = "";
    if (numStr.length() <= 3){
      return numStr;
    }
    else {
      for (int i = numStr.length()-1; i >0; i -= 1){
          commaStr = numStr.substring(i,i+1) + commaStr;
          if (i % 3 == numStr.length()%3){
            commaStr = "," + commaStr;
          }
      }
    }
    commaStr = numStr.substring(0,1) + commaStr;
    return commaStr;
  }
  public static String commafyR(int n){
    String numStr = Integer.toString(n);
    if (numStr.length() <= 3){
      return numStr;
    }
    String end = numStr.substring(numStr.length()-3,numStr.length());
    int beginning = n/1000;
    return commafyR(beginning) + "," + end;
  }
  public static void main(String[] args){
    for (String arg: args){
      int intArg = Integer.parseInt(arg);
      System.out.println(commafyR(intArg));
    }
    /**
      // Testing commafyF
    System.out.println(commafyF(123));
    System.out.println(commafyF(1234));
    System.out.println(commafyF(12345));
    System.out.println(commafyF(123456));
    System.out.println(commafyF(1234567));
      // Testing commafyR
    System.out.println(commafyR(123));
    System.out.println(commafyR(1234));
    System.out.println(commafyR(12345));
    System.out.println(commafyR(123456));
    System.out.println(commafyR(1234567));
    **/
  }
}
