package interfacetest;

public class CalcEx {

  public static void main(String[] args) {
    // 참조 변수가 사용할 수 있는 범위가 제한
    CompleteCalc calc = new CompleteCalc();
    System.out.println("calc add " + calc.add(10, 2));
    System.out.println("calc add " + calc.divide(15, 5));
    System.out.println("calc add " + calc.substract(25, 10));
    System.out.println("calc add " + calc.times(3, 5));
    calc.showInfo();

    Calculator calc2 = new CompleteCalc();
    System.out.println("calc add " + calc2.add(10, 2));
    System.out.println("calc add " + calc2.divide(15, 5));
    System.out.println("calc add " + calc2.substract(25, 10));
    System.out.println("calc add " + calc2.times(3, 5));
    // calc2.showInfo();

    Calc calc3 = new CompleteCalc();
    System.out.println("calc add " + calc3.add(10, 2));
    System.out.println("calc add " + calc3.divide(15, 5));
    System.out.println("calc add " + calc3.substract(25, 10));
    System.out.println("calc add " + calc3.times(3, 5));
    // calc3.showInfo
  }
}
