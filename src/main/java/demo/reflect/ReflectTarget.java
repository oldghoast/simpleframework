package demo.reflect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReflectTarget {

    public ReflectTarget(){
        log.debug("public");
    }

    private ReflectTarget(int s){
        log.debug(s+"");
    }

    /**
     * 获取类对象的3种方法
     */
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class class1 = reflectTarget.getClass();
        log.debug(class1.getName());

        Class class2 = ReflectTarget.class;
        log.debug(class2.getName());

        Class class3 = Class.forName("demo.reflect.ReflectTarget");
        log.debug(class3.getName());
    }
}
