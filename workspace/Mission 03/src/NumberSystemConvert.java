import java.util.Scanner;
/**
 * 进制的转换
 * @author pjx
 *
 */
public class NumberSystemConvert {
	
	/**
	 * 二进制转换
	 * @param n  传入的十进制
	 */
	static void binary(int n) {
		int[] a = new int[1000];
		int i = 0;
		
		for(i=0;n>=1;i++,n=n/2) {
			if(n%2==0) {
				a[i] = 0;
			}
			else {
				a[i] = 1;
			}

		}
		System.out.print("二进制:");
		for(i=i-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		

	}
	
	
	public static void main(String[] args) {
		
		int s = 1;
		System.out.println(5>>>1);
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("输入一个十进制:");
		num = scanner.nextInt();
		
		binary(num);
		
		
		System.out.println("\n#######################");
        int decimal;
        String Sbinary;
        int  binary;
 
        decimal = 0xF;
        Sbinary = Integer.toBinaryString(decimal);   //将传入的int类转换为二进制字符串
        //Sbinary = Integer.toOctalString(decimal);  //将传入的int类转换为八进制字符串
        //Sbinary = Integer.toHexString(decimal);    //将传入的int类转换为十六进制字符串
        System.out.println(Sbinary);
        binary  = Integer.parseInt(Sbinary);   //将string中的字符 转化为int类型  
        System.out.printf("二进制:%d",binary);

		
	}

}
