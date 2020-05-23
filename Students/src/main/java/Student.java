public class Student extends Person implements Examinator {

    int mathGrade;
    int infoGrade;
    int phisGrade;
    boolean admisPoli;

    public Student(String name, String lastName, int mathGrade, int infoGrade, int phisGrade) {
        this.name = name;
        this.lastName = lastName;
        this.mathGrade = mathGrade;
        this.infoGrade = infoGrade;
        this.phisGrade = phisGrade;

    }

    public Student() {

    }

    public void computeAverage() throws BadGradesException {
        int medie = (this.mathGrade + this.infoGrade + this.phisGrade) / 3;
        if (medie < 6) {
            throw new BadGradesException("Studentul este repetent");
        } else if (medie < 9 && medie > 6) {
            this.admisPoli = false;
        } else {
            this.admisPoli = true;
        }
    }

    public boolean getAdmisPoli() {
        return this.admisPoli;
    }



}
