
public class SumFormer {
	
	static int add(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==0) {
			return 0;
		}
		else {
			return add(n-1)+add(n-2);
		}
	}
	
	public static void main(String[] args) {

		int sum = 0;
		sum =add(6);   //求第几个数的值
		
		System.out.println(sum);
		
	}

}
