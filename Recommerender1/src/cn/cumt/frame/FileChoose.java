package cn.cumt.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.ScrollPane;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JTextArea;

public class FileChoose {

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;
	private String path;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FileChoose window = new FileChoose();
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
	public FileChoose() {
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
		frame.getContentPane().setFont(new Font("华文楷体", Font.PLAIN, 18));
		frame.setTitle("\u5BFC\u5165\u6570\u636E");
		frame.setBounds(100, 100, 480, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u8981\u5BFC\u5165\u7684\u6587\u4EF6\uFF1A");
		label.setFont(new Font("华文楷体", Font.PLAIN, 18));
		label.setBounds(135, 29, 180, 38);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(51, 83, 180, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u9009\u62E9\u6587\u4EF6");
		button.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog fileDialog=new FileDialog(frame, "选择文件");
				fileDialog.setVisible(true);
				String directory = fileDialog.getDirectory();
				String file = fileDialog.getFile();
				path=directory+file;
				textField.setText(path);
			}
		});
		button.setBounds(239, 83, 84, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5BFC\u5165\u6570\u636E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedReader br=null;
				try 
				{
					br=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
					String line=null;					
						while ((line=br.readLine())!=null) {
							line=line.replaceAll(",", " ");
							textArea.setText(textArea.getText()+line+"\n");
						}
				} catch (IOException e1) {
						
						e1.printStackTrace();
				}
				finally{
					if(br!=null){
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		button_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_1.setBounds(338, 83, 84, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u8FD4\u56DE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame frame1=new Index().getFrame();
				frame1.setLocation(730, 300);
				frame1.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_2.setFont(new Font("华文楷体", Font.PLAIN, 18));
		button_2.setBounds(162, 319, 119, 29);
		frame.getContentPane().add(button_2);
		
		textArea = new JTextArea();
		//frame.getContentPane().add(textArea);
		textArea.setBounds(51, 125, 371, 185);
		textArea.setFont(new Font("华文楷体", Font.PLAIN, 16));
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(51, 128, 371, 185);
		frame.getContentPane().add(scrollPane);
		scrollPane.add(textArea);
		
		
		
	}
}
