public class Hogwarts {
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
    public static void printStudent(Griffindor[] griffindors){
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя: " + griffindor.getName()
                    + ", фамилия: " + griffindor.getSurName()
                    + ", магия: " + griffindor.getWitchcraft()
                    + ", трансгрессия: " + griffindor.getTransgression()
                    + ", благородство: " + griffindor.getNobility()
                    + ", честь: " + griffindor.getHonor()
                    + ", храбрость: " + griffindor.getBravery());
        }
    }
    public static void printStudent(Puffenduy[] puffenduys){
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy puffenduy = puffenduys[i];
            System.out.println("Имя: " + puffenduy.getName()
                    + ", фамилия: " + puffenduy.getSurName()
                    + ", магия: " + puffenduy.getWitchcraft()
                    + ", трансгрессия: " + puffenduy.getTransgression()
                    + ", благородство: " + puffenduy.getIndustriousness()
                    + ", честь: " + puffenduy.getLoyalty()
                    + ", храбрость: " + puffenduy.getHonesty());
        }
    }
    public static void printStudent(Cogtevran[] cogtevrans){
        for (int i = 0; i < cogtevrans.length; i++) {
            Cogtevran cogtevran = cogtevrans[i];
            System.out.println("Имя: " + cogtevran.getName()
                    + ", фамилия: " + cogtevran.getSurName()
                    + ", магия: " + cogtevran.getWitchcraft()
                    + ", трансгрессия: " + cogtevran.getTransgression()
                    + ", благородство: " + cogtevran.getWisdom()
                    + ", честь: " + cogtevran.getWit()
                    + ", храбрость: " + cogtevran.getCreativity());
        }
    }
    public static void printStudent(Slizerine[] slizerines){
        for (int i = 0; i < slizerines.length; i++) {
            Slizerine slizerine = slizerines[i];
            System.out.println("Имя: " + slizerine.getName()
                    + ", фамилия: " + slizerine.getSurName()
                    + ", магия: " + slizerine.getWitchcraft()
                    + ", трансгрессия: " + slizerine.getTransgression()
                    + ", благородство: " + slizerine.getTrick()
                    + ", честь: " + slizerine.getDetermination()
                    + ", храбрость: " + slizerine.getAmbition());
        }
    }
    public static void checkBestStudent(Griffindor[] griffindors) {
        int sumHarry = griffindors[0].getWitchcraft() + griffindors[0].getTransgression() + griffindors[0].getNobility() + griffindors[0].getHonor() + griffindors[0].getBravery();
        int sumGermiona = griffindors[0].getWitchcraft() + griffindors[0].getTransgression() + griffindors[1].getNobility() + griffindors[1].getHonor() + griffindors[1].getBravery();
        int sumRon = griffindors[0].getWitchcraft() + griffindors[0].getTransgression() + griffindors[2].getNobility() + griffindors[2].getHonor() + griffindors[2].getBravery();
        if (sumHarry > sumGermiona && sumHarry > sumRon) {
            System.out.println("Гарри лучший Гриффиндорец");
        } else if(sumHarry < sumRon && sumRon > sumGermiona) {
            System.out.println("Рон лучший Гриффиндорец");
        } else {
            System.out.println("Гермиона лучший Гриффиндорец");
        }
    }public static void checkBestStudent(Puffenduy[] puffenduys) {
        int sumZaharia = puffenduys[0].getWitchcraft() + puffenduys[0].getTransgression() + puffenduys[0].getIndustriousness() + puffenduys[0].getLoyalty() + puffenduys[0].getHonesty();
        int sumSedrig = puffenduys[0].getWitchcraft() + puffenduys[0].getTransgression() + puffenduys[1].getIndustriousness() + puffenduys[1].getLoyalty() + puffenduys[1].getHonesty();
        int sumJustin = puffenduys[0].getWitchcraft() + puffenduys[0].getTransgression() + puffenduys[2].getIndustriousness() + puffenduys[2].getLoyalty() + puffenduys[2].getHonesty();
        if (sumZaharia > sumSedrig && sumZaharia > sumJustin) {
            System.out.println("Захария лучший Пуффендуец");
        } else if(sumZaharia < sumJustin && sumJustin > sumSedrig) {
            System.out.println("Джастинг лучший Пуффендуец");
        } else {
            System.out.println("Седриг лучший Пуффендуец");
        }
    }
    public static void checkBestStudent(Cogtevran[] cogtevrans) {
        int sumChjou = cogtevrans[0].getWitchcraft() + cogtevrans[0].getTransgression() + cogtevrans[0].getWisdom() + cogtevrans[0].getWit() + cogtevrans[0].getCreativity();
        int sumPadma = cogtevrans[0].getWitchcraft() + cogtevrans[0].getTransgression() + cogtevrans[1].getWisdom() + cogtevrans[1].getWit() + cogtevrans[1].getCreativity();
        int sumMarkus = cogtevrans[0].getWitchcraft() + cogtevrans[0].getTransgression() + cogtevrans[2].getWisdom() + cogtevrans[2].getWit() + cogtevrans[2].getCreativity();
        if (sumChjou > sumPadma && sumChjou > sumMarkus) {
            System.out.println("Чжоу лучший Когтеврановец");
        } else if(sumChjou < sumMarkus && sumMarkus > sumPadma) {
            System.out.println("Маркус лучший Когтеврановец");
        } else {
            System.out.println("Падма лучший Когтеврановец");
        }
    }
    public static void checkBestStudent(Slizerine[] slizerines) {
        int sumDrako = slizerines[0].getWitchcraft() + slizerines[0].getTransgression() + slizerines[0].getTrick() + slizerines[0].getDetermination() + slizerines[0].getAmbition();
        int sumGreham = slizerines[0].getWitchcraft() + slizerines[0].getTransgression() + slizerines[1].getTrick() + slizerines[1].getDetermination() + slizerines[1].getAmbition();
        int sumGrehory = slizerines[0].getWitchcraft() + slizerines[0].getTransgression() + slizerines[2].getTrick() + slizerines[2].getDetermination() + slizerines[2].getAmbition();
        if (sumDrako > sumGreham && sumDrako > sumGrehory) {
            System.out.println("Драко лучший Слизериновец");
        } else if(sumDrako < sumGrehory && sumGrehory > sumGreham) {
            System.out.println("Грегори лучший Слизериновец");
        } else {
            System.out.println("Грехам лучший Слизериновец");
        }
    }
    public static void checkBestStudentHogwarts(Griffindor[] griffindors, Puffenduy[] puffenduys, Cogtevran[] cogtevrans, Slizerine[] slizerines) {
       if (griffindors[0].getWitchcraft() + griffindors[0].getTransgression() < slizerines[0].getWitchcraft() + slizerines[0].getTransgression()) {
           System.out.println("Драко мощнее Гарри");
       } else {
           System.out.println("Гарри мощнее Драко");
       }
    }
}
