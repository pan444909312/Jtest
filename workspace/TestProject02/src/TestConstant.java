/**
 * ���Գ���
 * ��������淶�� Ӣ��ȫ����д��ʹ��'_'���
 * @author �˾���
 *
 */
public class TestConstant {
	public static void main(String[] args) {
		final double PI = 3.14;    //�������� ���� �������ǰ��� final
		// PI = 3.15          // ���������ٱ���ֵ
		double r = 4;
		double circle = PI*r*2;
		double area = PI*r*r;
		System.out.println("circle = " + circle);
		System.out.println("area = " + area);
	}
}
