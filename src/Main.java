import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("podaj liczbe: ");

        Scanner sc = new Scanner(System.in);
        double zmiennoprzecinkowa = sc.nextDouble();
        int calkowita = (int) zmiennoprzecinkowa;

        System.out.println("liczba całkotita to " + calkowita);

        sc.close();

    }
}