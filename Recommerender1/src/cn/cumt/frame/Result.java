package cn.cumt.frame;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Result {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ResultMatrix window = new ResultMatrix();
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
	public Result(String string) {
		initialize(string);
	}

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String string) {
		frame = new JFrame();
		frame.setTitle("\u63A8\u8350\u7ED3\u679C");
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(100, 100, 480, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(253, 245, 230));
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBounds(81, 76, 336, 178);
		textArea.setText(string);
		Font f=new Font("华文楷体", Font.PLAIN, 18);
		textArea.setFont(f);
		frame.getContentPane().add(textArea);
		
		JLabel label = new JLabel("\u63A8\u8350\u7ED3\u679C");
		label.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label.setBounds(173, 25, 72, 18);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index=new Index();
				index.getFrame().setLocation(730, 300);
				index.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setBounds(200, 284, 105, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(343, 284, 105, 27);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u8BEF\u5DEE\u5206\u6790");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultAlaysis ra=new ResultAlaysis();
				JFrame frame2 = ra.getFrame();
				frame2.setLocation(730, 300);
				frame2.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_2.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_2.setBounds(68, 284, 105, 27);
		frame.getContentPane().add(button_2);
	}
}
