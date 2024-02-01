package operator;

public class compareEx2 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true or false 로 나옴
    //  문자 vs 문자열
    // '' vs ""
    //  'A' "A"

    String srt1 = "홍길동";
    String srt2 = "홍길동";
    String srt3 = new String("홍길동");
    System.out.println(srt1 == srt2); //true
    System.out.println(srt1 == srt3); //false
    // 문자열 비교는 equals() 사용
    System.out.println(srt1.equals(srt3)); //true
  }
}
