package level_1_exam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	void setup() {
		JFrame frame = new JFrame("Color Teacher");
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setBackground(Color.YELLOW);
		button1.setOpaque(true);
		button2.setBackground(Color.RED);
		button2.setOpaque(true);
		button3.setBackground(Color.BLUE);
		button3.setOpaque(true);
		button4.setBackground(Color.GREEN);
		button4.setOpaque(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
ColorTeacher color = new ColorTeacher();
color.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(button1==e.getSource()){
			speak("yellow");
		}
		if(button2==e.getSource()){
			speak("red");
		}
		if(button3==e.getSource()){
			speak("blue");
		}
		if(button4==e.getSource()){
			speak("green");
		}
	}
}
