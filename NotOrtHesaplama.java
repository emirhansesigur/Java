import java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args) {
        int mat, fizik, lineer;

        Scanner inp = new Scanner(System.in);

        System.out.print("mat: ");
        mat = inp.nextInt();

        System.out.print("fiz: ");
        fizik = inp.nextInt();

        System.out.print("lineer: ");
        lineer = inp.nextInt();

        double ort = (mat + fizik + lineer);
        ort/=3;

        System.out.println(ort);
        String gectimi = ort>60?"gecit":"kaldi";
        System.out.print(gectimi);
    }
}