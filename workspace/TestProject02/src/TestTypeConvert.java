/**
 * 类型转换
 * @author admin
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		//容量小的向大的转化， 容量表示能表示的总数
		int a = 123;
		long b = a;
		double d = b;
		// a = b;
		// long e = 3.33f;
		float g = 5216165l;
		
		//特例 int 转short 和 byte ，只要在byte和short表数范围 可以转换
		byte h = 123;
		short k = 44;
		
		double d1 = 3.99;
		int a1 = (int)d1;  //强制转换舍弃小数部分
		System.out.println(a1);
		
		char c1 = 'a';
		int a2 = c1 + 1;
		System.out.println(a2);
		System.out.println((char)a2);
		
		//转换类型越界
		int t1 = 1000000000;
		int t2 = 20;
		int t3 = t1*t2;  //int 越界了 最大为21亿多
		long t4 = t1*t2;   //虽然变量定义为long，但是在t1*t2的时候 int已经越界了
		long t5 = 1L*t1*t2;
		System.out.println(t3); 
		System.out.println(t4);
		System.out.println(t5);
		
	}
}
