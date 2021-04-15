package labday9;

public class Sample {
	
		
		public void mth1(){
			mth2(); 
			System.out.println("caller");
			}
		public void mth2(){
			try{
				//throw new ArithmeticException();
				System.exit(0);
		}
			catch(Exception e){
				System.out.println("catch-meth2");
		}
	 finally{
		 System.out.println("finally meth2");
		 }
	 }
	 public static void main(String p[]){
		Sample s=new Sample(); 
		 s.mth1();
		 }
	 }

