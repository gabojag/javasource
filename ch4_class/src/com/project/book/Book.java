package com.project.book;

//import 구문 => 다른 패키지에 있는 클래스 사용 시
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
// import java.util.Date;
// import java.util.Scanner;
import java.util*;

//클래스 선언
public class Book {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
    System.out.println(sdf.format(date));

    LocalDateTime deteTime = LocalDateTime.now();
    System.out.println(deteTime);


    Scanner sc = new Scanner(System.in);
  }
}
