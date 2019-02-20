/**
 * ²âÊÔµÝ¹éº¯Êý
 * @author admin
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		
		TestLoop tl = new TestLoop();
		tl.multiplicationTable();
		
	}
	 static long Factorial(int n) {
		 
		 if(n==1) {
			 return 1;
		 }
		 else {
			 return Factorial(n-1)*n;
		 }
	 }
	

}
