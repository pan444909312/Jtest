/**
 * �����߼������
 * @author �˾���
 *
 */
public class TestOperator02 {
	public static void main(String[] args) {
		int a = 1;
		if(a==1|1==2) {
			System.out.println("�ɹ���!");
		}else {
			System.out.println("ʧ����");
		}
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1&b2);  //��
		System.out.println(b1|b2);  //��
		System.out.println(b1^b1);  //��� ��ͬΪtrue����ͬΪfalse
		System.out.println(b1^b2); 
		System.out.println(b1&!b2);  //��
		
//		System.out.println(b1|2<(3/0));  //��·��,һ��trueֱ��true  3/0 0����Ϊ�����ᱨ��		
		System.out.println(b2&&2<(3/0));  //��·�룬һ��falseֱ��false   ���ж���b2��Ϊfalse��ֱ��false�˳������������
		System.out.println(b1||2<(3/0));  //��·��,һ��trueֱ��true

	}
}
