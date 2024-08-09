package Example;

public class duck {
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    public duck(String name, int lifeExpectancy, String favoriteFood) {
        super();
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    void waddle() {
        System.out.println("waddle waddle");
    }

    void quack() {
        System.out.println("Quack Quack");
    }



}

