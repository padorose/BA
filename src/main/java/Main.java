import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many users you want to add?");
        int numberOfNewAccounts = scanner.nextInt();
        Account tableOfNewAccounts[] = new Account[numberOfNewAccounts];
        for (int i = 0; i < tableOfNewAccounts.length; i++) {
            tableOfNewAccounts[i] = new Account();
            tableOfNewAccounts[i].openAccount();
            tableOfNewAccounts[i].showAccount();
        }
        int imputNumber;
        do {
            System.out.println("\n ***Banking Aplication*** \n");
            System.out.println(" 1. Display all account details \n 2. Search by Account number \n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Choose number.");
            imputNumber = scanner.nextInt();
            switch (imputNumber) {
                case 1:
                    System.out.println("Enter Account Number: ");
                    int accountToSearch = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < tableOfNewAccounts.length; i++) {
                        found = tableOfNewAccounts[i].searchAccount(accountToSearch);
                        tableOfNewAccounts[i].showAccount();

                        if (found) {
                            break;
                        }
                    }
                    case5:
                    break;
            }


        }
        while (imputNumber != 5);
    }
}
