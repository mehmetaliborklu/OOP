public class Student {
    String name;
    int studentNo;
    int classes;
    Course math;
    Course fizik;
    Course biyo;

    Student(String name, int studentNo, int classes, Course math, Course fizik, Course biyo) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.fizik = fizik;
        this.biyo = biyo;
        calculateAverage();
    }

    void calculateAverage() {
        double average = (this.math.calculateCourseAverage() + this.fizik.calculateCourseAverage()+ this.biyo.calculateCourseAverage()) / 3;
        String yesNo;
        yesNo = average >= 50 ? "Evet" : "Hayır";
        String mesaj = "Geçti Mi: " + yesNo;

        System.out.println("Öğrenci: "+this.name+"\n"+"Öğrenci No: "+this.studentNo+"\n"+"Matematik Ortalaması: "+this.math.calculateCourseAverage()+"\n"
                +"Fizik Ortalaması: "+this.fizik.calculateCourseAverage()+"\n"+"Biyoloji Ortalaması: "+this.biyo.calculateCourseAverage()+"\n"+mesaj);
    }
}
