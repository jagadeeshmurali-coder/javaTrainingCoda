package pack1;

public class LargestNeg {

	public static void main(String[] args) {
		int[] arr = {8,9,-2,-5,-7,5};
		int max=-100,c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				c++;
				if(arr[i]>max) {max=arr[i];}
			}
		}
		if(c==0) {System.out.println("-1");}
		else {System.out.println(max);}
//		System.out.println(Math.max(Math.max(<0)));
	}
	
}
