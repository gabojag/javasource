package lang;

import static java.lang.Math.*; // 사용 하면  Math. 적을 필요 없이 사용 가능

// Math : 구성 요소가 모두 static 상태

public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    // Math.random() : 0 ~ 1 미만의 임의의 숫자
    System.out.println(random());

    // round() : 반올림
    double val = 90.7552;
    System.out.println("round()" + round(val));
  }
}
