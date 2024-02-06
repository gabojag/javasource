package ch4;

// 시, 분, 초는 모두 0보다 크거나 같아야 한다
// 시의 범위는 0~23, 분,초의 범위는 0~59 이다.
public class Time {

  private int hour;
  private int minute;
  private float second;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}