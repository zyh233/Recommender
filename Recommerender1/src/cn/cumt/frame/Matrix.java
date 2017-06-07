package cn.cumt.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import cn.cumt.demo.TestMatrix;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Matrix {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Matrix window = new Matrix();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Matrix() {
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
		frame.setFont(new Font("华文楷体", Font.PLAIN, 12));
		frame.setTitle("\u591A\u5143\u7EBF\u6027\u56DE\u5F52");
		frame.getContentPane().setFont(new Font("微软雅黑", Font.PLAIN, 20));
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 480, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblid = new JLabel("\u7528\u6237id:");
		lblid.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblid.setBounds(111, 112, 72, 18);
		frame.getContentPane().add(lblid);
		
		textField = new JTextField();
		textField.setBounds(198, 110, 121, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8981\u63A8\u8350\u7684\u5C5E\u6027:");
		label.setFont(new Font("华文楷体", Font.PLAIN, 16));
		label.setBounds(76, 164, 104, 29);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 166, 121, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setFont(new Font("华文楷体", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idString = textField.getText();
				String pString = textField_1.getText();
				int id = Integer.parseInt(idString);
				int p=Integer.parseInt(pString);
				String result=TestMatrix.estimate(p, id, 1);
				Result resultMatrix=new Result(result);
				resultMatrix.getFrame().setLocation(730, 300);
				resultMatrix.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(111, 239, 91, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.setFont(new Font("华文楷体", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame frame1=new Index().getFrame();
				frame1.setLocation(730, 300);
				frame1.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(228, 239, 91, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5B9E\u9A8C\u53C2\u6570");
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_1.setBounds(145, 48, 140, 29);
		frame.getContentPane().add(label_1);
	}
}
