package InterfaceP;

public class ExtendsChaining {
    public static void main(String[] args) {
        //Q ,  W
        Q q = new Q();
        q.printQ(new W());

        Z z = new Z();
        z.printZ(new X());
    }
}

class Q {
    public void printQ(W w) {
        w.printW();
    }
}

class W {
    public void printW() {
        System.out.println("W!!");
    }
}

class Z {
    public void printZ(I i) {
        i.printX();
    }
}

class X implements I {
    @Override
    public void printX() {
        System.out.println("X!!");
    };
}

interface I {
    public void printX();
}

