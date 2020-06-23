import java.util.Scanner;

public class Main {

    //Avem 3 tipuri de abonamente: standard, business si premium
    //Sa se introduca de la tastatura optiunea de abonament aleasa
    //In functie de optiunea aleasa sa se afiseze un mesaj cu abomanentul ales si pretul abonamentului


    public static void main(String[] args) {

        /* Inventar:
           - 1 clasa abstracta Abonament
           - 1 clasa abonament Standard
           - 1 clasa abonament Business
           - 1 clasa abonament Premium
           - 1 clasa fabrica de abonamente

           Plan: vom aplica design pattern-ul Factory Method
         */

        System.out.println("Meniu optiuni abonamente Netflix");
        System.out.println("1 - Abonament Standard");
        System.out.println("2 - Abonament Business");
        System.out.println("3 - Abonament Premium");
        System.out.println("Va rog sa introduceti o optiune: ");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        SubscriptionFactory subscriptionFactory = new SubscriptionFactory();
        if (optiune == 1) {
            Standard subscriptionStandard = (Standard) subscriptionFactory.getSubscription("Standard");
            System.out.println("Ati ales un abonament de tip Standard si va costa " + subscriptionStandard.getPrice());
        } else if (optiune == 2) {
            Business subscriptionBusiness = (Business) subscriptionFactory.getSubscription("Business");
            System.out.println("Ati ales un abonament de tip business si va costa " + subscriptionBusiness.getPrice());
        } else if (optiune == 3) {
            Premium subscriptionPremium = (Premium) subscriptionFactory.getSubscription("Premium");
            System.out.println("Ati ales un abonament de tip Premium si va costa: " + subscriptionPremium.getPrice());
        } else {
            System.out.println("Optiunea aleasa de dumneavoastra nu exista");
        }
    }
}
