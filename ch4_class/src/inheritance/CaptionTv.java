package inheritance;

public class CaptionTv extends Tv {

  //CaptionTv(){super();} 안 만들어도 자동으로 만들어져 있음

  boolean caption;

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  void displayCaption(String text) {
    // if(caption!=true) == if(!caption)

    // if(caption == true)
    if (caption) {
      System.out.println(text);
    }
  }
}
