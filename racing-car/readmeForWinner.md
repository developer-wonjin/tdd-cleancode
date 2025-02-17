<div class="max-width-md mx-auto pt-10 px-5">


# 🚀 4단계 - 자동차 경주(우승자)

<div class="mt-5">


<div>


<div class="tui-editor-contents">


## 기능 요구사항
자동차
- 이름 (5자이내)
입력
- 자동차 이름 쉼표로 구분
출력
- 자동차 이름함꼐 출력
- 출력을 모두 마치면 누가 우승했는지 알려준다. (우승자는 한 명이상)


*   각 자동차에 이름을 부여할 수 있다. **자동차 이름은 5자를 초과**할 수 없다.
*   전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
*   자동차 이름은 쉼표(,)를 기준으로 구분한다.
*   **자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.**

#### 실행 결과

*   위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.

```java
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.

```

* * *

#### 힌트

*   규칙 1: 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.
  *   indent가 2이상인 메소드의 경우 메소드를 분리하면 indent를 줄일 수 있다.
  *   else를 사용하지 않아 indent를 줄일 수 있다.
*   자동차 이름을 쉼표(,)를 기준으로 분리하려면 String 클래스의 split(",") 메소드를 활용한다.

```java
String[] names = inputName.split(",");

```

*   사용자가 입력한 이름의 숫자 만큼 자동차 대수를 생성한다.
*   자동차는 자동차 이름과 위치 정보를 가지는 Car 객체를 추가해 구현한다.

* * *

## 프로그래밍 요구사항

*   **indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.**
  *   예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  *   힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
*   **함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.**
  *   함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
*   모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
  *   핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  *   UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
*   자바 코드 컨벤션을 지키면서 프로그래밍한다.
  *   참고문서: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html) 또는 [https://myeonguni.tistory.com/1596](https://myeonguni.tistory.com/1596)
*   else 예약어를 쓰지 않는다.
  *   힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  *   else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

* * *

## 기능 목록 및 commit 로그 요구사항

*   기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
*   git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

</div>

</div>

</div>

</div>