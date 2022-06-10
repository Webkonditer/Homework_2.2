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
}
