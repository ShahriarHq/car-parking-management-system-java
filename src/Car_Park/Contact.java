package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Contact {

	private JFrame frmContactUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact window = new Contact();
					window.frmContactUs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contact() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContactUs = new JFrame();
		frmContactUs.getContentPane().setBackground(Color.WHITE);
		frmContactUs.setTitle("CONTACT US");
		frmContactUs.setBounds(100, 100, 761, 442);
		frmContactUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactUs.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 17));
		label.setBounds(41, 0, 352, 44);
		frmContactUs.getContentPane().add(label);
		
		JButton CUbtnHome = new JButton("HOME");
		CUbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnHome.setBounds(0, 46, 106, 30);
		frmContactUs.getContentPane().add(CUbtnHome);
		
		JButton CUbtnCarPa = new JButton("CAR PARKING");
		CUbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnCarPa.setBounds(96, 46, 116, 30);
		frmContactUs.getContentPane().add(CUbtnCarPa);
		
		JButton CUbtnCarRe = new JButton("CAR RELEASE");
		CUbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnCarRe.setBounds(210, 46, 116, 30);
		frmContactUs.getContentPane().add(CUbtnCarRe);
		
		JButton CUbtnParkRe = new JButton("PARKING REF.");
		CUbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr= new ParkingRef();
				ParkingRef.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnParkRe.setBounds(317, 46, 116, 30);
		frmContactUs.getContentPane().add(CUbtnParkRe);
		
		JButton CUbtnAbout = new JButton("ABOUT US");
		CUbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au= new AboutUs();  //calling about window will come.
				AboutUs.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnAbout.setBounds(431, 46, 106, 30);
		frmContactUs.getContentPane().add(CUbtnAbout);
		
		JButton CUbtnCont = new JButton("CONTACT US");
		CUbtnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact c= new Contact();  //calling contact window will come.
				Contact.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnCont.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnCont.setBounds(535, 46, 106, 30);
		frmContactUs.getContentPane().add(CUbtnCont);
		
		JButton CUbtnLogout = new JButton("LOG OUT");
		CUbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmContactUs.setVisible(false);
			}
		});
		CUbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CUbtnLogout.setBounds(639, 46, 106, 30);
		frmContactUs.getContentPane().add(CUbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\logo 2.png"));
		lblNewLabel.setBounds(10, 0, 46, 44);
		frmContactUs.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnContactUsTo = new JTextPane();
		txtpnContactUsTo.setBackground(SystemColor.activeCaptionBorder);
		txtpnContactUsTo.setFont(new Font("Sitka Text", Font.BOLD, 18));
		txtpnContactUsTo.setText("Contact Us:\r\nTo request an analysis of your parking consulting needs, simply use our contact form, or you may call, or email us, directly.\r\n\r\n\r\n\r\n\r\nCAR PARKING MANAGEMENT SYSTEM\r\nOffice: 01751817181\r\nEmail: carparkingmanagementsystem@gmail.com");
		txtpnContactUsTo.setBounds(0, 76, 393, 327);
		frmContactUs.getContentPane().add(txtpnContactUsTo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\lift5.png"));
		lblNewLabel_1.setBounds(327, 76, 450, 327);
		frmContactUs.getContentPane().add(lblNewLabel_1);
	}

}
