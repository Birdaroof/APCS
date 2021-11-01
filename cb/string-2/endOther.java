/**
Jomin Zhang
APCS
HW28 -- Coding Bat
2021-11-1

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

**/

public class endOther{
  public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() >= b.length()){
      return (a.substring(a.length()-b.length()).equals(b.substring(0)));
    }
    else {
      return (b.substring(b.length()-a.length()).equals(a.substring(0)));
    }
  }
  public static void main(String[] args){
    System.out.println(endOther("Hiabc", "abc")); // → true
    System.out.println(endOther("AbC", "HiaBc")); // → true
    System.out.println(endOther("abc", "abXabc")); // → true
    System.out.println(endOther("Hiabc", "abc")); // → true
  }
}
