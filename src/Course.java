public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int sözlü;
    int yazılı;

    Course(String name, String code, String prefix, Teacher teacher, int sözlü, int yazılı) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.sözlü = sözlü;
        this.yazılı = yazılı;
    }

    double calculateCourseAverage() {
        double average = (this.sözlü*0.20) + (this.yazılı*0.80);
        return average;
    }
}
