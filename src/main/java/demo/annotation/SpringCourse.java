package demo.annotation;

@CourseInfoAnnotation(courseName = "自研spring", courseTag = "spring", courseProfile = "简介")
public class SpringCourse {
    @PersonInfoAnnotation(name = "zz", language = {"java", "C++"})
    private String author;

    @CourseInfoAnnotation(courseName = "电商", courseTag = "js", courseProfile = "简介")
    public void getCourseInfo() {

    }
}
