import java.util.Scanner;

/**
 * ����Բ���ܳ������
 * @author pjx
 *
 */
public class CalculateCircle01 {
	public static void main(String[] args) {
		final double PI = 3.14;
		double r = 0;   
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		r = scanner.nextDouble();
		
		double area = r*r*PI;  //���
		double circumference = 2*r*PI; //�ܳ�
		
		System.out.printf("���=%.2f\n",area);    //%.2f ��ʾС���㱣��2λ %f�������������
		System.out.printf("�ܳ�=%.2f\n",circumference);
		
		
	}
}
