public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mehmet", "2215666", "Matematik");
        Teacher teacher2 = new Teacher("Ali", "2334", "Fizik");
        Teacher teacher3 = new Teacher("Beyza", "228896", "Biyoloji");

        Course math = new Course("Matematik", "MAT101", "MAT", teacher1, 40, 60);
        Course fiz = new Course("Fizik", "FİZ101", "FZK", teacher2, 50, 50);
        Course biyo = new Course("Biyoloji", "BİYO101", "BİY", teacher3, 80, 80);

        Student student = new Student("Mehmet", 1234, 4, math, fiz, biyo);
    }
}
