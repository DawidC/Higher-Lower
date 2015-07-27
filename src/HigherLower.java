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
                int licznik = 0;
                Random generator = new Random();
                int liczbaR = 0;
                int flaga = 0;
                switch(menu2){

                    case 1:
                        System.out.println("Będziemy wybierać liczby od 1 do 10, system wylosuje liczbę a " +
                                "Twoim zadaniem będzie wybrać czy następna liczba będzie większa\n" +
                                "czy mniejsza, za poprawny wybór otrzymasz + 10pkt, jeżeli odpowiesz" +
                                " 3 razy źle - przegrywasz. Powodzenia! :)");
                                iloscBledow = 3;

                                while(iloscBledow>liczbaZyc){
                                    if(licznik == 0){
                                        liczbaR = generator.nextInt(10);
                                        liczbaR++;
                                        licznik++;
                                    }
                                    for(int i = 0;i<50;i++){
                                        System.out.println();
                                    }
                                    if(flaga==2){
                                        iloscBledow--;
                                    }
                                    System.out.println("Wynik: " + wynik);
                                    System.out.print("Szanse: ");
                                    for(int i = 0;i<iloscBledow;i++){
                                        System.out.print("X ");
                                    }

                                    System.out.println();
                                    if(flaga == 1){
                                        System.out.print("Dobrze! ");
                                    } else if(flaga == 2){
                                        System.out.print("Źle! ");
                                    }
                                    System.out.print("Liczba: ");
                                    System.out.print(liczbaR);
                                    if(iloscBledow==0){
                                        System.out.println(" Przegrałeś!");
                                        System.out.println("Twój wynik końcowy to " + wynik + " pkt.");
                                        System.exit(69);
                                    }
                                    System.out.print(". Następna liczba będzie: 1.Mniejsza, 2.Większa. : ");
                                    int ltmp = sc.nextInt();
                                    if(ltmp == 1){
                                        int liczbaTmp = liczbaR;
                                        liczbaR = generator.nextInt(10);
                                        liczbaR++;
                                        if(liczbaTmp==liczbaR){
                                            liczbaR = generator.nextInt(10);
                                            liczbaR++;
                                        }
                                        if(liczbaTmp > liczbaR){
                                            flaga = 1;
                                            wynik = wynik + 10;
                                        } else {
                                            flaga = 2;
                                        }
                                    } else if(ltmp == 2){
                                        int liczbaTmp = liczbaR;
                                        liczbaR = generator.nextInt(10);
                                        liczbaR++;
                                        if(liczbaTmp==liczbaR){
                                            liczbaR = generator.nextInt(10);
                                            liczbaR++;
                                        }
                                        if(liczbaTmp < liczbaR){
                                            flaga = 1;
                                            wynik = wynik + 10;
                                        } else {
                                            flaga = 2;
                                        }
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

                        while(iloscBledow>liczbaZyc){
                            if(licznik == 0){
                                liczbaR = generator.nextInt(100);
                                liczbaR++;
                                licznik++;
                            }
                            for(int i = 0;i<50;i++){
                                System.out.println();
                            }
                            if(flaga==2){
                                iloscBledow--;
                            }
                            System.out.println("Wynik: " + wynik);
                            System.out.print("Szanse: ");
                            for(int i = 0;i<iloscBledow;i++){
                                System.out.print("X ");
                            }

                            System.out.println();
                            if(flaga == 1){
                                System.out.print("Dobrze! ");
                            } else if(flaga == 2){
                                System.out.print("Źle! ");
                            }
                            System.out.print("Liczba: ");
                            System.out.print(liczbaR);
                            if(iloscBledow==0){
                                System.out.println(" Przegrałeś!");
                                System.out.println("Twój wynik końcowy to " + wynik + " pkt.");
                                System.exit(79);
                            }
                            System.out.print(". Następna liczba będzie: 1.Mniejsza, 2.Większa. : ");
                            int ltmp = sc.nextInt();
                            if(ltmp == 1){
                                int liczbaTmp = liczbaR;
                                liczbaR = generator.nextInt(100);
                                liczbaR++;
                                if(liczbaTmp==liczbaR){
                                    liczbaR = generator.nextInt(100);
                                    liczbaR++;
                                }
                                if(liczbaTmp > liczbaR){
                                    flaga = 1;
                                    wynik = wynik + 10;
                                } else {
                                    flaga = 2;
                                }
                            } else if(ltmp == 2){
                                int liczbaTmp = liczbaR;
                                liczbaR = generator.nextInt(100);
                                liczbaR++;
                                if(liczbaTmp==liczbaR){
                                    liczbaR = generator.nextInt(100);
                                    liczbaR++;
                                }
                                if(liczbaTmp < liczbaR){
                                    flaga = 1;
                                    wynik = wynik + 10;
                                } else {
                                    flaga = 2;
                                }
                            } else {
                                System.out.println("ZŁY Wybór!!!");
                                break;
                            }
                        }
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
