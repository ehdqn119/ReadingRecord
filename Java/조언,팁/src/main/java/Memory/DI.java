package Memory;

public class DI {
    public static final Service service;
    public DI(Service service2) {
        service = service2;
    }

    public static void main(String[] args) {
        DI di = new DI(new Service());

    }
}

class Service {
    public void servicePrint() {
        System.out.println("Service!!");
    }
}
