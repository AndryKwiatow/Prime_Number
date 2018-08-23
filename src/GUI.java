import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField txtUserInput;
	int userNumber; 
	int denominatorCounter;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 25));
		frame.setBounds(100, 100, 305, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAnswer = new JButton("ANSWER");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userNumber = Integer.parseInt(txtUserInput.getText());
				denominatorCounter = 0;
				for (int i = 1; i < userNumber; i++) {
					if(userNumber % i == 0) {
						denominatorCounter++;						
					}
				}
				if(denominatorCounter <= 2 ) {
					JOptionPane.showMessageDialog(null, "It's prime");					
				}
				else {
					JOptionPane.showMessageDialog(null, "Not prime. Try again");
				}
				
			}
		});
		btnAnswer.setForeground(Color.WHITE);
		btnAnswer.setBackground(Color.DARK_GRAY);
		btnAnswer.setBounds(85, 197, 115, 23);
		frame.getContentPane().add(btnAnswer);
		
		JLabel lblHeader = new JLabel("Prime Number");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setBounds(73, 32, 142, 29);
		frame.getContentPane().add(lblHeader);
		
		txtUserInput = new JTextField();
		txtUserInput.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserInput.setForeground(Color.GRAY);
		txtUserInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtUserInput.setBackground(Color.BLACK);
		txtUserInput.setBounds(46, 105, 192, 43);
		frame.getContentPane().add(txtUserInput);
		txtUserInput.setColumns(10);
		
		JLabel lblPutYourNumber = new JLabel("Put your number here:");
		lblPutYourNumber.setForeground(Color.WHITE);
		lblPutYourNumber.setBounds(73, 86, 142, 14);
		frame.getContentPane().add(lblPutYourNumber);
		
		
		
	}
}
