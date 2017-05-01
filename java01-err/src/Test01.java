/* 자바 프로그래밍 -소개
*/
class Test01 {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}


/*
자바 소프트웨어 종류
1)jre (java runtime environment)
-자바 바이트코드를 실행할때 필요한 프로그램들이 들어 있다.
-자바 프로그램을 실행하는 일반 사용자를 위한 소프트웨어이다.
- 핵심 구성 요소
-java vitual machine(jvm):bytecode 실행 프로그램
-자바 프로그램을 실행하는 필요한 기본 자바 라이브러리
2) jdk (java development kit)
-자바 프로그램을 만드는 개발자가 사용하는 소프트웨어 이다
-자바 프로그램을 개발하는데 필요한 프로그램들이 들어 있다.
-핵심 구성 요소
=> jre 포함. (왜? 만든 프로그램을 테스트 해야 하니까.)
=>자바 컴파일러, 프로파일러, 무선 생성기 등 개발 도구를 포함.

3) Sever-JRE
-서버 운영자가 서버에 설치하는 소프트웨어
-기존 jre에서 데스크톱 애플리케이션 관련 기능을 제외 시키고,
  대신 서버 애플리케이션 관리에 필요한 모니터링 기능을 추가함
-일반인들이 사용하는 소프트웨어는 아니다.

자바 컴파일러와 jvm
1) 자바 컴파일러
-자바 소스 코드를 JVM이 이해할 수 있는 bytecode로 변환시키는 프로그램이다.
-source Code? 변환하기 전의 원본 코드
-target code? 특정 기계에서 실행할 수 있도록 변환한 코드
- 컴파일(compile)? 소스 코드를 타겟 코드로 변환시키는 작업을 말한다.

2)자바 가상기계(JVM)
-자바 컴파일러가 변환한 bytecode(= p-code)를 실행시키는 프로그램이다.
-bytecode를 읽어서 OS의 코드를 호출하는 일을 한다.

bytecode와 native Code
1)bytecode
-특정 프로그램(예: JVM, PPT, Excel, Flash player, MP3 player 등)이 이해하는 코드.
-가상 기계를 위한 코드
-그 특정 프로그램이 없이는 실행할 수 없다.
-native 코드를 실행하는 것에 비해 실행 속도가 느리다.
-OS에 독립적이다. 즉 어떤 OS이던지 VM이 설치되어 있다면 실행 가능

2)native code
-특정 OS의 기능을 바로 호출하는 코드이다.
-기계어 코드라 부른다.
-OS에 의해 바로 실행할 수 있다.
-OS에 종속적이다. 특정 os에서만 실행할 수 있음
  다른 OS에서 실행하려면 코드의 일부를 다시 짜고 컴파일 해야한다.
*/
