import java.util.Scanner;

/**
 * �ڶ��� ��ҵ3
 * @author pjx
 *
 */
public class EncryptData {

	public int Encrypt(int data) {
		
		int a[] = new int[4];
		int num = 0;
		int temp = 1000;
		int j = 0;
		
		for(int i=0;i<4;i++) {
			
			num = data/temp;
			a[i] = (num+5)%10 ;
			data = data-(temp*num);
			temp = temp/10 ;
			System.out.println(a[i]);

		}
		//ʵ�ֵ�һλ�͵���λ�������ڶ�λ�͵���λ����
		j = a[0];
		a[0] = a[3];
		a[3] = j;
		j = a[1];
		a[1] = a[2];
		a[2] = j;
		for(int i=0,k=1000;i<4;i++) {   
			
			data = a[i]*k + data;
			k = k/10;
			
		}
		
		System.out.println("���ܺ������Ϊ:"+data);
		
		return 0 ;
	}
	

	
	public static void main(String[] args) {
		
		int data = 0;  //���ܵ����� 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������һ��4λ��������");
		data = scanner.nextInt();
		
		EncryptData encryptData = new EncryptData();
		encryptData.Encrypt(data);
	}

}
