package arrays;

import java.util.Scanner;

public class FindWord {
	
	private String str[] = new String[] {"xxy","pjx","love","together","forever"};
		
	public String findWord(String str) {
		for(int i=0;i<this.str.length;i++) {
			if(str.equals(this.str[i])) {
				return "该单词存在，索引为："+i;
			}
		}
		return "不存在该单词";
	}
	
	public static void main(String[] args) {
		System.out.print("输入你想要查找的单词：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		FindWord f1 = new FindWord();
		System.out.println(f1.findWord(str));
	}
	

}
