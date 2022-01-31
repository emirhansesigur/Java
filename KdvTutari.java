import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        // deger  al sonra kdv mik bul
        float tutar,kdvOran,kdvTutari,kdvliTutar;

        // input icin
        Scanner inp = new Scanner(System.in);

        // tutar gir
        System.out.print("tutar giriniz: ");
        tutar = inp.nextFloat();

        kdvOran = (tutar>1000) ? (0.08f) : (0.18f);
        System.out.println("KDV orani: " + kdvOran);

        //KDV tutari
        kdvTutari = kdvOran*tutar;
        System.out.println("kdvTutari: "+kdvTutari);

        //KDV li tutar
        kdvliTutar = tutar + kdvTutari;
        System.out.println("kdvliTutar: "+kdvliTutar);
    }

}
