import java.awt.List;
import java.util.ArrayList;

public class Kutuphane {
	ArrayList<Personel> personeller = new ArrayList<Personel>();
	ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();
	ArrayList<Uye> uyeler = new ArrayList<Uye>();
	public void personelEkle(Personel p)
	{
		personeller.add(p);
	}
	public void kitapEkle(Kitap k)
	{
		kitaplar.add(k);
	}
	public void UyeEkle(Uye u)
	{
		uyeler.add(u);
	}
	
}
