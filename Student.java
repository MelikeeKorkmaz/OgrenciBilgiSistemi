public class Student {
    String name;
    int stuno;
    int classes;
    Course mat;
    Course fizik;
    Course ing;
    double avarage;
    double iAvg, mAvg, fAvg;


    Student(String name, int stuno, int classes, Course mat, Course fizik, Course ing) {
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.ing = ing;
    }
    void addVNote(int matVNote, int fizikVNote, int ingVNote){

        if (matVNote >= 0 && matVNote <= 100) {
            this.mat.vNote = matVNote;
        } else {
            this.mat.vNote = -1;
        }
        if (fizikVNote >= 0 && fizikVNote <= 100) {
            this.fizik.vNote = fizikVNote;
        } else {
            this.fizik.vNote = -1;
        }
        if (ingVNote >= 0 && ingVNote <= 100) {
            this.ing.vNote = ingVNote;
        } else {
            this.ing.vNote = -1;
        }
    }

    void addBulkExamNote(int mat, int fizik, int ing) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        } else {
            this.mat.note = -1;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        } else {
            this.fizik.note = -1;
        }
        if (ing >= 0 && ing <= 100) {
            this.ing.note = ing;
        } else {
            this.ing.note = -1;
        }
    }

    void printNote() {
        System.out.println("-----------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik notu: " + this.mat.note);
        System.out.println("Matematik sözlü notu: " + this.mat.vNote);
        System.out.println("Fizik notu: " + this.fizik.note);
        System.out.println("Fizik sözlü notu: " + this.mat.vNote);
        System.out.println("İngilizce notu: " + this.ing.note);
        System.out.println("İngilizce sözlü notu: " + this.ing.vNote);
    }

    void calcAvarage() {
        System.out.println("Sınav notlarının ortalamaya etkisi %80, sözlü notlarının etkisi %20 olarak belirlenmiştir.");
        this.iAvg = (this.ing.note*0.8) + (this.ing.vNote*0.2);
        this.mAvg = (this.mat.note*0.8) + (this.mat.vNote*0.2);
        this.fAvg = (this.fizik.note*0.8) + (this.fizik.vNote*0.2);

        this.avarage = (this.iAvg + this.fAvg + this.mAvg) / 3.0;
        System.out.println("Ortalamanız: " + this.avarage);

    }

    void isPass() {
        printNote();
        if ((this.mat.note < 0) || (this.fizik.note < 0) || (this.ing.note < 0) || (this.ing.vNote < 0) || (this.fizik.vNote < 0) || (this.mat.vNote < 0)) {
            System.out.println("Notlar tam olarak girilmemiş!");
        } else {
            calcAvarage();
            if (this.avarage > 50) {
                System.out.println("Sınıf geçildi.");
            } else {
                System.out.println("Sınıf geçilemedi.");
            }
        }
    }

}
