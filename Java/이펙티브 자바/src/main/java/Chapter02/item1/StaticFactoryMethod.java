package Chapter02.item1;
// 가독성이 좋다.
// 생성하는 객체의 이름을 한눈에 알아볼 수 있다.
class Character {
    int intelligence, strength, hitPoint, magicPoint;

    public Character(int intelligence, int strength, int hitPoint, int magicPoint) {
        this.intelligence = intelligence;
        this.strength = strength;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
    }
    public static Character newWarrior() {
        return new Character(20,50,10,20);
    }
    public static Character newMage() {
        return new Character(15, 5, 10, 15);    // 마법사는 지능과 MP가 높다
    }
}

public class StaticFactoryMethod {
    public static void main(String[] args) {
        Character warrior = Character.newWarrior();
        Character mage = Character.newMage();
    }
}

// immutable



// 하위 자료형 리턴 가능
class OrderUtil {
    public static Discount createDiscountItem(String discountCode) throws Exception {
        if(!isValidCode(discountCode)) {
            throw new Exception("잘못된 할인 코드");
        }
        // 쿠폰 코드인가? 포인트 코드인가?
        if(isUsableCoupon(discountCode)) {
            return new Coupon(1000);
        } else if(isUsablePoint(discountCode)) {
            return new Point(500);
        }
        throw new Exception("이미 사용한 코드");
    }

    private static boolean isUsablePoint(String discountCode) {
        return true;
    }

    private static boolean isUsableCoupon(String discountCode) {
        return true;
    }
    private static boolean isValidCode(String discountCode) {
        return true;
    }

    public static void main(String[] args) throws Exception {
        OrderUtil.createDiscountItem("5554433");
    }
}
class Coupon extends Discount{
    private int value;
    public Coupon(int value) {
        this.value = value;
    }
}
class Point extends  Discount {
    private int value;
    public Point(int value) {
        this.value = value;
    }
}
class Discount{ }


class a extends mother {
}

class b extends  mother{
}
class mother {
    public mother returnmother(String z) throws  Exception {
        if(z == "") { return new a(); };
        if(z != "1") { return new b(); };
        throw new Exception("오류");
    };
    public mother() {
    };


    public static void main(String[] args) throws Exception{
        mother moa = new mother();
        moa.returnmother("asd");
    }
}




