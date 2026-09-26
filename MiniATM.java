import java.util.Scanner;

public class MiniATM {

    static int balance = 5000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ATM Menu: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Current Balance: ₹" + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ₹");
                int deposit = sc.nextInt();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Amount deposited successfully!");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid amount.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ₹");
                int withdraw = sc.nextInt();

                if (withdraw <= 0) {
                    System.out.println("Invalid amount.");
                } else if (withdraw > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= withdraw;
                    System.out.println("Please collect your cash.");
                    System.out.println("Updated Balance: ₹" + balance);
                }
                break;

            case 4:
                System.out.println("Thank you for using Mini ATM!");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
