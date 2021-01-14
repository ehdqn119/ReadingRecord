정적 팩토리 메소드의 3가지 장점


1. 가독성이 뛰어나다.
- Character character = Character.Warrior();
- Character character = Character.Mage();

위와 같이 객체를 생성할 떄, 가독성이 뛰어나다. (메이지와 전사를 만들것을 명시해 줄 수 있다.)

2. 불변 객체 캐싱 리턴 가능



3. 하위 자료형을 리턴할 수 있다.

- 상위 자료형을 리턴 시키는 구문에, 하위 자료형을 리턴시킬 수 있다. (상속을 이용)