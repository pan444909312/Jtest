import java.util.Scanner;

/**
 * ����Բ���ܳ������
 * @author pjx
 *
 */
public class CalculateCircle02 {
	final double PI = 3.14; //���峣��
	
	
	/**
	 * �����ܳ�
	 * @param r  ����뾶
	 * @return   �����ܳ�
	 */
	public double circumference(double r) {
		
		double c1;
		c1 = r*2*PI;
		return c1;
		
	}
	
	/**
	 * �������
	 * @param r   ����뾶
	 * @return    �������
	 */
	public double area(double r){
		
		double area;
		area = r*r*PI;
		return area;
		
	}
	
	

	public static void main(String[] args) {
		
		double r = 0; //�뾶
		double circumference = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ������Բ���ܳ��������С����");
		System.out.println("������Բ�İ뾶��");
		r = scanner.nextDouble();
		
		CalculateCircle02 calculate = new CalculateCircle02();
		
		circumference = calculate.circumference(r);
		area = calculate.area(r);
		
		System.out.printf("Բ���ܳ�Ϊ%.2f\n",circumference);
		System.out.printf("԰�����Ϊ%.2f\n",area);
		
		
	}
}
