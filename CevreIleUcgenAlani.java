import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        // 3 kenari verilen ucgenin alanini hesaplama
        double k1,k2,k3,alankare,cevre,u,sonuc;
        Scanner input = new Scanner (System.in);

        //kenarlari iste

        System.out.print("Kenar 1 i giriniz: ");
        k1 = input.nextDouble();
        System.out.print("Kenar 2 i giriniz: ");
        k2 = input.nextDouble();
        System.out.print("Kenar 3 i giriniz: ");
        k3 = input.nextDouble();

        cevre=k1+k2+k3;
        u=cevre/2;
        //alan kare bul
        alankare=u*(u-k1)*(u-k2)*(u-k3);
        //alan bul
        sonuc=Math.sqrt(alankare);

        System.out.println("Alan: "+sonuc);

    }
}
