import java.util.Scanner; 

/**
 * ���Լ�������
 * @author pjx
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������������");
		String name = scanner.nextLine();
		System.out.println("�����������Ա�");
		String sex = scanner.nextLine();
		
		System.out.println("------------------");
		System.out.println("������"+ name);
		System.out.println("�Ա�"+ sex);
	}
}
