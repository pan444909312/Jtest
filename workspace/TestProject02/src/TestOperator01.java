/**
 * 测试运算符
 * @author 潘炬翔
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		long d = 4;
		/**
		 * 整数运算：
		　　1. 如果两个操作数有一个为Long, 则结果也为long。
		　　2. 没有long时，结果为int。即使操作数全为short，byte，结果也是int。	
		 */
	//	short c =  a + b;
	//	short c = b + b;
	//	int e = a + d;
		/**
		 * 浮点运算：
　		　3. 如果两个操作数有一个为double，则结果为double。
　		　4. 只有两个操作数都是float，则结果才为float。	
		 */
		float f1 = a+ d;      //a 和d 最大的范围是long 而float的取值范围比long大，可以自动转换类型
//		float f2 = d + 1.0;    //浮点的常量为double类型
		float f3 = 1.2F;
		float f4 = f1 + f3; 

		System.out.println(7%3);     //“余数”符号和左边操作数相同
		System.out.println(-7%3);
		System.out.println(7%-3);
		
		
		int q = 3;
		int p = q++;   //执行完后,b=3。先给b赋值，再自增。
		System.out.println("q="+q+"\np="+p);
		q = 3;
		p = ++p;   //执行完后,c=5。a先自增，再给c赋值
		System.out.println("p="+p+"\np="+p);
	}
}
