/**
 * 测试整型和浮点型
 * @author 潘炬翔
 *
 */

import java.math.*;

public class TestBasicDataType {
	public static void main(String[] args) {
		
		int tenUp=10;
		int eightUp=010;          //0开头是八进制
		int sixteenUp=0x10;       //0x开头是十六进制
		int twoUp=0b10;           //0b开头是二进制
		
		System.out.println(tenUp);
		System.out.println(eightUp);
		System.out.println(sixteenUp);
		System.out.println(twoUp);
		
		
		byte salary = -128;        
//		byte salary = 128;        //byte范围是 -2^7 ~ (2^7)-1         byte 1字节，8位 共2^8个表数， 正负各一半
		int population = 2000000000;  //整型常量默认为int类型， -2^31 ~ (2^31)-1
//		long gobalPopulation = 3000000000;
		long gobalSalary = 3000000000L;  //后面加"L"或 "l" 声明long型常量
		
//		float a = 3.14;  //浮点的常量默认为double类型，所以要转换类型
		float c = 3.14F;
		double b = 6.28;
		double d = 628e2; // E2表示 10^2
		double e = 628E-2; 
		System.out.println(e + " \t" + d);
		
		// 浮点数不精确，千万不要用于比较！！！需要比较请使用BigDecimal类
		
		float d1 = 423432423f;
		float d2 = d1+1;
		if(d1==d2){
		   System.out.println("d1==d2");//输出结果为d1==d2
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
		
		System.out.println(bd2.equals(bd3));  //比较小数 使用BigDecimal类


	}
}
