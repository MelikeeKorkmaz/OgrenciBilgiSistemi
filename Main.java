public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Burak", 5555, "MAT");
        Teacher t2 = new Teacher("Zeynep", 4444, "FZK");
        Teacher t3 = new Teacher("Aziz", 5555, "ING");

        Course mat = new Course("Matematik", "MAT", "M111");
        Course fizik = new Course("Fizik", "FZK", "F222");
        Course ing = new Course("İngilizce", "ING", "I333");

        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        ing.addTeacher(t3);
        ing.printTeacher();

        Student s1 = new Student("Halit", 123, 4, mat, fizik, ing);
        s1.addBulkExamNote(50, 65, 75);
        s1.addVNote(56, 42, 90);
        s1.isPass();

        Student s2 = new Student("Melike", 352, 4, mat, fizik, ing);
        s2.addBulkExamNote(65, 78, 92);
        s2.addVNote(75, 52, 36);
        s2.isPass();

        Student s3 = new Student("Umut", 653, 4, mat, fizik, ing);
        s3.addBulkExamNote(50, 99, 32);
        s3.addVNote(50, 12, 90);
        s3.isPass();

        Student s4 = new Student("Okan", 777, 4, mat, fizik, ing);
        s4.addBulkExamNote(90, 98, 85);
        s4.addVNote(90, 85, 72);
        s4.isPass();


    }
}
