import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total , startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = (km * perKm);
        total +=startPrice;

        total=(total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);

        }
    }
