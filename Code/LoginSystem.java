import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JPasswordField;

public class LoginSystem {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField username;
	public JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	private void initialize() {
		//JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 424, 249);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("SALES LOGIN");
		label.setBounds(53, 11, 297, 47);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(SystemColor.desktop);
		label.setFont(new Font("Segoe UI", Font.BOLD, 35));
		panel.add(label);
		
		JLabel label_1 = new JLabel("USERNAME");
		label_1.setBounds(53, 76, 147, 39);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		panel.add(label_1);
		
		username = new JTextField();
		username.setBounds(210, 80, 140, 33);
		username.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		username.setColumns(10);
		panel.add(username);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 64, 348, 2);
		separator.setForeground(Color.BLACK);
		panel.add(separator);
		
		password = new JPasswordField();
		password.setBounds(210, 132, 140, 33);
		password.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		password.setColumns(10);
		panel.add(password);
		
		JLabel label_2 = new JLabel("PASSWORD");
		label_2.setBounds(53, 128, 147, 39);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		panel.add(label_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 182, 348, 2);
		separator_1.setForeground(Color.BLACK);
		panel.add(separator_1);
		
		JButton button = new JButton("EXIT");
		button.setBounds(269, 195, 110, 39);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button.setBackground(new Color(255, 215, 0));
		panel.add(button);
		
		JButton button_1 = new JButton("LOGIN");
		button_1.setBounds(151, 195, 110, 39);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_1.setBackground(new Color(34, 139, 34));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u = username.getText();
				String p = password.getText();
				if(u.equals("admin") && p.equals("123"))
				{
					username.setText(null);
					password.setText(null);
					SalesManagement sm = new SalesManagement();
					sm.main(null);
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Login","Error",JOptionPane.ERROR_MESSAGE);
					username.setText(null);
					password.setText(null);
				}
			}
		});
		panel.add(button_1);
		
		JButton button_2 = new JButton("RESET");
		button_2.setBounds(31, 195, 110, 39);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button_2.setBackground(new Color(220, 20, 60));
		panel.add(button_2);
		frame.setTitle("Sales Login");
		
		/**
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(220, 140, 140, 33);
		frame.getContentPane().add(passwordField);
		*/
	}
}
