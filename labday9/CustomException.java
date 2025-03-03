package labday9;


public class CustomException { 
    
    public static void main(String args[]){ 
    	
        try
        { 
            throw new MyException("My New Custom Exception Caught"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
} 

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 