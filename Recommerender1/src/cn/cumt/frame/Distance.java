package cn.cumt.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import cn.cumt.demo.TestDistance;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Distance {

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
//					Distance window = new Distance();
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
	public Distance() {
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
		frame.setFont(new Font("华文楷体", Font.PLAIN, 16));
		frame.setTitle("\u76AE\u5C14\u900A\u8DDD\u79BB");
		frame.setBounds(100, 100, 480, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u7528\u6237\uFF1A");
		label.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label.setBounds(79, 131, 121, 30);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(211, 130, 146, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8981\u63A8\u8350\u7684\u5C5E\u6027\uFF1A");
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label_1.setBounds(56, 177, 135, 30);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 177, 146, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField.getText());
				int p=Integer.parseInt(textField_1.getText());
				String string = TestDistance.estimate(id, p);
				Result result = new Result(string);
				result.getFrame().setLocation(730, 300);
				result.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button.setBounds(103, 241, 94, 32);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index=new Index();
				index.getFrame().setLocation(730, 300);
				index.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		button_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_1.setBounds(238, 241, 94, 32);
		frame.getContentPane().add(button_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u5B9E\u9A8C\u53C2\u6570");
		label_2.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_2.setBounds(154, 66, 146, 30);
		frame.getContentPane().add(label_2);
	}
}
