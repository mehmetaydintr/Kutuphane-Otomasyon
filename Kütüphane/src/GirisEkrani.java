
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class GirisEkrani extends JFrame {
	private JTextField txtKullaniciAdi;
	public static Kutuphane k = new Kutuphane();
	public int personelsayac=1;
	public int uyesayac=1000;
	private JPasswordField txtSifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    GirisEkrani frame = new GirisEkrani();
				    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GirisEkrani() {
		setTitle("G\u0130R\u0130\u015E EKRANI");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SERBAY\\eclipse-workspace\\K\u00FCt\u00FCphane\\104-512.png"));
		getContentPane().setBackground(new Color(169, 169, 169));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 160);
		getContentPane().setLayout(null);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(178, 11, 112, 20);
		getContentPane().add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		JButton btnGirisYap = new JButton("G\u0130R\u0130\u015E YAP");
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean girisonayi=false;
				try {
					for(Personel p :  k.personeller)
					{
						if(p.KullaniciAdi.compareTo(txtKullaniciAdi.getText())== 0  && p.Sifre.compareTo( txtSifre.getText())==0 )
						{
							girisonayi=true;
							AnaMenu anamenu = new AnaMenu();
							anamenu.setVisible(true);
							Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
							anamenu.setLocation(dim.width/2-anamenu.getSize().width/2, dim.height/2-anamenu.getSize().height/2);
							
						}
					}
					if(girisonayi==false)
					{
						JOptionPane.showMessageDialog(null, "Kullanýcý adý veya þifre yanlýþ..", "HATA MESAJI!", -1);
					}
						
					txtKullaniciAdi.setText("");
					txtSifre.setText("");
				}
				catch(Exception r)
				{
					
				}
				
			}
		});
		btnGirisYap.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnGirisYap.setBounds(172, 72, 118, 31);
		getContentPane().add(btnGirisYap);
		
		JLabel lblKullaniciAdi = new JLabel("Kullan\u0131c\u0131 Ad\u0131 : ");
		lblKullaniciAdi.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblKullaniciAdi.setBounds(45, 14, 129, 17);
		getContentPane().add(lblKullaniciAdi);
		
		JLabel lblifre = new JLabel("\u015Eifre             :");
		lblifre.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblifre.setBounds(45, 42, 129, 20);
		getContentPane().add(lblifre);
		
		JButton btnKaytOl = new JButton("KAYIT OL");
		btnKaytOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KayitOl kayitOl = new KayitOl();
				kayitOl.setVisible(true);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				kayitOl.setLocation(dim.width/2-kayitOl.getSize().width/2, dim.height/2-kayitOl.getSize().height/2);
			}
		});
		btnKaytOl.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnKaytOl.setBounds(27, 72, 123, 31);
		getContentPane().add(btnKaytOl);
		
		txtSifre = new JPasswordField();
		txtSifre.setBounds(178, 42, 112, 20);
		getContentPane().add(txtSifre);
	}
}
