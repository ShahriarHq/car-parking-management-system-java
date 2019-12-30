package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class LOGIN {

	private JFrame frmLogIn;
	private JTextField txtName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogIn = new JFrame();
		frmLogIn.getContentPane().setBackground(Color.WHITE);
		frmLogIn.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 16));
		
		frmLogIn.setType(Type.POPUP);
		frmLogIn.setTitle("LOG IN");
		frmLogIn.setBounds(100, 100, 761, 442);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		
		JLabel UserNmae = new JLabel("NAME:");
		UserNmae.setFont(new Font("Sitka Text", Font.BOLD, 16));
		UserNmae.setBounds(312, 93, 79, 33);
		frmLogIn.getContentPane().add(UserNmae);
		
		txtName = new JTextField();
		txtName.setBackground(SystemColor.inactiveCaptionBorder);
		txtName.setBounds(436, 97, 207, 26);
		frmLogIn.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel Password = new JLabel("Password:");
		Password.setFont(new Font("Sitka Text", Font.BOLD, 16));
		Password.setBounds(312, 130, 97, 31);
		frmLogIn.getContentPane().add(Password);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				FileReader fr=new FileReader("createAccount.txt");
				BufferedReader br=new BufferedReader(fr);
				String in=br.readLine();
				String m=txtName.getText();
				String m1=txtPassword.getText();
				while(in!=null){
					String[] prts = in.split(" ");
				
					if(prts[0].equals(m1)){
						
						if(prts[1].equals(m)){
							
							String s=prts[3];
							Home hm= new Home();   // calling home window will come.
						   Home.main(null);
						   frmLogIn.setVisible(false);
						break;
						}
						else{
							JOptionPane.showMessageDialog(btnLogIn,"Wrong Password");
							break;
						}
				}
					in=br.readLine();
					if(in==null){
							JOptionPane.showMessageDialog(btnLogIn,"Create Acccount First");
					}
				}
					br.close();
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				catch(IOException e){
					System.out.println(e.getMessage());
				}
				catch(NumberFormatException e){
					System.out.println(e.getMessage());
				}
				frmLogIn.setVisible(false);
				
//				String username= txtName.getText();
//				String password= txtPassword.getText();
//				
//				if(password.contains("12345")&& username.contains("shahriar"))   //user name or password match.
//				{
//					Home hm= new Home();   // calling home window will come.
//					Home.main(null);
//					frmLogIn.setVisible(false);
//					
//					/*txtName.setText(null);
//					txtPassword.setText(null);*/
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "Invalid username or password","Login Error",JOptionPane.ERROR_MESSAGE);
//				}
				
				
			}
		});
		btnLogIn.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnLogIn.setBackground(SystemColor.textHighlight);
		btnLogIn.setBounds(391, 200, 135, 31);
		frmLogIn.getContentPane().add(btnLogIn);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(SystemColor.inactiveCaptionBorder);
		txtPassword.setBounds(436, 134, 207, 25);
		frmLogIn.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		lblNewLabel.setBounds(72, 9, 652, 64);
		frmLogIn.getContentPane().add(lblNewLabel);
		
		JButton btnCA = new JButton("Create Account");
		btnCA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CreatingAc info= new CreatingAc();   //creating account window will come.
				CreatingAc.main(null);
			}
		});
		btnCA.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnCA.setBounds(502, 347, 222, 23);
		frmLogIn.getContentPane().add(btnCA);
		
		JLabel LoginIcon = new JLabel("");
		LoginIcon.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\ll.png"));
		LoginIcon.setBounds(84, 42, 250, 350);
		frmLogIn.getContentPane().add(LoginIcon);
		
		JLabel CarIcon = new JLabel("");
		CarIcon.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\Car-icgon.png"));
		CarIcon.setBounds(4, 0, 70, 73);
		frmLogIn.getContentPane().add(CarIcon);
	}
}
