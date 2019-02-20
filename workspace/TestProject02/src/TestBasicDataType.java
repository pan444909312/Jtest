/**
 * �������ͺ͸�����
 * @author �˾���
 *
 */

import java.math.*;

public class TestBasicDataType {
	public static void main(String[] args) {
		
		int tenUp=10;
		int eightUp=010;          //0��ͷ�ǰ˽���
		int sixteenUp=0x10;       //0x��ͷ��ʮ������
		int twoUp=0b10;           //0b��ͷ�Ƕ�����
		
		System.out.println(tenUp);
		System.out.println(eightUp);
		System.out.println(sixteenUp);
		System.out.println(twoUp);
		
		
		byte salary = -128;        
//		byte salary = 128;        //byte��Χ�� -2^7 ~ (2^7)-1         byte 1�ֽڣ�8λ ��2^8�������� ������һ��
		int population = 2000000000;  //���ͳ���Ĭ��Ϊint���ͣ� -2^31 ~ (2^31)-1
//		long gobalPopulation = 3000000000;
		long gobalSalary = 3000000000L;  //�����"L"�� "l" ����long�ͳ���
		
//		float a = 3.14;  //����ĳ���Ĭ��Ϊdouble���ͣ�����Ҫת������
		float c = 3.14F;
		double b = 6.28;
		double d = 628e2; // E2��ʾ 10^2
		double e = 628E-2; 
		System.out.println(e + " \t" + d);
		
		// ����������ȷ��ǧ��Ҫ���ڱȽϣ�������Ҫ�Ƚ���ʹ��BigDecimal��
		
		float d1 = 423432423f;
		float d2 = d1+1;
		if(d1==d2){
		   System.out.println("d1==d2");//������Ϊd1==d2
		}else{
		    System.out.println("d1!=d2");
		} 
		    
		double f = 1-0.1-0.1-0.1-0.1-0.1;
        BigDecimal bd1 = BigDecimal.valueOf(1.0);
        bd1 = bd1.subtract(BigDecimal.valueOf(0.1));
        bd1 = bd1.subtract(BigDecimal.valueOf(0.1));
        bd1 = bd1.subtract(BigDecimal.valueOf(0.1));
        bd1 = bd1.subtract(BigDecimal.valueOf(0.1));
        bd1 = bd1.subtract(BigDecimal.valueOf(0.1));
		System.out.println("#####################");      
		System.out.println(f);
		System.out.println(bd1);
		System.out.println("#####################");	

		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));  //�Ƚ�С�� ʹ��BigDecimal��


	}
}
