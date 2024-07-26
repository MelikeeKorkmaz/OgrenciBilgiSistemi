public class Course {
    Teacher courseTeacher;
    String name;
    String prefix;
    String code;
    int note;
    int vNote;

    Course(String name, String prefix, String code){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = -1;
        this.vNote = -1;
    }

    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Öğretmen ve ders uyuşuyor. Sisteme giriş yaptınız!");
        }else{
            System.out.println("Öğretmen ve ders uyuşmuyor.");
        }
    }

    void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " dersinin öğretmeni: " + courseTeacher.name);
        }else{
            System.out.println(this.name + " dersine öğretmen atanmamıştır.");
        }

    }

}

