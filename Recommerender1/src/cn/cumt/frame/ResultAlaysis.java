package cn.cumt.frame;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultAlaysis{

	private JFrame frame;
	private MyPanel myPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultAlaysis window = new ResultAlaysis();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */	
	public ResultAlaysis() {
		initialize();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		myPanel=new MyPanel();
		myPanel.setSize(588, 358);
		myPanel.setLocation(39, 78);
		myPanel.setBackground(Color.WHITE);
		frame.setTitle("\u7ED3\u679C\u5206\u6790");
		frame.setBounds(730, 300, 683, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().add(myPanel);
		frame.getContentPane().add(myPanel);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u7EBF\u6027\u56DE\u5F52\u8BEF\u5DEE\u5206\u6790\u67F1\u72B6\u56FE");
		label.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label.setBounds(208, 13, 226, 47);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index=new Index();
				index.getFrame().setLocation(730, 300);
				index.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("华文楷体", Font.PLAIN, 20));
		button.setBounds(263, 455, 113, 35);
		frame.getContentPane().add(button);
	}
}
class MyPanel extends Panel{

	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		Image ig;
		ig=getToolkit().getImage("img/2.png");
		g.drawImage(ig, 0, 0,  this);
	}
	
}
