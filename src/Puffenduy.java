public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Puffenduy(String name, String surName, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surName, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness() {
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }
    public void compareStudent(Puffenduy puffenduiStudent) {
        int sumThis = this.industriousness + this.loyalty + this.honesty;
        int sumGriffindorStudent = puffenduiStudent.getIndustriousness() + puffenduiStudent.getLoyalty() + puffenduiStudent. getHonesty();
        if (sumThis > sumGriffindorStudent) {
            System.out.println("Захария лучший Пуффендуец");
        } else {
            System.out.println("Седриг лучший Пуффендуец");
        }
    }
    @Override
    public String toString() {
        return "Puffenduy (" + this.getName() + " " + this.getSurName()
                + ": witchcraft=" + this.getWitchcraft() + ", transgression=" + this.getTransgression()
                + ", industriousness=" + industriousness + ", loyalty=" + loyalty + ", honesty=" + honesty + ")";
    }
}
