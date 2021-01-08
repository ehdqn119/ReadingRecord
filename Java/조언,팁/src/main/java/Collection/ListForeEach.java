package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class forEach {
    // forEach 문에서 index 를 활용하는 잘못된 형태
    public <T> List<T> returnArrayList(List<T> list) {
        for(int i=0; i<=list.size(); i++) {
            T t = list.get(i);
        };
        return list;
    }

    //
}

class Loop {

    public static Loop Normal() {
        return new Loop();
    }

    public  static Loop Hard() {
        return new Loop();
    }

    public <T> List<T> lamdaforEach(List<T> list) {
        list.forEach(System.out::println);
        return list;
    };
    public <T> List<T> overForEach(List<T> list) {
        list.forEach(s -> System.out.println(s));
        return list;
    };
    public <T> List<T> normalFor(List<T> list) {
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    };

    public <T> List<T> utilArrayList(List<T> list) {
        return new ArrayList<T>();
    }
    
    // 수정할것
    public <T> void ArraysinArrayList(List<T> list) {
        //
    };

}




public class ListForeEach {
    public static void main(String[] args) {

        Loop Normal = Loop.Normal();
        Loop Hard = Loop.Hard();

        List<String> test = Arrays.asList("이상민","이상협");
        Normal.lamdaforEach(test);
        Normal.normalFor(test);
        Normal.overForEach(test);

    }
}
