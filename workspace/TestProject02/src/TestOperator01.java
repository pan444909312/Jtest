/**
 * ���������
 * @author �˾���
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		long d = 4;
		/**
		 * �������㣺
		����1. ���������������һ��ΪLong, ����ҲΪlong��
		����2. û��longʱ�����Ϊint����ʹ������ȫΪshort��byte�����Ҳ��int��	
		 */
	//	short c =  a + b;
	//	short c = b + b;
	//	int e = a + d;
		/**
		 * �������㣺
��		��3. ���������������һ��Ϊdouble������Ϊdouble��
��		��4. ֻ����������������float��������Ϊfloat��	
		 */
		float f1 = a+ d;      //a ��d ���ķ�Χ��long ��float��ȡֵ��Χ��long�󣬿����Զ�ת������
//		float f2 = d + 1.0;    //����ĳ���Ϊdouble����
		float f3 = 1.2F;
		float f4 = f1 + f3; 

		System.out.println(7%3);     //�����������ź���߲�������ͬ
		System.out.println(-7%3);
		System.out.println(7%-3);
		
		
		int q = 3;
		int p = q++;   //ִ�����,b=3���ȸ�b��ֵ����������
		System.out.println("q="+q+"\np="+p);
		q = 3;
		p = ++p;   //ִ�����,c=5��a���������ٸ�c��ֵ
		System.out.println("p="+p+"\np="+p);
	}
}
