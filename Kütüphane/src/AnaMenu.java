import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.event.ItemListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ItemEvent;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;

public class AnaMenu extends JFrame {
	public  GirisEkrani girisekrani = new GirisEkrani();
	private JPanel contentPane;
	private JTextField txtKitapAdi;
	private JTextField txtTürü;
	private JTextField txtYazar;
	private JTextField txtSayfaSayisi;
	private JTextField txtYayinEvi;
	private JTextField txtBasimYili;
	private JTextField txtAdet;
	private JTextField txtISBN;
	private JTextField txtISBNsil;
	private JTextField txtAdetSil;
	private JTextField txtISBNara;
	private JTextField txtUyeAdSoyad;
	private JTextField txtUyeMeslek;
	private JTextField txtUyeDogumYeri;
	private JTextField txtUyeEmail;
	private JTextField txtUyeYas;
	private JTextField txtUyeID;
	private JTextField txtUyeAra;
	private JTextField txtOduncÜyeNo;
	private JTextField txtOduncISBNNo;
	private JTextField txtAlISBNNo;
	private JTextField txtAlUyeNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaMenu frame = new AnaMenu();
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
	public AnaMenu() {
		setTitle("Ana Men\u00FC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SERBAY\\eclipse-workspace\\K\u00FCt\u00FCphane\\_menu_icon_home_1088196.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 639, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("KÝTAP EKLE", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(169, 169, 169));
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_3.setBounds(0, 0, 608, 416);
		panel.add(panel_3);
		
		txtKitapAdi = new JTextField();
		txtKitapAdi.setColumns(10);
		txtKitapAdi.setBounds(252, 39, 138, 20);
		panel_3.add(txtKitapAdi);
		
		txtTürü = new JTextField();
		txtTürü.setColumns(10);
		txtTürü.setBounds(252, 103, 138, 20);
		panel_3.add(txtTürü);
		
		txtYazar = new JTextField();
		txtYazar.setColumns(10);
		txtYazar.setBounds(252, 70, 138, 20);
		panel_3.add(txtYazar);
		
		JLabel lblKitap = new JLabel("Kitap Ad\u0131       :");
		lblKitap.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblKitap.setBounds(111, 40, 138, 19);
		panel_3.add(lblKitap);
		
		JLabel lblY = new JLabel("Yazar\u0131           :");
		lblY.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblY.setBounds(111, 71, 131, 19);
		panel_3.add(lblY);
		
		JLabel lblSayfaSays = new JLabel("Sayfa Say\u0131s\u0131   :");
		lblSayfaSays.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblSayfaSays.setBounds(111, 135, 131, 22);
		panel_3.add(lblSayfaSays);
		
		JLabel lblTr = new JLabel("T\u00FCr\u00FC              :");
		lblTr.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTr.setBounds(111, 104, 131, 19);
		panel_3.add(lblTr);
		
		JLabel lblYaynEvi = new JLabel("Yay\u0131n Evi       :");
		lblYaynEvi.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblYaynEvi.setBounds(111, 166, 131, 19);
		panel_3.add(lblYaynEvi);
		
		txtSayfaSayisi = new JTextField();
		txtSayfaSayisi.setColumns(10);
		txtSayfaSayisi.setBounds(252, 134, 138, 20);
		panel_3.add(txtSayfaSayisi);
		
		txtYayinEvi = new JTextField();
		txtYayinEvi.setColumns(10);
		txtYayinEvi.setBounds(252, 167, 138, 20);
		panel_3.add(txtYayinEvi);
		
		JLabel lblBasmYl = new JLabel("Bas\u0131m Y\u0131l\u0131      :");
		lblBasmYl.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblBasmYl.setBounds(111, 205, 131, 19);
		panel_3.add(lblBasmYl);
		
		txtBasimYili = new JTextField();
		txtBasimYili.setColumns(10);
		txtBasimYili.setBounds(252, 204, 138, 20);
		panel_3.add(txtBasimYili);
		
		JLabel lblAdet = new JLabel("Adet              :");
		lblAdet.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblAdet.setBounds(111, 244, 131, 20);
		panel_3.add(lblAdet);
		
		txtAdet = new JTextField();
		txtAdet.setColumns(10);
		txtAdet.setBounds(252, 244, 138, 20);
		panel_3.add(txtAdet);
		
		JButton btnEkle = new JButton("EKLE");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(txtISBN.getText().isEmpty()) && !(txtKitapAdi.getText().isEmpty()) && !(txtYazar.getText().isEmpty())&& !(txtTürü.getText().isEmpty()) && !(txtSayfaSayisi.getText().isEmpty()) && !(txtYayinEvi.getText().isEmpty()) &&  !(txtBasimYili.getText().isEmpty()) && !(txtAdet.getText().isEmpty())) {
					try {
						Integer.parseInt( txtSayfaSayisi.getText());
						Integer.parseInt( txtBasimYili.getText());
						Integer.parseInt( txtAdet.getText());
						Integer.parseInt( txtISBN.getText());
						if(Integer.parseInt( txtAdet.getText())>0)
						{
							if(txtBasimYili.getText().length()==4)
							{
								boolean buldumu=false;
								for(Kitap k : girisekrani.k.kitaplar)
								{
									if(k.ISBN==Integer.parseInt( txtISBN.getText()))
									{
										buldumu=true;
										k.Adet+= Integer.parseInt( txtAdet.getText());
									}
								}
								if(buldumu==false)
								{
									Kitap kitap = new Kitap();
									kitap.Adet=Integer.parseInt(txtAdet.getText());
									kitap.BasimYili=Integer.parseInt(txtBasimYili.getText());
									kitap.KitapAdi=txtKitapAdi.getText();
									kitap.SayfaSayisi=Integer.parseInt(txtSayfaSayisi.getText());
									kitap.Türü=txtTürü.getText();
									kitap.YayinEvi=txtYayinEvi.getText();
									kitap.Yazar=txtYazar.getText();
									kitap.ISBN=Integer.parseInt(txtISBN.getText());
									girisekrani.k.kitapEkle(kitap);
									JOptionPane.showMessageDialog(null, "Kitap Baþarýyla Eklendi", "Onay Mesajý", -1);
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Kitap Kütüphanede Mevcut. Adet Arttýrýldý.", "Durum Mesajý", -1);
								}
								
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Basým Yýlý 4 haneli olmalýdýr..", "HATA MESAJI!", -1);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Adet sayýsý 1 den küçük olamaz..", "HATA MESAJI!", -1);
						}
					} catch (Exception a) {
						JOptionPane.showMessageDialog(null, "Sayfa Sayýsý, Basým Yýlý, ISBN No veya Adet bölümünde geçersiz bir karakter kullandýnýz.. ", "HATA MESAJI!", -1);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Herhangi bir bölüm boþ geçilemez.. ", "HATA MESAJI!", -1);
				}
				txtKitapAdi.setText("");
				txtTürü.setText("");
				txtYazar.setText("");
				txtSayfaSayisi.setText("");
				txtYayinEvi.setText("");
				txtBasimYili.setText("");
				txtAdet.setText("");
				txtISBN.setText("");
			}
		});
		btnEkle.setBounds(267, 325, 123, 41);
		panel_3.add(btnEkle);
		
		txtISBN = new JTextField();
		txtISBN.setColumns(10);
		txtISBN.setBounds(252, 283, 138, 20);
		panel_3.add(txtISBN);
		
		JLabel lblIsbnNo = new JLabel("ISBN No         :");
		lblIsbnNo.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblIsbnNo.setBounds(111, 286, 138, 17);
		panel_3.add(lblIsbnNo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(169, 169, 169));
		tabbedPane.addTab("KÝTAP SÝL", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblIsbnNo_4 = new JLabel("ISBN No     :");
		lblIsbnNo_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblIsbnNo_4.setBounds(149, 136, 112, 19);
		panel_1.add(lblIsbnNo_4);
		
		txtISBNsil = new JTextField();
		txtISBNsil.setColumns(10);
		txtISBNsil.setBounds(271, 135, 139, 20);
		panel_1.add(txtISBNsil);
		
		JButton btnSil = new JButton("K\u0130TABI S\u0130L");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean varmi=false;
				try
				{
					for(Kitap k1 : girisekrani.k.kitaplar )
					{
						
					  if(k1.ISBN ==Integer.parseInt(txtISBNsil.getText())) {
						  if(Integer.parseInt(txtAdetSil.getText())<k1.Adet)
						  {
							  k1.Adet-=Integer.parseInt(txtAdetSil.getText());
							  JOptionPane.showMessageDialog(null, "Girilen Adet kadar kitap baþarýyla silindi.. ", "ONAY MESAJI!", -1);
						  }
						  else if(Integer.parseInt(txtAdetSil.getText())==k1.Adet)
						  {
							  girisekrani.k.kitaplar.remove(k1);
							  JOptionPane.showMessageDialog(null, "Kitap tamamen silindi.. ", "ONAY MESAJI!", -1);
						  }
						  else if(Integer.parseInt(txtAdetSil.getText())>k1.Adet)
						  {
							  JOptionPane.showMessageDialog(null, "Girilen adet kütüphanedeki adetten daha fazla.. ", "HATA MESAJI!", -1);
						  }
						  varmi=true;
						  break;
					  }
				 }
				}
					catch(Exception h)
					{
						JOptionPane.showMessageDialog(null, "ISBN veya Adet bölümünde geçersiz karakter kullanýldý.. ", "HATA MESAJI!", -1);
						varmi=true;
					}
				if(varmi==false)
				{
					JOptionPane.showMessageDialog(null, "Kitap Kütüphanede Bulunmuyor.. ", "HATA MESAJI!", -1);
				}
				txtISBNsil.setText("");
				txtAdetSil.setText("");
				
			}
		});
		btnSil.setBounds(271, 197, 139, 39);
		panel_1.add(btnSil);
		
		JLabel lblAdet_1 = new JLabel("Adet           :");
		lblAdet_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblAdet_1.setBounds(149, 167, 115, 19);
		panel_1.add(lblAdet_1);
		
		txtAdetSil = new JTextField();
		txtAdetSil.setColumns(10);
		txtAdetSil.setBounds(271, 166, 139, 20);
		panel_1.add(txtAdetSil);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setToolTipText("");
		tabbedPane.addTab("KÝTAP ARA", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblIsbnNo_3 = new JLabel("ISBN No     :");
		lblIsbnNo_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblIsbnNo_3.setBounds(141, 45, 110, 17);
		panel_2.add(lblIsbnNo_3);
		
		txtISBNara = new JTextField();
		txtISBNara.setColumns(10);
		txtISBNara.setBounds(261, 45, 131, 20);
		panel_2.add(txtISBNara);
		JLabel lblKitapAdi = new JLabel("");
		lblKitapAdi.setBounds(185, 136, 229, 14);
		panel_2.add(lblKitapAdi);
		
		JLabel lblYazar = new JLabel("");
		lblYazar.setBounds(185, 155, 229, 20);
		panel_2.add(lblYazar);
		
		JLabel lblTürü = new JLabel("");
		lblTürü.setBounds(185, 186, 229, 19);
		panel_2.add(lblTürü);
		
		JLabel lblSayfaSayisi = new JLabel("");
		lblSayfaSayisi.setBounds(185, 210, 229, 20);
		panel_2.add(lblSayfaSayisi);
		
		JLabel lblBasimYili = new JLabel("");
		lblBasimYili.setBounds(185, 235, 229, 20);
		panel_2.add(lblBasimYili);
		
		JLabel lblYayinEvi = new JLabel("");
		lblYayinEvi.setBounds(185, 260, 229, 20);
		panel_2.add(lblYayinEvi);
		
		JLabel lblAdeti = new JLabel("");
		lblAdeti.setBounds(185, 286, 229, 20);
		panel_2.add(lblAdeti);
		
		Button btnKitapAra = new Button("K\u0130TABI ARA");
		btnKitapAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean varmii=false;
				try
				{
					for(Kitap k2: girisekrani.k.kitaplar )
					{
						if(k2.ISBN == Integer.parseInt(txtISBNara.getText()))
						{
							varmii=true;
							lblKitapAdi.setText("Kitap Adý : " + k2.KitapAdi);
							lblYazar.setText("Yazar : " + k2.Yazar);
							lblTürü.setText("Türü : " + k2.Türü);
							lblSayfaSayisi.setText("Sayfa Sayýsý :" + Integer.toString(k2.SayfaSayisi));
							lblBasimYili.setText("Basým Yýlý : " + Integer.toString(k2.BasimYili));
							lblYayinEvi.setText("Yayýn Evi : " + k2.YayinEvi);
							lblAdeti.setText("Adet : " + Integer.toString(k2.Adet));
							
						}
					}
				}
				catch(Exception d){
					 JOptionPane.showMessageDialog(null, "ISBN bölümünde geçersiz karakter kullanýldý..", "HATA MESAJI!", -1);
					 varmii=true;
				}
				if(varmii==false)
				{
					JOptionPane.showMessageDialog(null, "Kitap Kütüphanede Yok...", "HATA MESAJI!", -1);
				}
				txtISBNara.setText("");
			}
		});
		btnKitapAra.setBounds(261, 84, 131, 30);
		panel_2.add(btnKitapAra);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(169, 169, 169));
		tabbedPane.addTab("ÖDÜNÇ KÝTAP VERME", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblyeNo_2 = new JLabel("\u00DCye No   :");
		lblyeNo_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblyeNo_2.setBounds(149, 134, 90, 19);
		panel_8.add(lblyeNo_2);
		
		txtOduncÜyeNo = new JTextField();
		txtOduncÜyeNo.setColumns(10);
		txtOduncÜyeNo.setBounds(249, 135, 128, 20);
		panel_8.add(txtOduncÜyeNo);
		
		JLabel lblIsbnNo_1 = new JLabel("ISBN No  :");
		lblIsbnNo_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblIsbnNo_1.setBounds(149, 164, 90, 19);
		panel_8.add(lblIsbnNo_1);
		
		txtOduncISBNNo = new JTextField();
		txtOduncISBNNo.setColumns(10);
		txtOduncISBNNo.setBounds(249, 166, 128, 20);
		panel_8.add(txtOduncISBNNo);
		
		Button btnKitapOduncVer = new Button("K\u0130TABI \u00D6D\u00DCN\u00C7 VER");
		btnKitapOduncVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean verilmismi=false;
				boolean uyeyibuldumu=false;
				boolean kitabibuldumu=false;
				try
				{
					Integer.parseInt(txtOduncÜyeNo.getText());
					Integer.parseInt(txtOduncISBNNo.getText());
					for(Uye u1 : girisekrani.k.uyeler)
					{ 
						if(u1.getUyeID()==Integer.parseInt(txtOduncÜyeNo.getText()))
						{
							uyeyibuldumu=true;
							if(u1.alinankitaplar.size()<5)
							{
								for(Kitap k1 : girisekrani.k.kitaplar)
								{
									if(k1.ISBN==Integer.parseInt(txtOduncISBNNo.getText()))
									{   kitabibuldumu=true;
										for(Kitap k2  : u1.alinankitaplar)
										{
											if(k2.ISBN==k1.ISBN)
											{
												JOptionPane.showMessageDialog(null, "Ýstenen kitap zaten ödünç verildiði için iþlem gerçekleþtirilemiyor..", "HATA MESAJI!", -1);
												verilmismi=true;
												break;
											}	
										}
										if(verilmismi==false)
										{
											if(k1.Adet>0)
											{
												k1.Adet--;
												u1.alinankitaplar.add(k1);
												JOptionPane.showMessageDialog(null, "Kitap ödünç verme iþlemi baþarýyla tamamlanmýþtýr..", "ONAY MESAJI!", -1);
											}
											else
											{
												JOptionPane.showMessageDialog(null, "Bu ISBN No'ya ait kitap kütüphanede þu an mevcut deðil..", "HATA MESAJI!", -1);
											}
										}
										
									}
								}
								if(kitabibuldumu==false)
								{
									JOptionPane.showMessageDialog(null, "Bu ISBN No'ya ait kitap bulunamadý..", "HATA MESAJI!", -1);
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Kitap Ödünç Alma limitini aþýldýðý için iþlem gerçekleþtirilemiyor..", "HATA MESAJI!", -1);
								break;
							}
						}	
					}
					
					if(uyeyibuldumu==false)
					{
						JOptionPane.showMessageDialog(null, "Bu Üye No'ya ait üye bulunamadý..", "HATA MESAJI!", -1);
					}
					
				}
				catch(Exception z)
				{
					JOptionPane.showMessageDialog(null, "Herhangi bir bölümde geçersiz karakter kullandýnýz..", "HATA MESAJI!", -1);
				}
				txtOduncÜyeNo.setText("");
				txtOduncISBNNo.setText("");
			}
		});
		btnKitapOduncVer.setBounds(249, 202, 128, 34);
		panel_8.add(btnKitapOduncVer);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(169, 169, 169));
		tabbedPane.addTab("KÝTABI GERÝ ALMA", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblIsbnNo_2 = new JLabel("ISBN No  :");
		lblIsbnNo_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblIsbnNo_2.setBounds(146, 167, 90, 19);
		panel_9.add(lblIsbnNo_2);
		
		txtAlISBNNo = new JTextField();
		txtAlISBNNo.setColumns(10);
		txtAlISBNNo.setBounds(247, 166, 131, 20);
		panel_9.add(txtAlISBNNo);
		
		JLabel lblyeNo_1 = new JLabel("\u00DCye No   :");
		lblyeNo_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblyeNo_1.setBounds(146, 126, 90, 20);
		panel_9.add(lblyeNo_1);
		
		txtAlUyeNo = new JTextField();
		txtAlUyeNo.setColumns(10);
		txtAlUyeNo.setBounds(246, 125, 132, 20);
		panel_9.add(txtAlUyeNo);
		
		Button btnGeriAl = new Button("K\u0130TABI GER\u0130 AL");
		btnGeriAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean uyeyibuldumu=false;
				boolean kitabibuldumu=false;
				try
				{
					Integer.parseInt(txtAlISBNNo.getText());
					Integer.parseInt(txtAlUyeNo.getText());
					for(Uye u1 : girisekrani.k.uyeler)
					{ 
						if(u1.getUyeID()==Integer.parseInt(txtAlUyeNo.getText()))
						{
							uyeyibuldumu=true;
							for(Kitap k  : u1.alinankitaplar)
							{
								if(k.ISBN==Integer.parseInt(txtAlISBNNo.getText()))
								{
									kitabibuldumu=true;
									k.Adet++;
									u1.alinankitaplar.remove(k);
									JOptionPane.showMessageDialog(null, "Kitabý geri alma iþlemi baþarýyla tamamlanmýþtýr..", "ONAY MESAJI!", -1);
									break;
								}
							}
							if(kitabibuldumu==false)
							{
								JOptionPane.showMessageDialog(null, "Girilen ISBN No'ya ait kitap bulunamadý veya Bu kitap bu kiþi tarafýndan ödünç alýnmamýþ...", "HATA MESAJI!", -1);
							}
						}	
					}
					if(uyeyibuldumu==false)
					{
						JOptionPane.showMessageDialog(null, "Girilen Üye No'ya ait üye bulunamadý...", "HATA MESAJI!", -1);
					}
				}
				catch(Exception m)
				{
					 JOptionPane.showMessageDialog(null, "Herhangi bir bölümde geçersiz karakter kullanýldý..", "HATA MESAJI!", -1);
				}
				txtAlUyeNo.setText("");
				txtAlISBNNo.setText("");
			}
		});
		btnGeriAl.setActionCommand("");
		btnGeriAl.setBounds(247, 205, 131, 36);
		panel_9.add(btnGeriAl);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("ÜYE KAYDI", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(169, 169, 169));
		panel_5.setLayout(null);
		panel_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_5.setBounds(0, 0, 608, 416);
		panel_4.add(panel_5);
		
		txtUyeAdSoyad = new JTextField();
		txtUyeAdSoyad.setColumns(10);
		txtUyeAdSoyad.setBounds(293, 70, 140, 20);
		panel_5.add(txtUyeAdSoyad);
		
		txtUyeMeslek = new JTextField();
		txtUyeMeslek.setColumns(10);
		txtUyeMeslek.setBounds(293, 101, 140, 20);
		panel_5.add(txtUyeMeslek);
		
		JLabel lblAdVeSoyad = new JLabel("Ad ve Soyad    :");
		lblAdVeSoyad.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblAdVeSoyad.setBounds(145, 68, 138, 20);
		panel_5.add(lblAdVeSoyad);
		
		JLabel lblMeslek = new JLabel("Meslek            :");
		lblMeslek.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblMeslek.setBounds(145, 102, 138, 19);
		panel_5.add(lblMeslek);
		
		JLabel lblDoumYeri = new JLabel("Do\u011Fum Yeri     :");
		lblDoumYeri.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoumYeri.setBounds(145, 165, 138, 23);
		panel_5.add(lblDoumYeri);
		
		JLabel lblEmail = new JLabel("Email              :");
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblEmail.setBounds(145, 199, 138, 19);
		panel_5.add(lblEmail);
		
		txtUyeDogumYeri = new JTextField();
		txtUyeDogumYeri.setColumns(10);
		txtUyeDogumYeri.setBounds(293, 165, 140, 20);
		panel_5.add(txtUyeDogumYeri);
		
		txtUyeEmail = new JTextField();
		txtUyeEmail.setColumns(10);
		txtUyeEmail.setBounds(293, 198, 140, 20);
		panel_5.add(txtUyeEmail);
		JRadioButton rdoUyeKadin = new JRadioButton("Kad\u0131n ");
		rdoUyeKadin.setBounds(370, 233, 63, 23);
		JRadioButton rdoUyeErkek = new JRadioButton("Erkek");
		rdoUyeErkek.setSelected(true);
		rdoUyeErkek.setBounds(289, 234, 63, 21);
		panel_5.add(rdoUyeErkek);	
		panel_5.add(rdoUyeKadin);
		rdoUyeKadin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoUyeKadin.isSelected())
				{
					rdoUyeErkek.setSelected(false);
				}
				else
				{
					rdoUyeErkek.setSelected(true);
				}
				
			}
		});
		
		
		JLabel lblCinsiyet = new JLabel("Cinsiyet          :");
		lblCinsiyet.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCinsiyet.setBounds(145, 232, 138, 20);
		panel_5.add(lblCinsiyet);
		
	
		rdoUyeErkek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoUyeErkek.isSelected())
				{
					rdoUyeKadin.setSelected(false);
				}
				else
				{
					rdoUyeKadin.setSelected(true);
				}
			}
		});
		
		
		JButton btnUyeKaydol = new JButton("Kay\u0131t Ol");
		btnUyeKaydol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					boolean bulundu=false;
					String pattern="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
					Pattern r = Pattern.compile(pattern);
					Matcher m =r.matcher(txtUyeEmail.getText());
					Integer.parseInt(txtUyeYas.getText());
					if(!(txtUyeAdSoyad.getText().isEmpty()) && !(txtUyeMeslek.getText().isEmpty()) && !(txtUyeYas.getText().isEmpty()) && !(txtUyeEmail.getText().isEmpty()) && !(txtUyeDogumYeri.getText().isEmpty())) {
						if(m.find())
						{
							for(Uye u  : girisekrani.k.uyeler)
							{
								if(txtUyeEmail.getText().compareToIgnoreCase(u.Email)==0)
								{
									bulundu=true;
									JOptionPane.showMessageDialog(null, "Böyle bir üyelik zaten mevcut..", "HATA MESAJI!", -1);
									
								}
							}
							if(bulundu==false)
							{
								Uye u = new Uye(girisekrani.uyesayac);
								u.AdSoyad = txtUyeAdSoyad.getText();
								u.Meslek = txtUyeMeslek.getText();
								u.Yas =  Integer.parseInt(txtUyeYas.getText());
								u.Email = txtUyeEmail.getText();
								u.DogumYeri = txtUyeDogumYeri.getText();
								if(rdoUyeErkek.isSelected())
								 {
									 u.Cinsiyet="Erkek";
								 }
								 else
								 {
									 u.Cinsiyet="Kadýn";
								 }
								girisekrani.k.uyeler.add(u);
								JOptionPane.showMessageDialog(null, "Kayýt baþarýyla tamamlandý...", "ONAY MESAJI!", -1);
								girisekrani.uyesayac++;
								
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Emaili yanlýþ girdiniz", "HATA MESAJI!", -1);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Herhangi bir bölüm boþ geçilemez..", "HATA MESAJI!", -1);
					}
				}
				catch(Exception s)
				{
						JOptionPane.showMessageDialog(null, "Yaþ bölümünde geçersiz bir karakter kullandýnýz..", "HATA MESAJI!", -1);
				}	
				txtUyeAdSoyad.setText("");
				txtUyeMeslek.setText("");
				txtUyeDogumYeri.setText("");
				txtUyeEmail.setText("");
				txtUyeYas.setText("");
				
			}
		});
		btnUyeKaydol.setBounds(303, 276, 100, 37);
		panel_5.add(btnUyeKaydol);
		
		JLabel lblYa = new JLabel("Ya\u015F                :");
		lblYa.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblYa.setBounds(145, 132, 138, 22);
		panel_5.add(lblYa);
		
		txtUyeYas = new JTextField();
		txtUyeYas.setColumns(10);
		txtUyeYas.setBounds(293, 134, 140, 20);
		panel_5.add(txtUyeYas);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(169, 169, 169));
		tabbedPane.addTab("ÜYE ARA", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblyeNo = new JLabel("\u00DCye No :");
		lblyeNo.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblyeNo.setBounds(170, 50, 85, 23);
		panel_7.add(lblyeNo);
		
		txtUyeAra = new JTextField();
		txtUyeAra.setColumns(10);
		txtUyeAra.setBounds(265, 53, 110, 20);
		panel_7.add(txtUyeAra);
		
		Button btnUyeAra = new Button("\u00DCYE ARA");
		btnUyeAra.setBounds(265, 92, 110, 30);
		panel_7.add(btnUyeAra);
		
		JLabel lblUyeMeslek = new JLabel("");
		lblUyeMeslek.setBounds(197, 187, 225, 23);
		panel_7.add(lblUyeMeslek);
		
		JLabel lblUyeAdSoyad = new JLabel("");
		lblUyeAdSoyad.setBounds(197, 153, 225, 23);
		panel_7.add(lblUyeAdSoyad);
		
		JLabel lblUyeYas = new JLabel("");
		lblUyeYas.setBounds(197, 221, 225, 23);
		panel_7.add(lblUyeYas);
		
		JLabel lblUyeCinsiyet = new JLabel("");
		lblUyeCinsiyet.setBounds(197, 255, 225, 23);
		panel_7.add(lblUyeCinsiyet);
		
		JLabel lblUyeEmail = new JLabel("");
		lblUyeEmail.setBounds(197, 289, 225, 23);
		panel_7.add(lblUyeEmail);
		
		JLabel lblUyeDogumYeri = new JLabel("");
		lblUyeDogumYeri.setBounds(197, 323, 225, 23);
		panel_7.add(lblUyeDogumYeri);
		btnUyeAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean uyevarmi=false;
				try
				{
					Integer.parseInt(txtUyeAra.getText());
					for(Uye u2: girisekrani.k.uyeler )
					{
						if(u2.getUyeID() == Integer.parseInt(txtUyeAra.getText()))
						{
							uyevarmi=true;
							lblUyeAdSoyad.setText("Üye Adý ve Soyadý : " + u2.AdSoyad);
							lblUyeMeslek.setText("Mesleði : " + u2.Meslek);
							lblUyeYas.setText("Yaþý : " + Integer.toString(u2.Yas));
							lblUyeCinsiyet.setText("Cinsiyeti :" + u2.Cinsiyet);
							lblUyeEmail.setText("Emaili : " + u2.Email);
							lblUyeDogumYeri.setText("Doðum Yeri : " + u2.DogumYeri);
							break;
						}
					}
					if(uyevarmi==false)
					{
						JOptionPane.showMessageDialog(null, "Bu Üye No'ya sahip üye yok...", "HATA MESAJI!", -1);
					}
				}
				catch(Exception d){
					 JOptionPane.showMessageDialog(null, "Üye No bölümünde geçersiz karakter kullanýldý..", "HATA MESAJI!", -1);
				}
				txtUyeAra.setText("");
			}
		});	
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(169, 169, 169));
		tabbedPane.addTab("ÜYE SÝLME", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblUyeId = new JLabel("\u00DCye No   :");
		lblUyeId.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblUyeId.setBounds(170, 131, 91, 21);
		panel_6.add(lblUyeId);
		
		txtUyeID = new JTextField();
		txtUyeID.setColumns(10);
		txtUyeID.setBounds(271, 132, 130, 21);
		panel_6.add(txtUyeID);
		
		JButton btnUyeSil = new JButton("\u00DCYEY\u0130 S\u0130L");
		btnUyeSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean uyevarmi=false;
				try {
					for(Uye u1 : girisekrani.k.uyeler)
					{
						if(u1.getUyeID() == Integer.parseInt(txtUyeID.getText()))
						{
							girisekrani.k.uyeler.remove(u1);
							JOptionPane.showMessageDialog(null, "Kayýt baþarýyla silinmiþtir..", "ONAY MESAJI!", -1);
							uyevarmi=true;
							break;
						}
					}
					if(uyevarmi==false)
					{
						JOptionPane.showMessageDialog(null, "Kayýt Bulunamadý..", "HATA MESAJI!", -1);
					}
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, "Üye No bölümünde geçersiz karakter kullanýldý..", "HATA MESAJI!", -1);
				}
				txtUyeID.setText("");
				
			}
		});
		btnUyeSil.setBounds(271, 172, 130, 35);
		panel_6.add(btnUyeSil);
	}
}
