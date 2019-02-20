/**
 * 测试逻辑运算符
 * @author 潘炬翔
 *
 */
public class TestOperator02 {
	public static void main(String[] args) {
		int a = 1;
		if(a==1|1==2) {
			System.out.println("成功啦!");
		}else {
			System.out.println("失败了");
		}
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1&b2);  //与
		System.out.println(b1|b2);  //或
		System.out.println(b1^b1);  //异或 不同为true，相同为false
		System.out.println(b1^b2); 
		System.out.println(b1&!b2);  //非
		
//		System.out.println(b1|2<(3/0));  //短路或,一个true直接true  3/0 0不能为除数会报错		
		System.out.println(b2&&2<(3/0));  //短路与，一个false直接false   先判断了b2，为false，直接false退出，不计算后面
		System.out.println(b1||2<(3/0));  //短路或,一个true直接true

	}
}
