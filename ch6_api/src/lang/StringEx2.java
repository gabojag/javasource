package lang;

import java.util.Date;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    // return type => 변수 담기 or sout
    char ch = str1.charAt(0);
    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat() : 문자열 뒤에 연결
    String result = str1.concat("World");
    System.out.println("concat()" + result);

    // compareTo() : 0,-1,1 리턴
    // 문자열과 사전 순서로 비교
    // 같으면 0, 사전순으로 이전이면 음수, 이후면 양수
    // a 97, b 98 (97-98)
    System.out.println("compareTo() " + str1.compareTo(str3));
    System.out.println("compareTo() " + "aaa".compareTo("bbb"));
    System.out.println("compareTo() " + "bbb".compareTo("aaa"));
    System.out.println("compareTo() " + "bbb".compareTo("baa"));

    // contains() : 지정된 문자열이 포함되었는지 검사
    System.out.println("contains()" + str1.contains("e"));

    //endsWith() :
    System.out.println("endsWith()" + str3.endsWith("t"));
    System.out.println("endsWith()" + "Hello.txt".endsWith("txt"));

    // startsWith() : 지정된 문자열로 시작하는지 검사
    System.out.println("startsWith()" + str3.startsWith("H"));

    // equals() / equalsIgnoreCase() - 대소문자 구별하지 말고 비교
    // Hello == HELLO (문자 대소문자 구별 함)
    System.out.println("equalsIgnoreCase()" + str1.equalsIgnoreCase("HELLO"));
    System.out.println("equals()" + str1.equals("HELLO"));

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //             있으면 위치 인덱스, 없으면 -1
    System.out.println("indexOf()" + str1.indexOf("s"));
    System.out.println("indexOf()" + str1.indexOf('s'));
    System.out.println("indexOf()" + str1.indexOf('e'));
    // 2번을 시작위치로 지정
    System.out.println("indexOf()" + str1.indexOf('e', 2));

    //lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치 반환
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf()" + str4.lastIndexOf(".")); // 9
    System.out.println("indexOf()" + str4.indexOf(".")); // 4

    // length() : 문자열 길이 반환

    // replace() : 문자를 새로운 문자로 바꾼 문자열 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace()" + replaceStr);
    str2 = str2.replace('H', 'h');
    System.out.println(str2); // Hello //String 은 불변 원본은 안 바뀜 바꾸려면 다시 담아야함 //'' "" 둘다 가능
    str2 = str2.replace("ll", "LL");
    System.out.println(str2);
    str4 = "Hellollo";
    System.out.println("replace()" + str4.replace("ll", "LL")); // 하는일이 같음(전부다 바뀜)
    System.out.println("replaceAll()" + str4.replaceAll("ll", "LL")); // 하는일이 같음(전부다 바뀜)
    System.out.println("replaceFirst()" + str4.replaceFirst("ll", "LL")); // 앞에 있는 것만 바꿈

    // split() : 문자열 분리(기준에 따라)한 후 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string); //"H", "e", "l" , "l", "o" 문자를 따로 분리
    }

    str4 = "dog,cat,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string); // 기준을 맞춰주면 그 기준에 맞게 나눠서 찍어냄
    }
    // 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string);
    }

    // substring() : 시작위치부터 끝 위치에 포함된 문자열 추출
    //               끝 위치는 포함하지 않음
    System.out.println("substring()" + str1.substring(1));
    System.out.println("substring()" + str1.substring(1, 4));

    //toLowerCase() : 모든 문자를 소문자로 반환
    //toUpperCase() : 모든 문자를 대문자로 반환
    System.out.println("toLowerCase()" + str1.toLowerCase());
    System.out.println("toUpperCase()" + str1.toUpperCase());

    // toString() :
    System.out.println(str1);
    System.out.println(str1.toString());

    // 공백 하나는 문자 하나
    // trim() : 앞, 뒤 공백 제거
    // "Hello" == "Hello " equals() 사용 했을 때 다르다고 나옴
    str4 = "   Hello    World    ";
    System.out.println("trim() 전 " + str4);
    System.out.println("trim() 후 " + str4.trim());

    // valueOf() : 지정된 값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100");
    String num1 = String.valueOf(100); // int => String
    num1 = String.valueOf(1.3); // double => String
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000L);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date();
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + "";

    // String.valueOf(10) <=> Integer.perseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Double.parseDouble("10.3") or Double.valueOf("10.3")
    // "10.3f" => 10.3f

    double d1 = Double.parseDouble("10.3");
    float f1 = Float.parseFloat("10.3f");
    Long.parseLong("10L");
  }
}
