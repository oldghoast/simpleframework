package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorController {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ReflectTarget reflectTarget = new ReflectTarget();

        Class aClass = Class.forName("demo.reflect.ReflectTarget");
        Constructor declaredConstructor = aClass.getDeclaredConstructor(int.class);
        //暴力访问
        declaredConstructor.setAccessible(true);
        ReflectTarget newInstance = (ReflectTarget) declaredConstructor.newInstance(1);
    }
}
