package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    // 부모, 자식 인스턴스 생성 가능 함
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    GrandChild grandChild = new GrandChild(30);

    System.out.println("부모의 멤버 변수" + parent.getAge());
    System.out.println("부모가 물려준 멤버 변수 child" + child.getAge());
    System.out.println("부모가 물려준 멤버 변수 child2" + child2.getAge());
    System.out.println("child 멤버 메소드 ");
    child.play();
    System.out.println("parent 가 물려준 멤버 변수" + grandChild.getAge());
    grandChild.play(); // Child 가 물려준 멤버 메소드

    // 오버라이딩 메소드
    parent.print(); // 나이는 15 입니다.
    child.print(); // 내 이름은 성춘향입니다.
    child2.print(); // 나이는 25 입니다
    grandChild.print(); // 내 이름은 성춘향 입니다.
  }
}
