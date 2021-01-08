1. List 를 반복시킬 때, 무조건 ForEach 를 사용하자.









2. List 를 생성할 때, 메모리를 절약하고, 올바르게 사용하자.

- List<String> test = new ArrayList<>();

잘못된 생성방식이다. (Add 시에 10개의 Capacity 생성)

- List<String> test = Arrays.asList("민수","미선","석훈");

옳은 생성방식이다. (정해진 Capacity 메모리를 효율적으로 사용)







Reference

- https://siyoon210.tistory.com/99
- https://multifrontgarden.tistory.com/130
- https://alwayspr.tistory.com/28
- https://m.blog.naver.com/roropoly1/221140156345



