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
    public void compareStudent(Cogtevran cogtevranStudent) {
        int sumThis = this.wisdom + this.wit + this.creativity;
        int sumGriffindorStudent = cogtevranStudent.getWisdom() + cogtevranStudent.getWit() + cogtevranStudent. getCreativity();
        if (sumThis > sumGriffindorStudent) {
            System.out.println("Чжоу лучший Пуффендуец");
        } else {
            System.out.println("Падма лучший Пуффендуец");
        }
    }
    @Override
    public String toString() {
        return "Cogtevran (" + this.getName() + " " + this.getSurName()
                + ": witchcraft=" + this.getWitchcraft() + ", transgression=" + this.getTransgression()
                + ", wisdom=" + wisdom + ", wit=" + wit + ", creativity=" + creativity + ")";
    }
}
