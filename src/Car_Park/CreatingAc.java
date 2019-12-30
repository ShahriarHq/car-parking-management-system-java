package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class CreatingAc {
	
	public static ArrayList<createAccount> create = new ArrayList<createAccount>();
	public static HashMap<createAccount, Boolean> hp = new HashMap<createAccount, Boolean>();

	private JFrame frmCreatAccount;
	private JTextField nameTxt;
	private JTextField passTxt;
	private JTextField emailTxt;
	private JTextField mobTxt;
	private JTextField brithTxt;
	private String Name,Pass,email,mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatingAc window = new CreatingAc();
					window.frmCreatAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreatingAc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreatAccount = new JFrame();
		frmCreatAccount.getContentPane().setBackground(Color.WHITE);
		frmCreatAccount.setTitle("Create Account");
		frmCreatAccount.setBounds(100, 100, 761, 442);
		frmCreatAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreatAccount.getContentPane().setLayout(null);
		
		JLabel caName = new JLabel("NAME:");
		caName.setForeground(SystemColor.text);
		caName.setBackground(SystemColor.activeCaptionText);
		caName.setFont(new Font("Sitka Text", Font.BOLD, 20));
		caName.setBounds(23, 87, 70, 19);
		frmCreatAccount.getContentPane().add(caName);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		label.setBounds(76, 11, 530, 44);
		frmCreatAccount.getContentPane().add(label);
		
		JLabel caPassword = new JLabel("Password:");
		caPassword.setForeground(SystemColor.text);
		caPassword.setFont(new Font("Sitka Text", Font.BOLD, 20));
		caPassword.setBounds(23, 133, 103, 19);
		frmCreatAccount.getContentPane().add(caPassword);
		
		JLabel caEmail = new JLabel("Email:");
		caEmail.setForeground(SystemColor.text);
		caEmail.setFont(new Font("Sitka Text", Font.BOLD, 20));
		caEmail.setBounds(23, 188, 70, 19);
		frmCreatAccount.getContentPane().add(caEmail);
		
		JLabel caMobile = new JLabel("Mobile No:");
		caMobile.setForeground(SystemColor.text);
		caMobile.setFont(new Font("Sitka Text", Font.BOLD, 20));
		caMobile.setBounds(23, 243, 110, 19);
		frmCreatAccount.getContentPane().add(caMobile);
		
		JLabel caBirth = new JLabel("Birth Date:");
		caBirth.setForeground(SystemColor.text);
		caBirth.setFont(new Font("Sitka Text", Font.BOLD, 20));
		caBirth.setBounds(23, 302, 120, 19);
		frmCreatAccount.getContentPane().add(caBirth);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(137, 82, 254, 30);
		frmCreatAccount.getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		passTxt = new JTextField();
		passTxt.setColumns(10);
		passTxt.setBounds(136, 128, 254, 30);
		frmCreatAccount.getContentPane().add(passTxt);
		
		emailTxt = new JTextField();
		emailTxt.setColumns(10);
		emailTxt.setBounds(137, 177, 254, 30);
		frmCreatAccount.getContentPane().add(emailTxt);
		
		mobTxt = new JTextField();
		mobTxt.setColumns(10);
		mobTxt.setBounds(137, 232, 254, 30);
		frmCreatAccount.getContentPane().add(mobTxt);
		
		brithTxt = new JTextField();
		brithTxt.setColumns(10);
		brithTxt.setBounds(137, 290, 254, 30);
		frmCreatAccount.getContentPane().add(brithTxt);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object obj = arg0.getSource();
				
				try{
					
				    FileWriter pr=new FileWriter("createAccount.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					String p=nameTxt.getText();	
					String a=passTxt.getText();
					String ip=emailTxt.getText();
					String po=mobTxt.getText();
					 //pr.append(" ").println();
					 
						bw.write(a+" "+p+" "+ip+" "+po);
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception e){
						System.out.print("Exception");
					}
				
				
				
//				if(obj== btnNewButton) {
//					createAccount temp = new createAccount(nameTxt.getText(), passTxt.getText(),emailTxt.getText(),mobTxt.getText());
//					if (hp.get(temp)==null) {
//						create.add(temp);
//						hp.put(temp, true);
//						nameTxt.setText("");
//						passTxt.setText("");
//						emailTxt.setText("");
//						mobTxt.setText("");
//						//searchMessage.setText("");
//					}  else {
//						nameTxt.setText("");
//						passTxt.setText("");
//						emailTxt.setText("");
//						mobTxt.setText("");
//						//searchMessage.setText("");
//					}
//					try {
//						PrintWriter bw= new PrintWriter(new BufferedWriter(new FileWriter("createAccount.txt", true)));
//						for(int i=0; i<create.size();i++) {
//							bw.println(create.get(i).name+" "+ create.get(i).pass+ " "+ create.get(i).mail+" "+create.get(i).birth);
//					
//						}
//						bw.close();
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
				
				
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCreatAccount.setVisible(false);
			}
		});
		btnNewButton.setBounds(338, 357, 89, 23);
		frmCreatAccount.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\logo.png"));
		lblNewLabel.setBounds(23, 0, 50, 65);
		frmCreatAccount.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\ppp.jpg"));
		lblNewLabel_1.setBounds(0, 55, 745, 348);
		frmCreatAccount.getContentPane().add(lblNewLabel_1);
	}

}
