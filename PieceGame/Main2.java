import java.util.Scanner;
public class Main2 {

            public static XmiOmu[][] tas = new XmiOmu[3][3];

            public static void main(String[] args) {
                tas[0][0] = new XmiOmu("a");
                tas[0][1] = new XmiOmu("a");
                tas[0][2] = new XmiOmu("a");
                tas[1][0] = new XmiOmu("a");
                tas[1][1] = new XmiOmu("a");
                tas[1][2] = new XmiOmu("a");
                tas[2][0] = new XmiOmu("a");
                tas[2][1] = new XmiOmu("a");
                tas[2][2] = new XmiOmu("a");
                System.out.println("""
                        Welcome to the game
                        Let's start with explaining the Rules of the Game
                        It is a game for two players, there are 2 types of pieces, X and O.
                        There are 9 squares, which are 3 rows and 3 columns and the pieces will be put on those positions.
                        The player who brings 3 pieces side by side wins the game.
                        """);
                if (kimBaslayacak()) {
                    while (true) {
                        if (!oyunBittiMi()) {
                            oyunTahtasi(); // gostermeyi yapacağız
                            XOyna();
                        } else {
                            oyunTahtasi();
                            System.out.println("\n***Kazanan O***");
                            break;
                        }
                        if (!oyunBittiMi()) {
                            oyunTahtasi(); // gostermeyi yapacağız
                            OOyna();
                        } else {
                            oyunTahtasi();
                            System.out.println("\n***Kazanan X***");
                            break;
                        }
                    }
                } else {
                    while (true) {
                        if (!oyunBittiMi()) {
                            oyunTahtasi(); // gostermeyi yapacağız
                            OOyna();
                        } else {
                            oyunTahtasi();
                            System.out.println("Kazanan X");
                            break;
                        }
                        if (!oyunBittiMi()) {
                            oyunTahtasi(); // gostermeyi yapacağız
                            XOyna();
                        } else {
                            oyunTahtasi();
                            System.out.println("Kazanan O");
                            break;
                        }
                    }
                }

            }

            public static void oyunTahtasi() {
                // oyun tahtasini gosteren method
                for (int i = 0; i < 3; i++) {
                    System.out.println("");
                    for (int j = 0; j < 3; j++) {
                        if (tas[i][j].getDeger() != "a") {
                            System.out.print("| " + tas[i][j].getDeger() + " |");
                        } else {
                            System.out.print("|   |");
                        }
                    }
                }
            }


            public static boolean kimBaslayacak() { // ilk tas secme
                // oyunun oynandığı yer
                // ilk hangisi???
                Scanner input = new Scanner(System.in);

                System.out.print("X mi olmak istersin O mu :");
                while (true) { // ilk hangi tas baslar sonra tas tas oynama.
                    String baslangicKontrol = input.nextLine();
                    if (baslangicKontrol.equals("X") || baslangicKontrol.equals("x")) {
                        return true;
                    } else if (baslangicKontrol.equals("O") || baslangicKontrol.equals("o")) {
                        return false;
                    } else {
                        return kimBaslayacak();
                    }


                }
            }

            public static void XOyna() {
                int i=0;
                Scanner input = new Scanner(System.in);
                System.out.println("\n--X'in Hamkesi--\nilk pozisyonu giziniz: ");
                int ilk = input.nextInt();
                System.out.println("ikinci pozisyonu giriniz: ");
                int iki = input.nextInt();

                if(!tas[ilk][iki].isOynandiMi()){
                    tas[ilk][iki].setDeger("X");
                    tas[ilk][iki].setOynandiMi(true);
                }
                else{
                    System.out.println("!!! ->Daha once bu alana oynandı");
                    oyunTahtasi();
                    XOyna();
                }

            }

            public static void OOyna() {
                Scanner input = new Scanner(System.in);
                System.out.println("\n--O'nun Hamlesi--\nilk pozisyonu giziniz: ");
                //
                int ilk = input.nextInt();
                System.out.println("ikinci pozisyonu giriniz: ");
                int iki = input.nextInt();

                if(!tas[ilk][iki].isOynandiMi()){
                    tas[ilk][iki].setDeger("O");
                    tas[ilk][iki].setOynandiMi(true);
                }
                else{
                    System.out.println("!!! ->Daha once bu alana oynandı");
                    oyunTahtasi();
                    OOyna();
                }
            }

            public static boolean oyunBittiMi() {
                for (int i = 0; i < 3; i++) {
                    String kelime = "";
                    for (int j = 0; j < 3; j++) {
                        kelime += tas[i][j].getDeger();
                    }
                    if (kelime.equals("XXX") || kelime.equals("OOO")) {
                        System.out.println("Game over");
                        return true;
                    }
                }

                for (int i = 0; i < 3; i++) {
                    String kelime = "";
                    for (int j = 0; j < 3; j++) {
                        kelime += tas[j][i].getDeger();
                    }
                    if (kelime.equals("XXX") || kelime.equals("OOO")) {
                        System.out.println("Game over");
                        return true;
                    }
                }

                String kelime = tas[0][0].getDeger() + tas[1][1].getDeger() + tas[2][2].getDeger();
                String kelime2 = tas[2][0].getDeger() + tas[1][1].getDeger() + tas[0][2].getDeger();
                if (kelime.equals("XXX") || kelime.equals("OOO") || kelime2.equals("XXX") || kelime2.equals("OOO")  ) {
                    System.out.println("Game over");
                    return true;
                }

                return false;
            }

}
