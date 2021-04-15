package labday9;

public class prblm3 {
	
	public static void main(String[] args) {
		Impl p = new Impl();
	    //i.meth1(i);
	}

}
interface dog{
	public void barks();
	public void bites();
}
interface cat{
	public void meaws();
	public void walks();
}
interface ant{
	public void runs();
	public void sleeps();
}
interface animal extends dog,cat,ant{
	public void anMethod();
}
abstract class Wild implements animal{
	
}
//public interface dummy{
//	public void d1();
//	public void d2();
//	public void d3();
//}
 class Impl extends Wild{
	
	public void meth1(dog d) {
		System.out.println("dog interface");
	}
	public void meth2(cat c) {
		System.out.println("cat interface");
	}
	public void meth3(ant a) {
		System.out.println("ant interface");
	}
	public void meth(animal an) {
		System.out.println("end interface");
	}
	@Override
	public void anMethod() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void barks() {
		System.out.println("i bark");
		
	}
	@Override
	public void bites() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void meaws() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walks() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void runs() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		
	}
}