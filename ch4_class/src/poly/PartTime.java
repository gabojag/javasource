package poly;

public class PartTime extends Employee {

  public PartTime(String name, String position) {
    super(name, position);
  }

  @Override
  public void work() {
    System.out.println(super.getName());
  }
}
