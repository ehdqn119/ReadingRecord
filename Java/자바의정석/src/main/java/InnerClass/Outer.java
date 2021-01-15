package InnerClass;

public class Outer {
    // 인스턴스 클래스
    class Inner {
        int value = 1;
    }
    static class staticInner{
        static int value = 1;
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }

}
