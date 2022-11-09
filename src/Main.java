public class Main {
    public static void main(String[] args) {

        Musteri musteri1 = new Musteri();
        Musteri musteri2 = new Musteri();
        Urun urun1 = new Urun("Macbook Pro",25000.0);
        Urun urun2 = new Urun("Macbook Air",19000.0);

        musteri1.sepeteEkle(urun1);
        musteri1.sepeteEkle(urun2);
        musteri2.sepeteEkle(urun1);

        System.out.println("Müsteri 1 sepet :  " + musteri1.getSepetim().sepetHesapla());
        System.out.println("Müsteri 2 sepet :  " + musteri2.getSepetim().sepetHesapla());

        urun1.urunBilgi();


    }
}