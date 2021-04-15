package labday9;

public class Employee {
	
	abstract class Sales {

	}
	
	abstract class Prod {

	}
	
	public class SalesPerson extends Sales{
		
	}

	public class SalesManager extends SalesPerson{
		
	}
	
	public class SalesTerritory extends SalesManager{
		
	}
	
	public class Manager extends SalesTerritory{
		
	}
	
    public class Worker extends Prod{
		
	}
	
}
