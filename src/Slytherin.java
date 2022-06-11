public class Slytherin extends HogwartsSchool {

    private int cunning;
    private int determination;
    private int ambition;
    private int thirstForPower;

    public Slytherin(String name, int powerOfMagic, int distanceOfTransgression, int cunning, int determination, int ambition, int thirstForPower) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" + super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    public static void comparisonOfStudents(Slytherin firstStudent,  Slytherin secondStudent) {

        int summ1 = firstStudent.cunning + firstStudent.determination + firstStudent.ambition + firstStudent.thirstForPower;
        int summ2 = secondStudent.cunning + secondStudent.determination + secondStudent.ambition + secondStudent.thirstForPower;

        if(summ1 > summ2){
            System.out.println(firstStudent.getName() + " лучший Слизериновец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Слизериновец, чем " + firstStudent.getName());
        }
    }
}
