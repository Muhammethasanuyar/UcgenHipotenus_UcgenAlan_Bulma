import java.util.Scanner;

public class UcgenHipotenus_UcgenAlan_Bulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double a;
            double b;
            double c;
            int tercih;
            double u;
            double f;
            System.out.print("üçgenin 1. kenarını giriniz : ");
            a = scanner.nextInt();

            System.out.print("üçgenin 2. kenarını giriniz : ");
            b = scanner.nextInt();

            System.out.print("üçgenin 3. kenarını giriniz : ");
            c = scanner.nextInt();

            u = a + b + c;

            f = (u / 2 * (u / 2 - a) * (u / 2 - b) * (u / 2 - c));
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
                    || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
                System.out.println("\n******************");
                System.out.println("BU BİR DİK ÜÇGENDİR ! ");
                System.out.println("******************");

            } else {
                System.out.println("******************");
                System.out.println("BU BİR DİK ÜÇGEN DEĞİLDİR!");
                System.out.println("******************");
            }
            if ((a - b) < c && c < (a + b) && (a - c) < b && b < (a + c) && (b - c) < a && a < (b + c)) {
                System.out.println("\nüçgenin çevresi : " + (int) u);
                System.out.println("üçgenin alanı : " + Math.sqrt(f));
                System.out.println("\nDEVAM ETMEK İSTER MİSİNİZ ? ( evetse 1 , hayırsa 2)");
                tercih = scanner.nextInt();
                if (tercih == 1) {
                } else {
                    System.out.println("program sonlanıyor...");
                    break;
                }
            }

            else {
                System.out.print("UYARI : ");
                System.out.println(
                        "böyle bir üçgen oluşturulamaz!\n****************** \nTEKRAR DENEYİNİZ \n******************");
            }
        }
    }
}
