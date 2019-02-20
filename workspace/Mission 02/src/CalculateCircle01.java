import java.util.Scanner;

/**
 * 计算圆的周长和面积
 * @author pjx
 *
 */
public class CalculateCircle01 {
	public static void main(String[] args) {
		final double PI = 3.14;
		double r = 0;   
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		r = scanner.nextDouble();
		
		double area = r*r*PI;  //面积
		double circumference = 2*r*PI; //周长
		
		System.out.printf("面积=%.2f\n",area);    //%.2f 表示小数点保留2位 %f用来输出浮点型
		System.out.printf("周长=%.2f\n",circumference);
		
		
	}
}
