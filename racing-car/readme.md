🚀 3단계 - 자동차 경주
기능 요구사항
초간단 자동차 경주 게임을 구현한다.
'주어진 횟수' 동안 "n대의 자동차"는 '전진' 또는 '멈출' 수 있다.
"사용자"는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.

'전진'하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

주체
- 상태
- 메소드

경주게임
- 주어진횟수
- n대의 자동차

자동차들

자동차
- 현위치
- 전진 / 멈춤 (별개가 아닌 것으로 봐야함)
  - 조건1 0 ~ 9 사이
  - 조건2
  - 조건3
  - 다양한 조건이 추가될 가능성이 있음

현위치(원시값은 포장하자)
- 상태(양수)
- 메소드




실행 결과
위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
```java
자동차 대수는 몇 대 인가요?
3
시도할 회수는 몇 회 인가요?
5

실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----
```

힌트
값을 입력 받는 API는 Scanner를 이용한다.
Scanner scanner = new Scanner(System.in);
String value = scanner.nextLine();
int number = scanner.nextInt();
랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용한다.
프로그래밍 요구사항
모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
자바 코드 컨벤션을 지키면서 프로그래밍한다.
이 과정의 Code Style은 intellij idea Code Style. Java을 따른다.
intellij idea Code Style. Java을 따르려면 code formatting 단축키(Windows : Ctrl + Alt + L. Mac : ⌥ (Option) + ⌘ (Command) + L.)를 사용한다.
else 예약어를 쓰지 않는다.
힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.