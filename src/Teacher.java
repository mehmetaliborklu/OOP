public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printTeacherInfo() {
        System.out.println("Öğretmen Adı: "+this.name+"\n"+"Öğretmen Telefon Numarası: "+ this.mpno+"\n"+"Öğretmen Bölümü: "+this.branch);

    }
}
