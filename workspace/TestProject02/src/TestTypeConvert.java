/**
 * ����ת��
 * @author admin
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		//����С������ת���� ������ʾ�ܱ�ʾ������
		int a = 123;
		long b = a;
		double d = b;
		// a = b;
		// long e = 3.33f;
		float g = 5216165l;
		
		//���� int תshort �� byte ��ֻҪ��byte��short������Χ ����ת��
		byte h = 123;
		short k = 44;
		
		double d1 = 3.99;
		int a1 = (int)d1;  //ǿ��ת������С������
		System.out.println(a1);
		
		char c1 = 'a';
		int a2 = c1 + 1;
		System.out.println(a2);
		System.out.println((char)a2);
		
		//ת������Խ��
		int t1 = 1000000000;
		int t2 = 20;
		int t3 = t1*t2;  //int Խ���� ���Ϊ21�ڶ�
		long t4 = t1*t2;   //��Ȼ��������Ϊlong��������t1*t2��ʱ�� int�Ѿ�Խ����
		long t5 = 1L*t1*t2;
		System.out.println(t3); 
		System.out.println(t4);
		System.out.println(t5);
		
	}
}
