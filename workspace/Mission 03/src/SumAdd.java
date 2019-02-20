import java.util.Scanner;

/**
 * «Û£∫°∆1+°∆2+°≠°≠+°∆n
 * @author pjx
 *
 */

public class SumAdd {
	
	public static void main(String[] args) {
		int n = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ‰»Î£∫");
		n = scanner.nextInt();
		
		for(int i =1;i<=n;i++) {
			sum1 += i;
			sum2 += sum1;

		}
		
		System.out.println(sum2);
	}

}
