package DI;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanContainer {

    private Map<Class<?>, Object> beanMap = new HashMap<>();

    public BeanContainer() throws ClassNotFoundException {
        createBean();
        Class<?> targetClazz = Class.forName("DI.TargetBean");
        Object test = getBean(targetClazz);
        System.out.println(test);
    }


    public <T> T getBean(Class<?> clazz) {
        return (T) this.beanMap.get(clazz);
    }

    public void createBean() {
        try {

            Object o = new Object();
            // 이름 불러오기
            Class<?> targetClazz = Class.forName("DI.TargetBean");
            System.out.println(targetClazz);
            Class<?> beanClazz = Class.forName("DI.MyBean");
            System.out.println(beanClazz);
            // 둘의 인스턴스 생성하기
            Object target = targetClazz.getConstructor().newInstance();
            Object bean = beanClazz.getConstructor().newInstance();

            // 타겟 인스턴스의 필드에 빈 주입 필드 삽입해줌
            injectBean(target, bean);
            //
            this.beanMap.put(targetClazz, target);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void injectBean(Object target, Object bean) {
        try {

            // 타겟 빈 필드 중 bean 필드를 찾아서 주입해줌 //
            Field myBean = target.getClass().getDeclaredField("myBean");
            // 애는 targetBean 안에 myBean 변수
            myBean.setAccessible(true);
            // 접근 허용
            myBean.set(target, bean);
            System.out.println("오브젝트는 " + target);
            System.out.println("삽입할 값은 " + bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        BeanContainer test = new BeanContainer();

    }
}