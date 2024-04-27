public class Kitap {
    private String adi;
    private String yazar;
    private int sayfaSayisi;
    private boolean populerMi;
    private boolean onerilen;

    public Kitap(String adi, String yazar, int sayfaSayisi) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public Kitap(String adi, String yazar, int sayfaSayisi, boolean populerMi, boolean onerilen) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.populerMi = populerMi;
        this.onerilen = onerilen;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public boolean isPopulerMi() {
        return populerMi;
    }

    public void setPopulerMi(boolean populerMi) {
        this.populerMi = populerMi;
    }

    public boolean isOnerilen() {
        return onerilen;
    }

    public void setOnerilen(boolean onerilen) {
        this.onerilen = onerilen;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazar='" + yazar + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", populerMi=" + populerMi +
                ", onerilen=" + onerilen +
                '}';
    }
}
