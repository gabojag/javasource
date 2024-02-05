package array;

import java.util.Scanner;

public class ArrayEx17 {

  public static void main(String[] args) {
    String[][] words = {
      { "chair", "의자" },
      { "computer", "컴퓨터" },
      { "integer", "정수" },
    };
    Scanner sc = new Scanner(System.in);
    //  문자열 비교 == (x) equals() ==> "name".equals("nam")

    for (int i = 0; i < words.length; i++) {
      System.out.printf("Q%d) %s 의 뜻은?\n", (i + 1), words[i][0]);
    }
  }
}
