package poly;

public class Buyer {

  int money = 1000; //소유금액
  int bonusPoint = 0;

  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건 구매 불가");
      return;
    }
    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println(p + " 제품을 구매하셨습니다.");
  }
}
