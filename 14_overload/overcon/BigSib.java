public class BigSib {
	String setHelloMsg;
	public BigSib(String msg){
		setHelloMsg = msg;
	}
	public String greet(String str){
	  return (setHelloMsg + " " + str);
	}
	public String setHelloMsg(String str){
		setHelloMsg = str;
		return setHelloMsg;
	}
}
