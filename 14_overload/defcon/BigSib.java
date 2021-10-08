public class BigSib {
	String setHelloMsg;
	public BigSib(){
		setHelloMsg = "Hello";
	}
	public String greet(String str){
	  return (setHelloMsg + " " + str);
	}
	public String setHelloMsg(String str){
		setHelloMsg = str;
		return setHelloMsg;
	}
}
