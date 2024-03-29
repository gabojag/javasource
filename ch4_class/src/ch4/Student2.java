package ch4;

public class Student2 {

  // 멤버변수(= 인스턴스변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215-201123), 핸드폰(010-1234-1234),
  private String id; //학번 저장
  private String name;
  private String addr;
  private String hp;

  // 멤버메소드(= 인스턴스메소드)
  // 속성을 변경시킬 수 있도록 메소드 작성
  // 메소드 작성 규칙
  // 순서 : 타입 매소드명(){}
  // return type : 정수형,실수형,불린형,문자형,String,배열,void
  void changeAddr(String addr) {
    // 멤버변수 addr 의 값을 변경
    this.addr = addr;
    // 리턴 값은 없음 => void 사용
  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자(constructor) -
  // 클래스를 객체로 생성할 때 필수로 필요
  Student2() {}

  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int i) {
    this.hp = i;
  }
}
