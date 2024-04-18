package ie.atu.interface1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n\nHello and welcome to GitPub!\n\nPlease enter 1 if you're a Customer or 2 if you're a Publican: ");
        int choice = scanner.nextInt();
        while(true){
            switch (choice) {
                case 1:
                    System.out.println("\nPlease select what area you would like to visit\n");
                    System.out.println("1. Eyre Square\t 2. Shop Street\t 3. The Latin Quarter\t 4. Other\nArea: ");
                    int area = scanner.nextInt();
                    switch (area) {
                        case 1:
                            System.out.println("\nEyre Square's Pubs\n");
                            //calls for pubSelect then populates the page with the pubs, the user then enters what pub they'd like
                            pubOverview.displayPubsEyreSq();
                            //then the pub prices for drinks is shown along with a review.

                            break;
                        case 2:
                            System.out.println("\nShop Street's Pubs\n");
                            pubOverview.displayPubsShopSt();

                            break;

                        case 3:
                            System.out.println("\nLatin Quarter's Pub's");
                            pubOverview.displayPubsLatinQ();
                            break;

                        case 4:
                            System.out.println("\nOther\n");
                            break;
                    }
                    break;
                case 2://Prompts the user for a username and password, then asked to select what command they want to complete.
                    Admin.authenticate();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        }
    }
}