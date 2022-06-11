public class Gryffindor extends HogwartsSchool {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public static void comparisonOfStudents(Gryffindor firstStudent,  Gryffindor secondStudent) {

        int summ1 = firstStudent.nobility + firstStudent.honor + firstStudent.bravery;
        int summ2 = secondStudent.nobility + secondStudent.honor + secondStudent.bravery;

        if(summ1 > summ2){
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
        }

    }
}
