/**
Jomin Zhang
APCS
HW# 27 - FOR the Love of Strings
2021-10-28
Time Spent: 0.8 hours
DISCO -
- The String.substring() can either take one integer which indicates the starting index or it can take two integers with the first being the starting index and the second being the ending index
- The second integer in the String.substring() is exclusive
QCC -
- When do you use a while loop or a for loop and how do you decide?
- What are the advantages and disadvantages of each?
**/
public class forrevstr {
  public static String fenceF(int posts){
    String fence = "|";
    for (int i = 1; i < posts; i ++){
      fence += "--|";
    }
    return fence;
  }
  public static String reverseF(String s){
    int length = s.length() - 1;
    String reverse = "";
    for (int count = length; count >= 0; count--){
      reverse += s.substring(count,count+1);
    }
    return reverse;
  }
  public static String reverseR(String s){
    if (s.length() == 1){
      return s;
    }
    else {
      return s.substring(s.length() - 1, s.length()) + reverseR(s.substring(0, s.length() - 1));
    }
  }
  public static void main (String[] args){
    System.out.println(fenceF(1));
    System.out.println(fenceF(2));
    System.out.println(fenceF(3));
    System.out.println(reverseF("Hello"));
    System.out.println(reverseR("Goodbye"));
  }
}
