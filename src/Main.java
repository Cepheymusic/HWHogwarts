public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри", "Поттер", 20, 10, 50, 10, 15);
        Griffindor germiona = new Griffindor("Гермиона", "Грейнджер", 25, 15, 10, 15, 15);
        Griffindor ron = new Griffindor("Рон", "Уизли", 5, 6, 5, 5, 10);
        Puffenduy zaharia = new Puffenduy("Захария", "Смит", 8, 9,  7, 14, 21);
        Puffenduy sedrig = new Puffenduy("Седриг", "Диггори", 10, 11, 8, 16 , 24);
        Puffenduy justin = new Puffenduy("Джастин", "Финч-Флетчли",12, 9, 9, 18, 27);
        Cogtevran chjou = new Cogtevran("Чжоу", "Чанг",7, 6, 10, 11, 12);
        Cogtevran padma = new Cogtevran("Падма", "Патил", 5, 4, 5, 4, 3);
        Cogtevran markus = new Cogtevran("Маркус", "Белби", 6, 3, 9, 15, 33);
        Slizerine drako = new Slizerine("Драко", "Малфой", 25, 30, 25, 30, 22);
        Slizerine greham = new Slizerine("Грэхэм", "Монтегю", 18, 15, 15, 16, 17);
        Slizerine gregory = new Slizerine("Грегори", "Гойл", 8, 15, 8, 10, 9);
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        harry.compareStudent(germiona);
        System.out.println(zaharia);
        System.out.println(sedrig);
        System.out.println(justin);
        zaharia.compareStudent(sedrig);
        System.out.println(chjou);
        System.out.println(padma);
        System.out.println(markus);
        chjou.compareStudent(padma);
        System.out.println(drako);
        System.out.println(greham);
        System.out.println(gregory);
        drako.compareStudent(greham);
        harry.checkBestStudentHogwarts(drako);
    }
}