public class Cogtevran extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;

    public Cogtevran(String name, String surName, int witchcraft, int transgression, int wisdom, int wit, int creativity) {
        super(name, surName, witchcraft, transgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
