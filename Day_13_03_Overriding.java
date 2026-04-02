class Bank {
  public void rateofInterest() {
    System.out.println("generally rate of interest is 5 %");
  }
}

class SBI extends Bank {
  @Override
  public void rateofInterest() {
    System.out.println("sbi reate of interest is 8%");
  }
}

class PNB extends Bank {
  @Override
  public void rateofInterest() {
    System.out.println("pnb reate of interest is 6%");
  }
}

public class Day_13_03_Overriding {
  public static void main(String[] args) {
    Bank obj = new Bank();
    SBI obj1 = new SBI();
    PNB obj2 = new PNB();
    obj.rateofInterest();
    obj1.rateofInterest();
    obj2.rateofInterest();
  }
}
