package labday9;

public class prblm2 {

	public static void main(String[] args) {
		
		CalcAreaImpl ar = new CalcAreaImpl();
		CalcVolumeImpl vol = new CalcVolumeImpl();
		
		
	}
	
}


interface CalcArea{
	public void circle(int r);
	public void triangle(int a,int b,int c);
	public void square(int a);	
}

class CalcAreaImpl implements CalcArea{

	@Override
	public void circle(int r) {
		int e = r*r;
		System.out.println("AreaofCircle"+e);
		
	}

	@Override
	public void triangle(int a, int b, int c) {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		System.out.println("AreaofCircle"+area);
		
	}

	@Override
	public void square(int a) {
		int e = a*a;
		System.out.println("AreaofSquare"+e);
		
	}
	
}

interface CalcVolume{
	
	public void sphere(int r);
	public void cuboid(int a);
	
}

class CalcVolumeImpl implements CalcVolume{
	
	@Override
	public void sphere(int r) {
		
		double res = (4/3)*(22/7)*Math.pow(r, 3);
		System.out.println("VolumeOfSphere"+res);
		
	}
	@Override
	public void cuboid(int a) {
		double res = a*a*a;
		System.out.println("VolumeOfCuboid"+res);
		
	}
}