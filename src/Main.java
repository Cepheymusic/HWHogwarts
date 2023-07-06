public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер", 20, 10, 5, 10, 15),
                new Griffindor("Гермиона", "Грейнджер", 25, 15, 10, 15, 15),
                new Griffindor("Рон", "Уизли", 5, 6, 5, 5, 10),
        };
        System.out.println("Студенты гриффиндора");
        Hogwarts.printStudent(griffindors);
        Hogwarts.checkBestStudent(griffindors);
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария", "Смит", 8, 9,  7, 14, 21),
                new Puffenduy("Седриг", "Диггори", 10, 11, 8, 16 , 24),
                new Puffenduy("Джастин", "Финч-Флетчли",12, 9, 9, 18, 27),
        };
        System.out.println("Студенты пуффендуя");
        Hogwarts.printStudent(puffenduys);
        Hogwarts.checkBestStudent(puffenduys);
        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу", "Чанг",7, 6, 10, 11, 12),
                new Cogtevran("Падма", "Патил", 5, 4, 5, 4, 3),
                new Cogtevran("Маркус", "Белби", 6, 3, 9, 15, 33),
        };
        System.out.println("Студенты когтеврана");
        Hogwarts.printStudent(cogtevrans);
        Hogwarts.checkBestStudent(cogtevrans);
        Slizerine[] slizerines = {
                new Slizerine("Драко", "Малфой", 25, 30, 25, 30, 22),
                new Slizerine("Грэхэм", "Монтегю", 18, 15, 15, 16, 17),
                new Slizerine("Грегори", "Гойл", 8, 15, 8, 10, 9),
        };
        System.out.println("Студенты слизерина");
        Hogwarts.printStudent(slizerines);
        Hogwarts.checkBestStudent(slizerines);
        Hogwarts.checkBestStudentHogwarts(griffindors, puffenduys, cogtevrans, slizerines);
    }
}