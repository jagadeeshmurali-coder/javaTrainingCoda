package labday9;

public class DivExc {


	
}

class divide{
	public void checkInputs(int n,int d) throws arithExc {
		try {
			if(d==0) {
				throw new arithExc("divide by zero not permitted");
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
class arithExc extends Exception{
	String msg;
	public arithExc(String msg) {
		this.msg = msg;
	}
	@Override
    public String toString()
    {
    	return msg;
    }
}