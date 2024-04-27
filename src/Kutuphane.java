import java.util.List;
//3.Context class
public class Kutuphane {
    private KitapSiralamaStrategy siralamaStrategy;
    public Kutuphane(){
        //
    }
     public void setSortingStrategy(KitapSiralamaStrategy siralamaStrategy){
        this.siralamaStrategy= siralamaStrategy;
     }
     public void kitaplariListele(List<Kitap> kitaplar){
        //kitapları belirlenen stratejiye göre sırala ve listele
         siralamaStrategy.sort(kitaplar);
         for(Kitap kitap: kitaplar){
             System.out.println(kitap);
         }
     }
     private KitapState guncelDurum;
    public void setState(KitapState state){
        this.guncelDurum=state;
    }
    public void kitaplarinGuncelDurumunuListele(List<Kitap> kitaplar){
        guncelDurum.kitapGoruntule(kitaplar);
    }


}
