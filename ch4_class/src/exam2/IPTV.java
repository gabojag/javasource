package exam2;

public class IPTV extends ColorTv {

  private String ip;

  public IPTV(int size, int color) {
    super(size, color);
    this.ip = ip;
  }

  @Override
  public void printProperty() {
    System.out.println(
      "나의 IPTV 는" + ip + "주소의 " + getSize() + "인치" + getColor() + "컬러"
    );
  }
}
