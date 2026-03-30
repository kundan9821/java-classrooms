class emplaoy {
  void sallery() {
    System.out.println("Sally is 70 K  ");
  }
}

class hr extends emplaoy {
  void bonous() {
    System.out.println("bonous is 20 K");
  }
}

public class Day_11_2_Inherentace {
  public static void main(String[] args) {
    System.out.println();
    hr say = new hr();
    say.sallery();
    say.bonous();
  }
}
