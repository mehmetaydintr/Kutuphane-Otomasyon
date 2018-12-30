import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;

public class KayitOl extends JFrame {
	public  GirisEkrani girisekrani = new GirisEkrani();
	private JPanel contentPane;
	private JTextField txtAdSoyad;
	private JTextField txtKullaniciAdi;
	private JTextField txtDogumYeri;
	private JTextField txtEmail;
	protected Object rdoErkek;
	private JPasswordField txtSifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitOl frame = new KayitOl();
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
	public KayitOl() {
		setTitle("PERSONEL KAYIT OL");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SERBAY\\eclipse-workspace\\K\u00FCt\u00FCphane\\dermalogica-kayit-ol-icon.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 311, 294);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAdSoyad = new JTextField();
		txtAdSoyad.setBounds(151, 11, 110, 20);
		contentPane.add(txtAdSoyad);
		txtAdSoyad.setColumns(10);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setColumns(10);
		txtKullaniciAdi.setBounds(151, 42, 110, 20);
		contentPane.add(txtKullaniciAdi);
		
		JLabel lblNewLabel = new JLabel("Ad ve Soyad :");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(24, 12, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblKullancAd.setBounds(17, 43, 131, 14);
		contentPane.add(lblKullancAd);
		
		JLabel lblDoumYeri = new JLabel("Do\u011Fum Yeri :");
		lblDoumYeri.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoumYeri.setBounds(24, 107, 110, 14);
		contentPane.add(lblDoumYeri);
		
		JLabel lblifre = new JLabel("\u015Eifre :");
		lblifre.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblifre.setBounds(88, 76, 56, 14);
		contentPane.add(lblifre);
		
		JLabel lblTelefonNo = new JLabel("Email :");
		lblTelefonNo.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTelefonNo.setBounds(81, 140, 67, 14);
		contentPane.add(lblTelefonNo);
		
		txtDogumYeri = new JTextField();
		txtDogumYeri.setColumns(10);
		txtDogumYeri.setBounds(151, 106, 110, 20);
		contentPane.add(txtDogumYeri);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(151, 139, 110, 20);
		contentPane.add(txtEmail);
		
		JLabel lblCinsiyet = new JLabel("Cinsiyet :");
		lblCinsiyet.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCinsiyet.setBounds(48, 176, 86, 14);
		contentPane.add(lblCinsiyet);
		
		JRadioButton rdoErkek = new JRadioButton("Erkek");
		JRadioButton rdoKadin = new JRadioButton("Kad\u0131n ");
		rdoKadin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoKadin.isSelected())
				{
					rdoErkek.setSelected(false);
				}
				else
				{
					rdoErkek.setSelected(true);
				}
			}
		});
		rdoErkek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdoErkek.isSelected())
				{
					rdoKadin.setSelected(false);
				}
				else
				{
					rdoKadin.setSelected(true);
				}
			}
		});
		rdoErkek.setSelected(true);
		rdoErkek.setBounds(141, 175, 63, 21);
		contentPane.add(rdoErkek);
		rdoKadin.setBounds(212, 174, 63, 23);
		contentPane.add(rdoKadin);
		txtSifre = new JPasswordField();
		txtSifre.setBounds(151, 73, 110, 20);
		contentPane.add(txtSifre);
		JButton btnNewButton = new JButton("Kay\u0131t Ol");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String pattern="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
				Pattern r = Pattern.compile(pattern);
				Matcher m =r.matcher(txtEmail.getText());
				if(txtKullaniciAdi.getText().indexOf(' ')==-1 && !(txtKullaniciAdi.getText().isEmpty()))
				{
					if(!(txtAdSoyad.getText().isEmpty()))
					{
						if(  txtSifre.getText().length()>=8 && txtSifre.getText().length()<16) 
						{
							if(!(txtDogumYeri.getText().isEmpty()))
							{
							   if(m.find())
							   {
								   boolean buldumu=false;
								   if(!(girisekrani.k.personeller.isEmpty()))
								   {
									   for (Personel p1 : girisekrani.k.personeller)
										{
											if(p1.KullaniciAdi.compareToIgnoreCase(txtKullaniciAdi.getText()) == 0 || p1.Email.compareTo(txtEmail.getText()) == 0 )
											{
												buldumu=true;
												JOptionPane.showMessageDialog(null, "Girilen Kullanýcý Adý veya Email zaten sistemde mevcut..", "HATA MESAJI!", -1);	
											}
										}
								   }		
									if(buldumu==false)
									{
										 Personel p1 = new Personel(girisekrani.personelsayac);
										 girisekrani.personelsayac++;
										 p1.AdSoyad=txtAdSoyad.getText();
										 p1.KullaniciAdi=txtKullaniciAdi.getText();
										 p1.Sifre=txtSifre.getText();
										 p1.Email=txtEmail.getText();
										 if(rdoErkek.isSelected())
										 {
											 p1.Cinsiyet="Erkek";
										 }
										 else
										 {
											 p1.Cinsiyet="Kadýn";
										 }
										 girisekrani.k.personelEkle(p1);
										 JOptionPane.showMessageDialog(null, "Kayýt Ýþlemi Baþarý ile Gerçekleþtirildi..", "ONAY MESAJI!", -1); 
									}
							   }
							   else
							   {
								   JOptionPane.showMessageDialog(null, "Email yanlýþ girdiniz veya boþ býraktýnýz..", "HATA MESAJI!", -1);
							   }
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Doðum Yeri bölümünü boþ býraktýnýz..", "HATA MESAJI!", -1);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Þifre 8 ile 16 karakter arasýnda olmalýdýr..", "HATA MESAJI!", -1);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Ad Soyad bölümünü boþ býraktýnýz...", "HATA MESAJI!", -1);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Kullanýcý Adý boþluk içeriyor veya boþ býraktýnýz..", "HATA MESAJI!", -1);
				}
				txtAdSoyad.setText("");
				txtKullaniciAdi.setText("");
				txtDogumYeri.setText("");
				txtEmail.setText("");
				txtSifre.setText("");
			}
		});
		btnNewButton.setBounds(163, 214, 86, 31);
		contentPane.add(btnNewButton);
		
		
	}
}
