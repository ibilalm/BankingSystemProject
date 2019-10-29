import java.util.Scanner;
class bankingsystem {
    public static void main(String[] args) {

        double balance = 1000.0, Deposit, Withdraw, amount;
        int option;
        char repeat;
        String choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Welcome to CIS-2348 Banking System!");
            System.out.println();
            System.out.println("Please enter your option in number:");
            System.out.println("1. Display Balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            option = input.nextInt();
            choice = input.nextLine();

            //if (option > 3 || option < 1) {

            // repeat = choice.charAt(option);

            //  } else {
            //   repeat = choice.charAt(option);
            switch (option) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Withdraw");
                    amount = input.nextInt();
                    if (amount > balance) {
                        System.out.println("Please enter the amount less than " + balance);
                        amount=input.nextInt();
                        if(amount<balance){
                            balance -= amount;
                            System.out.println("You took out " + amount);
                            System.out.println("Your available balance is: " + balance);
                            System.out.println();
                        }else{
                            System.out.println("Your available balance is: " + balance);
                            System.out.println("Please try again");
                            System.out.println();
                            choice=input.nextLine();
                            break;
                        }
                        System.out.println();
                        choice=input.nextLine();
                        break;
                    } else {
                        balance -= amount;
                        System.out.println("You took out " + amount);
                        System.out.println("Your available balance is: " + balance);
                        System.out.println();
                        choice=input.nextLine();

                    }break;
                case 3:
                    System.out.println("Enter the amount you want to deposit");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("You deposited: " + amount);
                    System.out.println("Your current balance is: " + balance);
                    System.out.println();
                    choice=input.nextLine();
                    break;
            }
            System.out.println("Would you like to do something else?");
            System.out.println("Enter Y for yes or N for No");
            //option = input.nextInt();
            choice = input.nextLine();
            repeat = choice.charAt(0);
        }while ( repeat=='Y' || repeat=='y') ;
        System.out.println("Balance Summary:");
        System.out.println("Your remaining balance is: " + balance);
    }
}
