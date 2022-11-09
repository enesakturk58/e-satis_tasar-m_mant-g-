public class Urun {

    String isim;
    Double fiyat;

    public Urun(String isim,Double fiyat){
    setFiyat(fiyat);
    setIsim(isim);
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
