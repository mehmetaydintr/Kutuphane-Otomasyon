import java.util.ArrayList;

public class Uye {
public String AdSoyad;
public String Meslek;
public int Yas;
public String Cinsiyet;
public String Email;
public String DogumYeri;
private int UyeID;
ArrayList<Kitap> alinankitaplar = new ArrayList<Kitap>();
Uye(int sayac)
{
	this.UyeID=sayac;
}
public int getUyeID()
{
return UyeID;
}


}
