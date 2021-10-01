/* 
Jomin Zhang
APCS
HW 08- Greet Function
*/
public class Greet {
	public static void main(String[] args) {
		greet("Anthony");
		greet("Kevin");
		greet("Jomin");
	}
	public static void greet(String str){
		System.out.println("Why, hello there, " + str + ". How do you do?" );
	}
}
/*
Notes
- You can call functions within functions
- The same function can be called multiple times with different variables.
*/
