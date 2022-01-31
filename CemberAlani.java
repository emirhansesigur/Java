import java.sql.SQLOutput;
import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        //Yaricapi r, merkez acisinin olcusu a olan daire diliminin alani bulan programi yaziniz.

        Scanner inp = new Scanner(System.in);
        int r, a;
        float alan,pi;
        pi=3.14F;
        // degerli al
        System.out.print("Yaricappp uzunlugu: ");
        r = inp.nextInt();
        System.out.print("a acisini giriniz: ");
        a = inp.nextInt();

        // formul
        alan = (pi*r*r*a)/360;

        System.out.print("Alan: " + alan);

    }
}
