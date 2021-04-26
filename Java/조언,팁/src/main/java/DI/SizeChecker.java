package DI;

public class SizeChecker {


    private Display isRetina(String name) {
        if("apple".equals(name.toLowerCase())) {
            return new Retina();
        }
        else {
            return new NormalDevice();
        }
    }

    public static void main(String[] args) {
        SizeChecker test = new SizeChecker();
        Display tt = test.isRetina("APPLE");
        System.out.println(tt.getClass());
    }
}

