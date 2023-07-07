public abstract class Hogwarts {
    private String name;
    private String surName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, String surName, int witchcraft, int transgression) {
        this.name = name;
        this.surName = surName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getWitchcraft() {
        return witchcraft;
    }
    public int getTransgression() {
        return transgression;
    }
    public void checkBestStudentHogwarts(Hogwarts hogwarts) {
        int sumThis = this.witchcraft + this.transgression;
        int sumHorwartsStudent = hogwarts.getWitchcraft() + hogwarts.getTransgression();
        if (sumThis > sumHorwartsStudent) {
            System.out.println("Гарри лучше Драко");
        } else {
            System.out.println("Драко лучше Гарри");
        }
    }
}
