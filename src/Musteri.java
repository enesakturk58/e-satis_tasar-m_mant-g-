public class Musteri extends Kullanici{

    Sepet sepetim=new Sepet();
    @Override
    public void uruneBak(Urun urun) {}
    public void sepeteEkle(Urun urun){
        sepetim.sepeteUrunEkle(urun);
    }
    public Sepet getSepetim(){
        return sepetim;
    }

}
