import java.util.Scanner;

class ATM {
  float Balance;
  int PIN = 9821;

  public void checkpin() {
    System.out.println("Enter Your Pin : ");
    Scanner sc = new Scanner(System.in);
    int attempts = 0;

    while (attempts < 3) {
      System.out.println("Enter Your Pin : ");
      int enteredpin = sc.nextInt();

      if (enteredpin == PIN) {
        menu();
        return;
      } else {
        attempts++;
        System.out.println("Invalid PIN! Attempts left: " + (3 - attempts));
      }
    }

    System.out.println("Your account is blocked for 24 hours. Please contact your bank.");

    // int enteredpin = sc.nextInt();
    // if (enteredpin == PIN) {
    // menu();
    // } else {
    // System.out.println("Enter invalid Pin try Aain");

    // }

  }

  public void menu() {
    System.out.println("Enter Your Choice: ");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if (opt == 1) {
      checkBalance();
    } else if (opt == 2) {
      withdrawMoney();
    } else if (opt == 3) {
      depositMoney();
    } else if (opt == 4) {
      return;
    } else {
      System.out.println("Enter a valid choice");
    }
  }

  public void checkBalance() {
    System.out.println("Balance: " + Balance);
    menu();
  }

  public void withdrawMoney() {
    System.out.println("Enter Amount to withdraw");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if (amount > Balance) {
      System.out.println("Insufficient Balance");
    } else {
      Balance = Balance - amount;
      System.out.println("Money withdrawn Successful");
    }
    menu();
  }

  public void depositMoney() {
    System.out.println("Enter amount to deposit ");
    Scanner sc = new Scanner(System.in);
    float deposit = sc.nextFloat();
    System.out.println("Deposit Amount is :" + deposit);
    Balance = Balance + deposit;
    menu();
  }
}

public class Day_9_Opps_Atm_machine {
  public static void main(String[] args) {
    ATM atm = new ATM();
    atm.checkpin();
  }
}
