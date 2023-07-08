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
    public void compareStudent(Griffindor griffindorStudent) {
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumGriffindorStudent = griffindorStudent.getNobility() + griffindorStudent.getHonor() + griffindorStudent. getBravery();
        if (sumThis > sumGriffindorStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец");
        } else {
            System.out.println(griffindorStudent.getName() + " лучший Гриффиндорец");
        }
    }
    @Override
    public String toString() {
        return "Griffindor (" + super.toString()
                + ", nobility=" + nobility + ", honor=" + honor + ", bravery=" + bravery + ")";
    }
}
