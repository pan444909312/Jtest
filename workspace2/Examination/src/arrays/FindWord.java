package arrays;

import java.util.Scanner;

public class FindWord {
	
	private String str[] = new String[] {"xxy","pjx","love","together","forever"};
		
	public String findWord(String str) {
		for(int i=0;i<this.str.length;i++) {
			if(str.equals(this.str[i])) {
				return "�õ��ʴ��ڣ�����Ϊ��"+i;
			}
		}
		return "�����ڸõ���";
	}
	
	public static void main(String[] args) {
		System.out.print("��������Ҫ���ҵĵ��ʣ�");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		FindWord f1 = new FindWord();
		System.out.println(f1.findWord(str));
	}
	

}
