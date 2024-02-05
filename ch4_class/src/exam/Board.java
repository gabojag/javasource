package exam;

import java.time.LocalDateTime;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int number;
  private String title;
  private String story;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  // default
  public Board() {}

  // 4 개만

  public Board(int number, String title, String story, String writer) {
    this.number = number;
    this.title = title;
    this.story = story;
    this.writer = writer;
  }
}
