public class Slizerine extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    public Slizerine(String name, String surName, int witchcraft, int transgression, int trick, int determination, int ambition) {
        super(name, surName, witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }
}
