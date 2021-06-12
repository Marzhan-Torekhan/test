package Tst1;

class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount; //Статичное поле

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счётчик кошек
    }

    //Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", 2, "White");  //Вызывает конструктор с параметрами
    }


    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

