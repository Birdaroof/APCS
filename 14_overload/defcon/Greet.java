/*
Zooming Xippy Zookeepers; Chompsky, Duck, Mr.Swag
APCS
HW 14 - What Are Big Sibs Good For?
Notes 
- Default Constructors don't use parameters and don't take in any arguments
- Each new object created with the default constructor has the same default value
QCC
- Can one class file have multiple different constructors?

*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    //richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib daniel = new BigSib();
    //daniel.setHelloMsg("Salutations");

    greeting = daniel.greet("Dr.Spaceman");
    System.out.println(greeting);

    BigSib nick = new BigSib();
    //nick.setHelloMsg("Hey ya");

    greeting = nick.greet("King Fooey");
    System.out.println(greeting);

    BigSib david = new BigSib();
    //david.setHelloMsg("sup");

    greeting = david.greet("mom");
    System.out.println(greeting);
  } //end main()
} //end Greet


