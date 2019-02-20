/**
 * 测试常量
 * 常量定义规范， 英文全部大写，使用'_'间隔
 * @author 潘炬翔
 *
 */
public class TestConstant {
	public static void main(String[] args) {
		final double PI = 3.14;    //常量定义 ，在 定义变量前面加 final
		// PI = 3.15          // 常量不能再被赋值
		double r = 4;
		double circle = PI*r*2;
		double area = PI*r*r;
		System.out.println("circle = " + circle);
		System.out.println("area = " + area);
	}
}
