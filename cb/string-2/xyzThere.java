/**
Jomin Zhang
APCS
HW28 -- Coding Bat
2021-11-1

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

**/


public class xyzThere{  
  public boolean xyzThere(String str) {
    int xyzCount = 0;
    for (int i = 0; i < str.length()-2; i++){
      if (str.substring(i,i+3).equals("xyz")){
        if (i > 0){
          if (str.substring(i-1,i).equals(".")){
          }
          else {
            xyzCount += 1;
          }
        }
        else{
          xyzCount += 1;
        }
      }
    }
    if (xyzCount >= 1){
      return true;
    }
    else {
      return false;
    }
  }
  public static void main(String[] args){
    System.out.println(xyzThere("abcxyz")); // → true
    System.out.println(xyzThere("abc.xyz")); //  → false
    System.out.println(xyzThere("xyz.abc")); // → true
  }
}
