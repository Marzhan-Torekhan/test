package Tst1;

public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Muraka", 2 , "White");
        Cat smallCat = new Cat(1000, "Kiki", 1 , "Grey");
        //System.out.println("Вес большой кошки = " + bigCat.weight);
        //System.out.println("Вес маленькой кошки = " + smallCat.weight);
        System.out.println("Имя маленькой кошки = " + smallCat.getName());
        System.out.println("Имя большой кошки = " + bigCat.getName());
        bigCat.setName("Fibi");
        System.out.println("Имя большой кошки = " + bigCat.getName());
    }
}

