package InterfaceP;

public class ExtendsChaining {
    public static void main(String[] args) {
        C c = new C();
        c.InB(new D());

        CA ca = new CA();
        CD cd = new CD();
        ca.printCA(cd);
    }
}

class C {
    public void InB(D d) {
        d.dPrint();
    }
}

class D {
    public void dPrint() {
        System.out.println("print d!!");
    }
}

class CA {
    public void printCA(CDI cdi ) {
        cdi.printCD();
    }
}

class CD implements CDI {
    @Override
    public void printCD() {
        System.out.println("Print CD!!");
    };
}

interface CDI {
    public void printCD();
}
