package interfacetest;

public interface RemoteControl {
  int Max_VOLUME = 10;
  int MIN_VOLUME = 0;

  void turnOn();
  void turnOff();
  void setVolume(int volume);
}
