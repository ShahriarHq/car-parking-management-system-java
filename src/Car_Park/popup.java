package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class popup {

	private JFrame frmCard;
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					popup window = new popup();
					window.frmCard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public popup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCard = new JFrame();
		frmCard.setBackground(Color.WHITE);
		frmCard.getContentPane().setBackground(Color.DARK_GRAY);
		frmCard.setTitle("CARD");
		frmCard.setBounds(100, 100, 422, 208);
		frmCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCard.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		textField.setBounds(50, 79, 303, 32);
		frmCard.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCard.setVisible(false);
				JOptionPane.showMessageDialog(btnNewButton,"THANK YOU");
				
			}
		});
		btnNewButton.setBounds(161, 122, 89, 23);
		frmCard.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Enter Your Card Number");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 44, 273, 23);
		frmCard.getContentPane().add(lblNewLabel);
	}

}
