package InterfaceP;

public class ReturnParameter {
    public static void main(String[] args) {
        InOut inOut =  new InOut();

        A a = new A() {
            @Override
            public void aPrint() {
                System.out.println("익명객체 구현");
            }
        };
        inOut.In(a);


        aSon ason = new aSon();
        inOut.In(ason);


    }
}
class InOut {
    public void In(A a) {
        a.aPrint();
    }
    public B Out(B b) {
        return b;
    }
}

class aSon implements A {
    @Override
    public void aPrint() {
        System.out.println("A interface Print!!!!!!");
    };
}
class bSon implements B{
    @Override
    public void bPrint() {
        System.out.println("B interface Print");
    }
}
interface A {
    public void aPrint();
}
interface  B {
    public void bPrint();
}
