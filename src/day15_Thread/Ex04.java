package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04{
	public static void main(String[] args) {
		JFrame frame = new JFrame("TEST");
		// 기초 프레임을 만듬 
		Container c = frame.getContentPane();
		// 바닥에 깔 장판 개념
		JLabel label = new JLabel("Hello GUI");
		// 장판에 글씨를 씀
		
		c.add(label);
		
		frame.setLocation(1000,500); //x = 1000, y = 500
		// 화면에 창을 띄울 위치 설정
		frame.setPreferredSize(new Dimension(500,200));
		// 창의 사이즈 설정
		frame.pack();
		// 변경 사항을 적용
		
		// 글꼴 설정
		Font font = new Font(null, Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		// setPreferredSize(new Dimension(500,200) 이 위치에 창이 뜸
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 활성화된 창의 x를 누르면 console도 같이 꺼짐
		
		for(int i=0; ; i++) {			
			label.setText(i+" : 안녕하세요");
			// 내용의 글씨설정
		}
	}
}
