package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Home {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.getContentPane().setBackground(Color.WHITE);
		frmHome.setTitle("HOME");
		frmHome.setBounds(100, 100, 761, 442);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setBounds(42, 0, 352, 44);
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 17));
		frmHome.getContentPane().add(label);
		
		JButton HbtnHome = new JButton("HOME");
		HbtnHome.setBounds(0, 46, 106, 30);
		HbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnHome);
		
		JButton HbtnCarPa = new JButton("CAR PARKING");
		HbtnCarPa.setBounds(96, 46, 116, 30);
		HbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarPa);
		
		JButton HbtnCarRe = new JButton("CAR RELEASE");
		HbtnCarRe.setBounds(210, 46, 116, 30);
		HbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarRe);
		
		JButton HbtnParkRe = new JButton("PARKING REF.");
		HbtnParkRe.setBounds(317, 46, 116, 30);
		HbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ParkingRef pr= new ParkingRef();  //calling parking ref. window will come.
				ParkingRef.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnParkRe);
		
		JButton HbtnAbout = new JButton("ABOUT US");
		HbtnAbout.setBounds(431, 46, 106, 30);
		HbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au= new AboutUs();  //calling about window will come.
				AboutUs.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnAbout);
		
		JButton HbtnCont = new JButton("CONTACT US");
		HbtnCont.setBounds(535, 46, 106, 30);
		HbtnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact c= new Contact();  //calling contact window will come.
				Contact.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCont.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCont);
		
		JButton HbtnLogout = new JButton("LOG OUT");
		HbtnLogout.setBounds(639, 46, 106, 30);
		HbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmHome.setVisible(false);
				
			}
		});
		HbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 46, 44);
		lblNewLabel.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\logo 2.png"));
		lblNewLabel.setBackground(Color.WHITE);
		frmHome.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\ddd.jpg"));
		lblNewLabel_1.setBounds(0, 72, 745, 331);
		frmHome.getContentPane().add(lblNewLabel_1);
	}
}
