/**
 * Created by dawid on 24.07.15.
 */
import java.util.Scanner;
import java.util.Random;
public class HigherLower {
    public static void main(String[] args){
        System.out.println("Gra Higher - Lower");
        System.out.println("       MENU       ");
        System.out.println("1.Liczby.         ");
        System.out.println("2.Karty.          ");
        System.out.println("3.Wyjście.        ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("Liczby.");
                System.out.print("test");
                break;

            case 2:
                System.out.println("Karty.");

                break;

            case 3:
                System.exit(99);
        }

    }
}
