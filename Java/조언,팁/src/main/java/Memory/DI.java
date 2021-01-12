package Memory;

public class DI {
    static final Injection A = new Injection();
    private final Injection B;


    public DI(Injection b) {
        B = b;
    }
}

class Injection {

}
