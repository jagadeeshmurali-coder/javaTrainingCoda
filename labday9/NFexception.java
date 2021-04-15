package labday9;

import java.util.Scanner;

public class NFexception {
	
	public static void main(String args[])
	   {
		int[] arr = new int[20];
		int n,avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers to calculate avg");
		
		while(true)  {    
			try{
		      for(int i=0;i<10;i++) {
		    	  n=Integer.parseInt(scan.next());
		    	  try {
					if(n<0) {throw new NegExc("number shouldnt be negative");}
					if(n>100){throw new Range("number shouldnt be higher than 100");}
				} catch (NegExc | Range e) {
					System.out.println(e);
				}
		    	  
		    	  avg=avg+n;
		    	  //System.out.println(avg);
		    	  arr[i]=n;
//		    	  System.out.println(arr[i]);
//		    	  System.out.println(i);
		    	  if(i==10)break;
		      } 
		      double res = avg/10;
		      System.out.println(res);
	      }
	        catch(NumberFormatException e){
	        	System.out.println("Number format exception occurred");	        	
	       }} 
	   }

}


class NegExc extends Exception{
	String errorMessage;
	 
    public NegExc(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString()
    {
    	return errorMessage;
    }
        
}

class Range extends Exception{
	String errorMessage;
	 
    public Range(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString()
    {
    	return errorMessage;
    }
        
}