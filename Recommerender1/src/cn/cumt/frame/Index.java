package cn.cumt.frame;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Index {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frame.setVisible(true);
					window.frame.setLocation(730, 300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u9009\u62E9\u7B97\u6CD5");
		frame.setBounds(100, 100, 480, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u7EBF\u6027\u56DE\u5F52\u7B97\u6CD5");
		button.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matrix matrix=new Matrix();
				matrix.getFrame().setLocation(730,300);
				matrix.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setForeground(Color.BLACK);
		button.setBounds(152, 53, 150, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u6B27\u5F0F\u8DDD\u79BB\u7B97\u6CD5");
		button_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame frame1=new Distance().getFrame();
				frame1.setLocation(730,300);
				frame1.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(152, 128, 150, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u76AE\u5C14\u900A\u7B97\u6CD5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_2.setBounds(152, 198, 150, 42);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u5BFC\u5165\u6570\u636E");
		button_3.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame frame1=new FileChoose().getFrame();
				frame1.setLocation(730,300);
				frame1.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		button_3.setBounds(152, 275, 150, 42);
		frame.getContentPane().add(button_3);
	}

	public JFrame getFrame() {
		return frame;
	}
}
