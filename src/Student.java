public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physic;
    Course chemistry;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physic,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physic, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.note = physic;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }
    public void addVerbalNote(int math, int physic, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.verbalNote = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.verbalNote = physic;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.verbalNote = chemistry;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physic.note == 0 || this.chemistry.note == 0) {
            System.out.println("Grades are not available");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed !");
            } else {
                System.out.println("Failed !");
            }
        }
    }

    public void calcAverage() {

        this.average = ((this.physic.note*0.8+this.physic.verbalNote*0.20) + (this.chemistry.note*0.8+this.chemistry.verbalNote*0.2) + (this.math.note*0.8+this.math.verbalNote*0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade: " + this.math.note);
        System.out.println("Physic Grade : " + this.physic.note);
        System.out.println("Chemistry Grade : " + this.chemistry.note);
    }

}