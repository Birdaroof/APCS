/*
Zooming Xippy Zookeepers; Chompsky, Duck, Mr.Swag
APCS
HW 12 - What Are Big Sibs Good For?
*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib daniel = new BigSib();
    daniel.setHelloMsg("Salutations");

    greeting = daniel.greet("Dr.Spaceman");
    System.out.println(greeting);

    BigSib nick = new BigSib();
    nick.setHelloMsg("Hey ya");

    greeting = nick.greet("King Fooey");
    System.out.println(greeting);

    BigSib david = new BigSib();
    david.setHelloMsg("sup");

    greeting = david.greet("mom");
    System.out.println(greeting);
  } //end main()
} //end Greet

/*
Notes
- You can set an instance variable outside the method and then use a method to hold the value.
- This method can then be invoked to replace the value of the instance variable.
- The value of the instance variable can be unique between different "versions" of the same file.
*/
