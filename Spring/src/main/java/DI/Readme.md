Goal
- 생성자 주입에 왜 "Static"  이 붙지 않는 걸까?
- final, Static final, Static 만을 선언하는 이유에 대해서 알아보자.
- Autowired 의 문제점과 생성자 방식으로 객체 주입을 할 수 있다.


1. 생성자 주입에 왜 "Static" 이 붙지 않는 걸까?

- final : 한 번 할당될 수 있다. (선언 시, 생성자로 초기화 시) : 값 자체가 동일하지 않다.
- Static final : 인스턴스가 생성될 때, 같은 값을 공유하며, 재 할당되지 않기를 원한다. (값의 limit, 고유한 값)











https://djkeh.github.io/articles/Why-should-final-member-variables-be-conventionally-static-in-Java-kor/