package ch4;

import java.util.Scanner;

public class StudentEx4 {

  private static final double total = 0;

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    //System.out.println(stuArr[0]); // null
    //System.out.println(stuArr[0].getId()); // NullPointerException

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3();
      //아이디,이름,국어,영어,수학점수 입력받아서 초기화
      System.out.println("Input Id : ");
      String id = sc.nextLine();
      System.out.println("Input Name : ");
      String name = sc.nextLine();
      System.out.println("Input Kor : ");
      int kor = Integer.parseInt(sc.nextLine());
      System.out.println("Input Eng : ");
      int eng = Integer.parseInt(sc.nextLine());
      System.out.println("Input Math : ");
      int math = Integer.parseInt(sc.nextLine());

      stuArr[i].setId(id);
      stuArr[i].setName(name);
      stuArr[i].setKor(kor);
      stuArr[i].setEng(eng);
      stuArr[i].setMath(math);
    }
    // 학생정보 확인
    System.out.println("=======================================");
    System.out.println("아이디 이름 국어 영어 수학 총점 평균");
    System.out.println("=======================================");
    for (Student3 student3 : stuArr) {
      //Studen3 studen3 = stuArr[i];
      //   System.out.println(student3); => toString()
      // 모든 학생들의 정보 접근
      System.out.printf(
        "%s %s %d %d %d %.2f\n",
        student3.getId(),
        student3.getName(),
        student3.getKor(),
        student3.getEng(),
        student3.getMath(),
        total,
        total / 3.0
      );
    }

    for (int i = 0; i < stuArr.length; i++) {
      int total = stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath();

      System.out.printf(
        "%s %s %d %d\n",
        stuArr[i].getId(),
        stuArr[i].getName(),
        stuArr[i].getKor(),
        stuArr[i].getEng(),
        stuArr[i].getMath(),
        total,
        total / 3.0
      );
    }
  }
}
