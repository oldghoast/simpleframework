package demo.annotation;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Slf4j
public class AnnotationParser {
    //解析类的注解
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class aClass = Class.forName("demo.annotation.SpringCourse");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            log.debug(courseInfoAnnotation.courseName());
            log.debug(courseInfoAnnotation.courseTag());
            log.debug(courseInfoAnnotation.courseProfile());
            log.debug(String.valueOf(courseInfoAnnotation.courseIndex()));
        }
    }

    //解析成员变量上的标签
    public static void parseFieldAnnotation() throws ClassNotFoundException {
        Class aClass = Class.forName("demo.annotation.SpringCourse");
        Field[] declaredField = aClass.getDeclaredFields();
        for (Field field : declaredField) {
            boolean hasAnnotation = field.isAnnotationPresent(PersonInfoAnnotation.class);
            if (hasAnnotation) {
                PersonInfoAnnotation personInfoAnnotation = field.getAnnotation(PersonInfoAnnotation.class);
                log.debug(personInfoAnnotation.name());
                log.debug(String.valueOf(personInfoAnnotation.age()));
                log.debug(personInfoAnnotation.gender());
                for (String s : personInfoAnnotation.language()) {
                    log.debug("课程：" + s);
                }
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
        parseFieldAnnotation();
    }
}
