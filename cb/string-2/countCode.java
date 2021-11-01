/**
Jomin Zhang
APCS
HW28 -- Coding Bat
2021-11-1

Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

**/
public class countCode{
  public int countCode(String str) {
    int codeCount = 0;
    for (int i = 0; i < str.length()-3;i++){
      if (str.substring(i,i+2).equals("co")){
        if (str.substring(i+3,i+4).equals("e")){
          codeCount += 1;
        }
      }
    }
    return codeCount;
  }
  public static void main(String[] args){
    System.out.println(countCode("aaacodebbb")); // → 1
    System.out.println(countCode("codexxcode")); // → 2
    System.out.println(countCode("cozexxcope")); // → 2
  }
}
