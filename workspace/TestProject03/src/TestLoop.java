
public class TestLoop {
	
	/**
	 * 99�˷���
	 */
	public void multiplicationTable(){
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.printf("%d*%d=%d ",j,i,i*j);
			}
			System.out.println();
		} 
	}
	
	/**
	 * �ֱ���100����������ż���ĺ�
	 */
	public void	sum() {
		
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		while(i<=100) {
			if(i%2==0) {
				sum1 = sum1 + i;
			}
			if(i%2==1) {
				sum2 = sum2 + i;
			}
			i++;
		}
		System.out.println("ż���ͣ�"+sum1);
		System.out.println("������:"+sum2);
	}
	
	
	public static void main(String[] args) {
		TestLoop testLoop = new TestLoop();

//		testLoop.multiplicationTable();
		testLoop.sum();
	}

}
