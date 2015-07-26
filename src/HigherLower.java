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
        System.out.print(": ");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                for(int i = 0; i<100;i++){
                    System.out.println();
                }
                System.out.println("1.Liczby.");
                System.out.print("Wybierz wersję: 1:Łatwiejsza(1-10), 2:Trudniejsza(1-100). : ");
                int menu2 = sc.nextInt();
                int iloscBledow = 0;
                int liczba = 0;
                int wynik = 0;
                int liczbaZyc = 0;
                Random generator = new Random();
                switch(menu2){

                    case 1:
                        System.out.println("Będziemy wybierać liczby od 1 do 10, system wylosuje liczbę a " +
                                "Twoim zadaniem będzie wybrać czy następna liczba będzie większa\n" +
                                "czy mniejsza, za poprawny wybór otrzymasz + 10pkt, jeżeli odpowiesz" +
                                " 3 razy źle - przegrywasz. Powodzenia! :)");
                                iloscBledow = 3;

                                while(iloscBledow>liczbaZyc){
                                    int liczbaR = generator.nextInt(10);
                                    liczbaR++;
                                    for(int i = 0;i<50;i++){
                                        System.out.println();
                                    }
                                    System.out.print("Szanse: ");
                                    for(int i = 0;i<iloscBledow;i++){
                                        System.out.print("X ");
                                    }
                                    System.out.println();
                                    System.out.print("Liczba: ");
                                    System.out.print(liczbaR);
                                    System.out.print(". Następna liczba będzie: 1.Mniejsza, 2.Większa. : ");
                                    int ltmp = sc.nextInt();
                                    if(ltmp == 1){

                                    } else if(ltmp == 2){

                                    } else {
                                        System.out.println("ZŁY Wybór!!!");
                                        break;
                                    }


                                }

                        break;

                    case 2:
                        System.out.println("Będziemy wybierać liczby od 1 do 100, system wylosuje liczbę a " +
                                "Twoim zadaniem będzie wybrać czy następna liczba będzie większa\n" +
                                "czy mniejsza, za poprawny wybór otrzymasz + 10pkt, jeżeli odpowiesz" +
                                " 3 razy źle - przegrywasz. Powodzenia! :)"); //jeśli zbyt trudno zmienić na 5
                                iloscBledow = 3;                          // << --

                        break;
                }

                break;

            case 2:
                for(int i = 0; i<100;i++){
                    System.out.println();
                }
                System.out.println("2.Karty.");

                break;

            case 3:
                System.exit(99);
        }

    }
}
