package Car_Park;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class CarRele {

	public static ArrayList<carpark> car = new ArrayList<carpark>();
	
	private JFrame frmCarRelease;
	private JTextField carNmbr;
	private JTextField name1;
	private JTextField cell1;
	private JTextField place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRele window = new CarRele();
					window.frmCarRelease.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarRele() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarRelease = new JFrame();
		frmCarRelease.getContentPane().setBackground(Color.WHITE);
		frmCarRelease.setTitle("CAR RELEASE");
		frmCarRelease.setBounds(100, 100, 761, 442);
		frmCarRelease.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarRelease.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 17));
		label.setBounds(43, 0, 352, 44);
		frmCarRelease.getContentPane().add(label);
		
		JButton CRbtnHome = new JButton("HOME");
		CRbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnHome.setBounds(0, 46, 106, 30);
		frmCarRelease.getContentPane().add(CRbtnHome);
		
		JButton CRbtnCarPa = new JButton("CAR PARKING");
		CRbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnCarPa.setBounds(96, 46, 116, 30);
		frmCarRelease.getContentPane().add(CRbtnCarPa);
		
		JButton CRbtnCarRe = new JButton("CAR RELEASE");
		CRbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnCarRe.setBounds(210, 46, 116, 30);
		frmCarRelease.getContentPane().add(CRbtnCarRe);
		
		JButton CRbtnParkRe = new JButton("PARKING REF.");
		CRbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr= new ParkingRef();
				ParkingRef.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnParkRe.setBounds(317, 46, 116, 30);
		frmCarRelease.getContentPane().add(CRbtnParkRe);
		
		JButton CRbtnAbout = new JButton("ABOUT US");
		CRbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au= new AboutUs();  //calling about window will come.
				AboutUs.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnAbout.setBounds(431, 46, 106, 30);
		frmCarRelease.getContentPane().add(CRbtnAbout);
		
		JButton CRbtnCont = new JButton("CONTACT US");
		CRbtnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact c= new Contact();  //calling contact window will come.
				Contact.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnCont.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnCont.setBounds(535, 46, 106, 30);
		frmCarRelease.getContentPane().add(CRbtnCont);
		
		JButton CRbtnLogout = new JButton("LOG OUT");
		CRbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnLogout.setBounds(639, 46, 106, 30);
		frmCarRelease.getContentPane().add(CRbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\logo 2.png"));
		lblNewLabel.setBounds(10, 0, 46, 44);
		frmCarRelease.getContentPane().add(lblNewLabel);
		
		JTextPane carnmbr = new JTextPane();
		carnmbr.setBackground(Color.GRAY);
		carnmbr.setText("CAR NUMBER:");
		carnmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		carnmbr.setBounds(10, 98, 89, 20);
		frmCarRelease.getContentPane().add(carnmbr);
		
		carNmbr = new JTextField();
		carNmbr.setColumns(10);
		carNmbr.setBackground(SystemColor.inactiveCaptionBorder);
		carNmbr.setBounds(103, 98, 178, 20);
		frmCarRelease.getContentPane().add(carNmbr);
		
		JTextPane name = new JTextPane();
		name.setBackground(Color.GRAY);
		name.setText("NAME:");
		name.setFont(new Font("Sitka Text", Font.BOLD, 11));
		name.setBounds(10, 129, 73, 20);
		frmCarRelease.getContentPane().add(name);
		
		name1 = new JTextField();
		name1.setColumns(10);
		name1.setBackground(SystemColor.inactiveCaptionBorder);
		name1.setBounds(103, 129, 178, 20);
		frmCarRelease.getContentPane().add(name1);
		
		JTextPane cellname = new JTextPane();
		cellname.setBackground(Color.GRAY);
		cellname.setText("CELL No");
		cellname.setFont(new Font("Sitka Text", Font.BOLD, 11));
		cellname.setBounds(10, 160, 85, 20);
		frmCarRelease.getContentPane().add(cellname);
		
		cell1 = new JTextField();
		cell1.setColumns(10);
		cell1.setBackground(SystemColor.inactiveCaptionBorder);
		cell1.setBounds(103, 160, 178, 20);
		frmCarRelease.getContentPane().add(cell1);
		
		JTextPane placeNum = new JTextPane();
		placeNum.setBackground(Color.GRAY);
		placeNum.setText("PLACE No:");
		placeNum.setFont(new Font("Sitka Text", Font.BOLD, 11));
		placeNum.setBounds(10, 191, 85, 20);
		frmCarRelease.getContentPane().add(placeNum);
		
		place = new JTextField();
		place.setColumns(10);
		place.setBackground(SystemColor.inactiveCaptionBorder);
		place.setBounds(103, 191, 69, 20);
		frmCarRelease.getContentPane().add(place);
		
		JButton select = new JButton("Select");
		select.setBackground(new Color(204, 153, 255));
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try {
					FileReader fr=new FileReader("carpark.txt");
				BufferedReader br=new BufferedReader(fr);
					String in=br.readLine();
					String m=carNmbr.getText();
//					String m1=name1.getText();
//				    String m2=cell1.getText();
//				    String m3=place.getText();
					while(in!=null){
						String[] prts = in.split(" ");
						if(prts[0].equals(m)){
							JOptionPane.showMessageDialog(null, "INFORMATION MATCHED","Release Successfull",JOptionPane.ERROR_MESSAGE);
							
							popup po= new popup();   // calling home window will come.
							popup.main(null);
							break;
							}
						else {
							JOptionPane.showMessageDialog(null, "INVALID INFORMATION","Release Corupted",JOptionPane.ERROR_MESSAGE);
							break;
							}
					}
					   in=br.readLine();
			
						br.close();
					}
			
					catch(Exception e){
					e.printStackTrace();
					}
			
			
				
//				Object obj = arg0.getSource();
//				if(obj== select) {
//					carpark temp;
//					boolean t= false;
//					for(int i=0; i<car.size();i++) {
//						if(car.get(i).carnum.equals(carNmbr.getText())) {
//							t=true;
//							//temp= car.get(i);
//							//JOptionPane.showMessageDialog(null, "INFORMATION MATCHED","Release Successfull",JOptionPane.ERROR_MESSAGE);
//						}
//						
//						
//					}
//					if(t==true) {
//						JOptionPane.showMessageDialog(null, "INFORMATION MATCHED","Release Successfull",JOptionPane.ERROR_MESSAGE);
//					}
//					else {
//						JOptionPane.showMessageDialog(null, "INVALID INFORMATION","Release Corupted",JOptionPane.ERROR_MESSAGE);
//					}
//					
//				}
				
				//JOptionPane.showMessageDialog(null, "Invalid username or password","Login Error",JOptionPane.ERROR_MESSAGE);
			
			}
		});
		select.setBounds(83, 278, 89, 23);
		frmCarRelease.getContentPane().add(select);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ME\\O.P\\Car Parking Management System\\picture\\fffff.jpg"));
		lblNewLabel_1.setBounds(0, 72, 745, 331);
		frmCarRelease.getContentPane().add(lblNewLabel_1);
	}
}
