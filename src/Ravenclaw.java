public class Ravenclaw  extends HogwartsSchool {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int distanceOfTransgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public static void comparisonOfStudents(Ravenclaw firstStudent,  Ravenclaw secondStudent) {

        int summ1 = firstStudent.mind + firstStudent.wisdom + firstStudent.wit + firstStudent.creativity;
        int summ2 = secondStudent.mind + secondStudent.wisdom + secondStudent.wit + secondStudent.creativity;

        if(summ1 > summ2){
            System.out.println(firstStudent.getName() + " лучший Когтеврановец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Когтеврановец, чем " + firstStudent.getName());
        }

    }
}
