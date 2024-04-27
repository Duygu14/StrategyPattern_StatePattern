import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(new Kitap("Design Patterns","Erich Gamma",400));
        kitaplar.add(new Kitap("Clean Code","Robert C. Martin",464));
        kitaplar.add(new Kitap("Java: The Complete Reference","Herbert Schildt",1248));


        //onerilen ve populer kitapları da ekleme
        kitaplar.add(new Kitap("Design Patterns","Erich Gamma",400,true,false));
        kitaplar.add(new Kitap("Clean Code","Robert C. Martin",464,false,false));
        kitaplar.add(new Kitap("Java: The Complete Reference","Herbert Schildt",1248,false,true));

        Kutuphane kutuphane = new Kutuphane();
        //Adına göre sıralama stratejisi
        KitapSiralamaStrategy adinaGoreSiralamaStrategy = new AdinaGoreSiralamaStrategy();
        //yazara göre sıralama stratejisi
        KitapSiralamaStrategy yazaraGoreSiralamaStrategy = new YazaraGoreSiralamaStrategy();
        //sayfa sayısınıa göre sıralama stratejisi
        KitapSiralamaStrategy sayfaSayisinaGoreSiralamaStrategy = new SayfaSayisinaGoreSiralama();

        //Popüler kitaplar durumu
        KitapState popularKitapState = new PopulerKitaplarState();
        //Önerilen kitaplar durumu
        //KitapState onerilenKitapState = new OnerilenKitaplarState();

        //kutuphane.setSortingStrategy(adinaGoreSiralamaStrategy);
        kutuphane.setSortingStrategy(yazaraGoreSiralamaStrategy);
       // kutuphane.setSortingStrategy(sayfaSayisinaGoreSiralamaStrategy);

        kutuphane.kitaplariListele(kitaplar);
        kutuphane.setState(popularKitapState);
        kutuphane.kitaplarinGuncelDurumunuListele(kitaplar);

    }
}







