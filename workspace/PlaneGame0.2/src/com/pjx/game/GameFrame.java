package com.pjx.game;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public void launchFrame() {
		setTitle("�ɻ�����ӵ�");//���ô��ڵı���
		setVisible(true);//���ô��ڿɼ���Ĭ���ǲ��ɼ���
		setSize(500, 500);//���ô��ڳߴ�
		setLocation(800, 200);//���ô���λ��
		
        //���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//������������� 0��ʾ������������0Ϊ����������

            }
        }); 
	}
	/**
	 * paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ�����
	 */
	@Override
	public void paint(Graphics g) {
		g.drawLine(200, 200, 400, 400);
		g.drawRect(100, 100, 200, 300);
		g.drawOval(100, 100, 300, 300);
		
		
	}
	
	
	
	public static void main(String[] args) {
		GameFrame g = new GameFrame();
		g.launchFrame();
	}
}
