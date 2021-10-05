/*
Zooming Xippy Zookeepers + Mr.Swag, Duck, and Chompsky
APCS
HW 09- What Are Big Sibs Good For?
*/
public class Greet {
	public static void main(String[] args) {
		BigSib.greet("Anthony");
		BigSib.greet("Kevin");
		BigSib.greet("Jomin");
	}
}

/*
Notes
- As long as the class is static you can call methods from other files if they're in the same directory
- I think BigSib.greet is referencing the BigSib class and within the BigSib class is a method known as greet which is then invoked with the given argument.
*/
