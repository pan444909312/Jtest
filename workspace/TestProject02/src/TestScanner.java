import java.util.Scanner; 

/**
 * 测试键盘输入
 * @author pjx
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入您的性别");
		String sex = scanner.nextLine();
		
		System.out.println("------------------");
		System.out.println("姓名："+ name);
		System.out.println("性别："+ sex);
	}
}
