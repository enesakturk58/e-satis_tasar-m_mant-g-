import java.util.ArrayList;
import java.util.List;

public class Satici extends Kullanici{

    List<Urun> urunler=new ArrayList<Urun>();
    @Override
    public void uruneBak(Urun urun) {

    }
    public void uruneEkle(Urun urun) {
        urunler.add(urun);
    }



}
