/*
package Reflection;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

public class Core {

    private User user;

    public Core(User user) {
        this.user = user;
    }
    public static void main(String[] args) {

        User user = new User();
        Core core = new Core(user);
        Field[] fields = FieldUtils.getAllFields(user.getClass());
        for (Field field :fields) {
            System.out.println(field);
            boolean annotationPresent = field.isAnnotationPresent(NotNull.class);
            System.out.println(annotationPresent);

        }



    }


    // 유틸 사용하지 않고, 직접 작성한 것
    // https://www.baeldung.com/java-reflection-class-fields
    */
/*List<Field> getAllFields(Class clazz) {
        if (clazz == null) {
            return Collections.emptyList();
        }

        List<Field> result = new ArrayList<>(getAllFields(clazz.getSuperclass()));
        List<Field> filteredFields = Arrays.stream(clazz.getDeclaredFields())
                .filter(f -> Modifier.isPublic(f.getModifiers()) || Modifier.isProtected(f.getModifiers()))
                .collect(Collectors.toList());
        result.addAll(filteredFields);
        return result;
    }*//*

}
*/
