public class HogwartsSchool {

    private String name;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public HogwartsSchool(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "name=" + name + ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                ", ";
    }

    public static void comparisonOfStudents(HogwartsSchool firstStudent,  HogwartsSchool secondStudent) {

        int summ1 = firstStudent.powerOfMagic + firstStudent.distanceOfTransgression;
        int summ2 = secondStudent.powerOfMagic + secondStudent.distanceOfTransgression;

        if(summ1 > summ2){
            System.out.println(firstStudent.getName() + " лучший студент, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший студент, чем " + firstStudent.getName());
        }

    }
}
