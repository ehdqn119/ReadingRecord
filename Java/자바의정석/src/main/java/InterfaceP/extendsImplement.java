package InterfaceP;

public class extendsImplement {
    public static void main(String[] args) {
        People people = new People();
        people.left();
        people.right();
        if(people instanceof moveable) {
            System.out.println("movealbe 을 구현");
        }
        if(people instanceof right) {
            System.out.println("right 로 형변환 역시 가능");
        }
        if(people instanceof left) {
            System.out.println("left로 형변환 역시 가능");
        }
    }
}
class People implements moveable {
    @Override
    public void left() {
    }
    @Override
    public void right() {
    }
}
interface moveable extends  left,right { };
interface left { public void left();};
interface right { public void right();};