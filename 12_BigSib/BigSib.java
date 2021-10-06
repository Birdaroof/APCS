/*
Zooming Xippy Zookeepers; Chompsky, Duck, Mr.Swag
APCS
HW 12- What Are Big Sibs Good For?
*/
public class BigSib {
	String setHelloMsg;
	public void hold(String str){
		String setHelloMsg = str;
	}
	public String greet(String str){
	  return (setHelloMsg + " " + str + "\n" + "Salutations Dr. Spaceman \nHey ya Kong Fooey \nSup mom");
	}
	public String setHelloMsg(String str){
		setHelloMsg = str;
		return setHelloMsg;
	}

}
