package lang;

public class Person {

  String id;
  String name;

  public Person(String id, String name) {
    this.id = id;
    this.name = name;
  }

  // id와 name 값이 같으면 true
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person v = (Person) obj;
      if (this.id.equals(v.id) && this.name.equals(v.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + "]";
  }
}
