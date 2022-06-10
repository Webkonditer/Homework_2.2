public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 67, 97, 54, 56, 23);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 75, 85, 45, 98, 44);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 46, 86, 74, 39, 92);
        Gryffindor[] gryffindor = {harryPotter,hermioneGranger,ronWeasley};

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 95, 48, 65, 29, 99);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 89, 54, 38, 85, 98);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 87, 26, 34, 56, 86);
        Hufflepuff[] hufflepuff = {zachariahSmith,cedricDiggory,justinFinchFletchley};

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 84, 46, 64, 76, 85, 37);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 56, 96, 39, 82, 56, 45);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 46, 86, 55, 62, 69, 63);
        Ravenclaw[] ravenclaw = {zhouChang,padmaPatil,marcusBelby};

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 64, 87, 92, 43, 58, 66);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 87, 65, 95, 36, 87, 73);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 43, 48, 52, 90, 66, 39);
        Slytherin[] slytherin = {dracoMalfoy,grahamMontague,gregoryGoyle};

        System.out.println(harryPotter);
        System.out.println(zachariahSmith);
        System.out.println(zhouChang);
        System.out.println(dracoMalfoy);
    }
}