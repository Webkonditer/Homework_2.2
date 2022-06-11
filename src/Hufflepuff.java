public class Hufflepuff extends HogwartsSchool {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int distanceOfTransgression, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public static void comparisonOfStudents(Hufflepuff firstStudent,  Hufflepuff secondStudent) {

        int summ1 = firstStudent.diligence + firstStudent.loyalty + firstStudent.honesty;
        int summ2 = secondStudent.diligence + secondStudent.loyalty + secondStudent.honesty;

        if(summ1 > summ2){
            System.out.println(firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName());
        }

    }
}

