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
    public void compareStudent(Slizerine slizerineStudent) {
        int sumThis = this.trick + this.determination + this.ambition;
        int sumGriffindorStudent = slizerineStudent.getTrick() + slizerineStudent.getDetermination() + slizerineStudent. getAmbition();
        if (sumThis > sumGriffindorStudent) {
            System.out.println(this.getName() + " лучший Слизериновец");
        } else {
            System.out.println(slizerineStudent.getName() + " лучший Гриффиндорец");
        }
    }
    @Override
    public String toString() {
        return "Slizerine (" + super.toString()
                + ", trick=" + trick
                + ", determination=" + determination
                + ", ambition=" + ambition + ")";
    }
}
