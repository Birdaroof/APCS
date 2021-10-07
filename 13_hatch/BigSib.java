/*
Zooming Xippy Zookeepers; Chompsky, Duck, Mr.Swag
APCS
HW 13- What Are Big Sibs Good For?
Discoveries
- Constructors do not have a return value
- Constructors make it so that each new instance of the class BigSib will have the same default HelloMsg.
- However this default value can still be changed and be different for each different object.
-
QCC
- Can constructors have different default values (with an if statement or something like that)?
*/
public class BigSib {
	String setHelloMsg;
	public BigSib(){
		setHelloMsg = "Hello";
	}
	public void hold(String str){
		String setHelloMsg = str;
	}
	public String greet(String str){
	  return (setHelloMsg + " " + str);
	}
/*	public String setHelloMsg(String str){
		setHelloMsg = str;
		return setHelloMsg;
	}
*/
}
