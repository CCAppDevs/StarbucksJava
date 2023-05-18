package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		
		MenuForm form = new MenuForm("Starbucks");
		
//		// start the frame
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JPanel panel = new JPanel(); // we can use layout manangers (defaults to boxlayout)
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		frame.add(panel);
//		
//		JPanel innerPanel1 = new JPanel();
//		// vertical
//		innerPanel1.setLayout(new BoxLayout(innerPanel1, BoxLayout.Y_AXIS));
//		
//		// horizontal
//		JPanel innerPanel2 = new JPanel();
//		innerPanel2.setLayout(new BoxLayout(innerPanel2, BoxLayout.X_AXIS));
//		
//		panel.add(innerPanel1);
//		panel.add(innerPanel2);
//		
//		// add some components
//		JLabel label1 = new JLabel("Panel 1 - label 1");
//		innerPanel1.add(label1);
//		
//		JLabel label2 = new JLabel("Panel 1 - Label 2");
//		innerPanel1.add(label2);
//		
//		JLabel label3 = new JLabel("Panel 2 - Label 3");
//		innerPanel2.add(label3);
//		
//		JButton button = new JButton("Click me!");
//		
//		// anonymous inner class
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Pressed");
//			}
//			
//		});
//		
//		innerPanel2.add(button);
//		
//		// show the window
//		frame.pack();
//		frame.setVisible(true);
//		
//		System.out.println("Yeah toast");
	}

}
