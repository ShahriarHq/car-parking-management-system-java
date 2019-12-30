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

public class ParkingRef {

	private JFrame frmCarParkingRef;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingRef window = new ParkingRef();
					window.frmCarParkingRef.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParkingRef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarParkingRef = new JFrame();
		frmCarParkingRef.getContentPane().setBackground(Color.WHITE);
		frmCarParkingRef.setTitle("CAR PARKING REF.");
		frmCarParkingRef.setBounds(100, 100, 761, 442);
		frmCarParkingRef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarParkingRef.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 17));
		label.setBounds(42, 0, 352, 44);
		frmCarParkingRef.getContentPane().add(label);
		
		JButton PRbtnHome = new JButton("HOME");
		PRbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnHome.setBounds(0, 46, 106, 30);
		frmCarParkingRef.getContentPane().add(PRbtnHome);
		
		JButton PRbtnCarPa = new JButton("CAR PARKING");
		PRbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnCarPa.setBounds(96, 46, 116, 30);
		frmCarParkingRef.getContentPane().add(PRbtnCarPa);
		
		JButton PRbtnCarRe = new JButton("CAR RELEASE");
		PRbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnCarRe.setBounds(210, 46, 116, 30);
		frmCarParkingRef.getContentPane().add(PRbtnCarRe);
		
		JButton PRbtnParkRe = new JButton("PARKING REF.");
		PRbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr= new ParkingRef();
				ParkingRef.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnParkRe.setBounds(317, 46, 116, 30);
		frmCarParkingRef.getContentPane().add(PRbtnParkRe);
		
		JButton PRbtnAbout = new JButton("ABOUT US");
		PRbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au= new AboutUs();  //calling about window will come.
				AboutUs.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnAbout.setBounds(431, 46, 106, 30);
		frmCarParkingRef.getContentPane().add(PRbtnAbout);
		
		JButton PRbtnCont = new JButton("CONTACT US");
		PRbtnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact c= new Contact();  //calling contact window will come.
				Contact.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnCont.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnCont.setBounds(535, 46, 106, 30);
		frmCarParkingRef.getContentPane().add(PRbtnCont);
		
		JButton PRbtnLogout = new JButton("LOG OUT");
		PRbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnLogout.setBounds(639, 46, 106, 30);
		frmCarParkingRef.getContentPane().add(PRbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\logo 2.png"));
		lblNewLabel.setBounds(9, 0, 46, 44);
		frmCarParkingRef.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\map.jpg"));
		lblNewLabel_1.setBounds(0, 75, 745, 328);
		frmCarParkingRef.getContentPane().add(lblNewLabel_1);
	}
}
