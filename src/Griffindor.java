public class Griffindor extends  Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Griffindor(String name, String surName, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, surName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

}
