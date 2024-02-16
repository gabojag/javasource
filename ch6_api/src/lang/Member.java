package lang;

import java.util.Objects;

public class Member {

  private String id;
  private String name;

  public Member(String id) {
    this.id = id;
  }

  // 값 비교로 equals 재정의
  // @Override
  // public boolean equals(Object obj) {
  //   if (obj instanceof Member) {
  //     Member v = (Member) obj;
  //     if (this.id.equals(v.id)) {
  //       return true;
  //     }
  //   }
  //   return false;
  // }

  @Override
  public String toString() {
    return "Member [id=" + id + ", name=" + name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;

      return name.equals(member.name) && id.equals(member.id);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}
