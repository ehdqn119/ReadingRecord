package DI;

class Core<T> {

    private T name;
    private T puzzle;

    private T setName(T name) {
        this.name = name;
        return name;
    }

    private T setPuzzle(T puzzle) {
        this.puzzle = puzzle;
        return puzzle;
    }

    public static void main(String[] args) {
        Core core = new Core<String>();
        core.setName("이상민");
        core.setPuzzle("이상협");
    }
}


public class A { private String name;

    public static void main(String[] args) {
        Core core = new Core();
    }
};