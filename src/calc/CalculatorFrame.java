package calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorFrame extends JFrame{

	private JLabel label;
	private JPanel btnView;
	private JPanel btnMemory;
	
	String btn[] = {"%","CE","C","←","1/x","x²","²√x","÷","7","8","9","X","4",
			"5","6","-","1","2","3","+","+/-","0",".","="};
	
	String btnM[] = {"MC", "MR", "M+", "M-","MS", "M∨"};
	
	public CalculatorFrame(String title) 
	{
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(900, 200);
		setSize(400, 330);
		setLayout(new BorderLayout(2, 2));
		
		label = new JLabel("0", JLabel.RIGHT);
		label.setFont(new Font("Italic", Font.BOLD, 45));
		label.setSize(getPreferredSize());
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		
		btnView = new JPanel();		// 버튼창 GUI
		btnMemory = new JPanel();	// 메모리 관련 버튼창 GUI
		
		btnView.setLayout(new GridLayout(6,4,2,2));
		btnMemory.setLayout(new GridLayout(1, 6, 2, 2));
		
		JButton button[] = new JButton[btn.length];
		JButton buttonM[] = new JButton[btnM.length];
		
		for(int i = 0; i < btn.length; i++) {
			button[i] = new JButton(btn[i]);
			button[i].setFont(new Font("Italic", Font.PLAIN, 15));
			btnView.add(button[i]);
		}
		
		for (int i = 0; i < btnM.length; i++) {
			buttonM[i] = new JButton(btnM[i]);
			buttonM[i].setFont(new Font("Italic", Font.PLAIN, 15));
			btnMemory.add(buttonM[i]);
		}
		
		add(label,BorderLayout.NORTH);		// 결과창 배치
		add(btnMemory, BorderLayout.CENTER);
		add(btnView, BorderLayout.SOUTH);
		
		setVisible(true);	
	}

}
