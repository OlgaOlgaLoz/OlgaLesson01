package cat1;

public class oop1 {
    public static void main(String[] args) {
        Cats Mycat=new Cats("Имя ",0,"порода","цвет");
        Mycat.setName("Васька");
        Mycat.setYear(5);
        Mycat.setPoroda("cиамский");
        Mycat.setColor("белый");
        System.out.println(Mycat.toString());

        Mycat.setName("Барсик");
        Mycat.setYear(3);
        Mycat.setPoroda("нибелунг");
        Mycat.setColor("серый");
        System.out.println(Mycat.toString());

        Cats Mycat1=new Cats("Имя ",0,"порода","цвет");
        Mycat1.setName("Фунтик");
        Mycat1.setYear(1);
        Mycat1.setPoroda("бенгальский");
        Mycat1.setColor("пятнистый");
        System.out.println(Mycat1.toString());

    }
}
