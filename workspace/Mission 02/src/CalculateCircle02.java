import java.util.Scanner;

/**
 * 计算圆的周长和面积
 * @author pjx
 *
 */
public class CalculateCircle02 {
	final double PI = 3.14; //定义常量
	
	
	/**
	 * 计算周长
	 * @param r  传入半径
	 * @return   返回周长
	 */
	public double circumference(double r) {
		
		double c1;
		c1 = r*2*PI;
		return c1;
		
	}
	
	/**
	 * 计算面积
	 * @param r   传入半径
	 * @return    返回面积
	 */
	public double area(double r){
		
		double area;
		area = r*r*PI;
		return area;
		
	}
	
	

	public static void main(String[] args) {
		
		double r = 0; //半径
		double circumference = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("这是一个计算圆的周长和面积的小程序");
		System.out.println("请输入圆的半径：");
		r = scanner.nextDouble();
		
		CalculateCircle02 calculate = new CalculateCircle02();
		
		circumference = calculate.circumference(r);
		area = calculate.area(r);
		
		System.out.printf("圆的周长为%.2f\n",circumference);
		System.out.printf("园的面积为%.2f\n",area);
		
		
	}
}
