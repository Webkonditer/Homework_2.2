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

    public void comparisonOfGryffindorStudents(Gryffindor[] gryffindor) {
        int max = 0;
        Gryffindor theBest = null;
        for (int i = 0; i < gryffindor.length; i++) {
            int summ = gryffindor[i].nobility + gryffindor[i].honor + gryffindor[i].bravery;
            if(summ > max) {
                max = summ;
                theBest = gryffindor[i];
            }
        }
        System.out.println();

    }
}
