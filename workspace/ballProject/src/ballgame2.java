/**
 * ����������Ϸ�Ļ���
 * �����˾���
 */
import java.awt.*;
import javax.swing.*;



//extends JFrame �̳�swing��Ĵ�����
public class ballgame2 extends JFrame{

	//����ͼƬ
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png"); //30*30
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg"); //856*501
	
	double x=100;   //С��ĺ�����
	double y=100;   //С���������
	
	double degree =3.14/3 ;  //���ȣ�60��
	
	//������
	public void paint(Graphics g) {
		System.out.println("�һ�����2~");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 30*Math.cos(degree);
		y = y + 30*Math.sin(degree);

		if(y>501-40-30||y<40+40) { //y<40+40   һ��Ϊ���ӱ߿�ĸ߶� ����һ��Ϊ�������ĸ߶�
			degree = -degree;     //x��Գ�
		}
		if(x>856-40-30||x<40){
			degree = 3.14 - degree;  //y��Գ�
		}
	}
	
	
	//���ڼ���
	void launchFrame() {
		setSize(856,501); //���ڵĿ�͸�
		setLocation(50,50);//��������Ļ�е�x,yλ��
		setVisible(true); //���ô��ڿɼ���Ĭ���ǲ��ɼ���
		
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
		System.out.println("hey~2");
		ballgame2 game = new ballgame2();
		game.launchFrame();
	}
}
