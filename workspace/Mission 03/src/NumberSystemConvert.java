import java.util.Scanner;
/**
 * ���Ƶ�ת��
 * @author pjx
 *
 */
public class NumberSystemConvert {
	
	/**
	 * ������ת��
	 * @param n  �����ʮ����
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
		System.out.print("������:");
		for(i=i-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		

	}
	
	
	public static void main(String[] args) {
		
		int s = 1;
		System.out.println(5>>>1);
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����һ��ʮ����:");
		num = scanner.nextInt();
		
		binary(num);
		
		
		System.out.println("\n#######################");
        int decimal;
        String Sbinary;
        int  binary;
 
        decimal = 0xF;
        Sbinary = Integer.toBinaryString(decimal);   //�������int��ת��Ϊ�������ַ���
        //Sbinary = Integer.toOctalString(decimal);  //�������int��ת��Ϊ�˽����ַ���
        //Sbinary = Integer.toHexString(decimal);    //�������int��ת��Ϊʮ�������ַ���
        System.out.println(Sbinary);
        binary  = Integer.parseInt(Sbinary);   //��string�е��ַ� ת��Ϊint����  
        System.out.printf("������:%d",binary);

		
	}

}
