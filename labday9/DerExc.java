package labday9;


class Derived extends Base1 {

	    Derived() throws CloneNotSupportedException, RuntimeException {
//	    	try { 
//	    	     super(); 
//	    	   } catch (CloneNotSupportedException e) {
//	    	     System.out.println("We have indeed caught an exception from the "+
//	    	          "base-class constructor! The book was wrong!");
	    	//   }
	    }

	    public static void main(String[] args) {
	        try {
	            Derived d = new Derived();
	        }
	        catch(CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        catch(RuntimeException re){}
	    }
	}
		class Base1 {
		    Base1() throws CloneNotSupportedException {
		        throw new CloneNotSupportedException();
		    }
		}