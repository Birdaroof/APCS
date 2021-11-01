/**
Jomin Zhang
APCS
HW28 -- Coding Bat
2021-11-1

Given a string, return a string where for every char in the original, there are two chars.

**/
public class doubleChar{
  public String doubleChar(String str) {
    String doubleStr = "";
    for (int i = 0; i < str.length(); i++){
      doubleStr += str.substring(i,i+1) + str.substring(i,i+1);
    }
  return doubleStr;
  }
  public static void main(String[] args){
    System.out.println(doubleChar("The")); // -> "TThhee"
    System.out.println(doubleChar("AAbb")); // -> "AAAAbbbb"
    System.out.println(doubleChar("Hi-There")); // -> "TThheerree"
  }
}
