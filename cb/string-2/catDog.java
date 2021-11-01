/**
Jomin Zhang
APCS
HW28 -- Coding Bat
2021-11-1

Return true if the string "cat" and "dog" appear the same number of times in the given string.

**/
public class catDog{
  public boolean catDog(String str) {
    int catCount = 0;
    int dogCount = 0;
    for (int i = 0; i < str.length()-2; i ++){
      if (str.substring(i,i+3).equals("cat")){
        catCount += 1;
      }
      else if (str.substring(i,i+3).equals("dog")){
        dogCount += 1;
      }
    }
    return catCount == dogCount;
  }
  public static void main(String[] args){
    System.out.println(catDog("catdog")); // -> "true"
    System.out.println(catDog("catcat")); // -> "false"
    System.out.println(catDog("1cat1cadodog")); // -> "true"
    System.out.println(catDog("catcat")); // -> "true"
  }
}
