
import java.awt.*;
import javax.swing.*;



//extends JFrame �̳�swing��Ĵ�����
public class ballgame extends JFrame{
	
	//����ͼƬ
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png"); //30*30
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg"); //856*501
	
	double x=100;   //С��ĺ�����
	double y=300;   //С���������
	
	
	boolean direction = true;  //boolean�൱��һ���жϿ��أ���������ָ��������������ʵ�ֵ�trueʱ���������ƶ���false������
	
	//������
	public void paint(Graphics g) {
		System.out.println("�һ�����~");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		

		if(direction) {
			x = x+10;
		}
		else {
			x = x-10;
		}
		
		//����if�ж��Ƿ񵽴�߽�
		if(x>856-40-30) {     //856���ӿ��  40���ӱ߿�Ŀ��  30С���ֱ��
			direction = false;
		}
		if(x<40) {
			direction = true;
		}
		
	}
	
	
	//���ڼ���
	void launchFrame() {
		setSize(856,501); //���ڵĿ�͸�
		setLocation(50,50);//��������Ļ�е�x,yλ��
		setVisible(true);
		
		//�ػ����ڣ�ÿ�뻭25��
		while(true){
			repaint();
			try {
				Thread.sleep(40);  //40ms 1��25���ػ�
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	
	
	//main�����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println("hey~");
		ballgame game = new ballgame();
		game.launchFrame();
	}
}
