package Generic;

import java.util.List;

public class Student<T> {

    private T name;

    public void setName(T name) {
        this.name = name;
    };

    public T getName() {
        return name;
    }


    //Generic Method
    public <E> void setBooks(List<E> books) {
        for (E e : books ) {
            System.out.println(e);
        }
        System.out.println("해당 책의 사이즈는 : " + books.size());
    };

    //  제네릭 메소드 타입 구분
    // Iterable<E> -> extends Object 상속받음
    // Object 를 상속받는 일반 클래스
    // 객체생성시에 Object 올라가서 유추가능
    // E Type 은 어차피 Object 를 상속받음
    // Foreach 에서 해당 클래스 값만 넣어주면 알아서 찾음 //

    public static <E> E compa(E e) {
        System.out.println(e);
        return e;
    }

    // 그냥 List<E> 라는게 파라미터 타입이
    // 제네릭메소드 Generic Type 에서 내가 정의한 게 들어가네
    // E extends Object Generic Type 이랑
    // 파라미터 타입이랑 파라미터 타입은 제네릭 타입에 맞춰서 바뀌네
    // 제네릭 타입으로 오브젝트 파라미터를 컴파일러가 유추한다.
    // 제네릭 타입으로 선언한 부분이랑 오브젝트 파라미터랑 연관 있고
    // 제네릭 타입에 의존적인 게 파라미터 타입


    // 제네릭 타입이랑 메소드 파라미터 타입 구분하고
    // 제네릭 메소드 제네릭타입에 의존적인 메소드 파라미터
    //




}
