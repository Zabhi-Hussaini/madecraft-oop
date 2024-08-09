package Exercise;

public class Cat {
    private String name;
    private int lives = 9;

    public Cat(String name) {

        this.name = name;
    }

    void meow() {
        System.out.println("meoow");
        System.out.println("my name is " + this.name);
    }

    void kill() {
        lives--;
        if (lives > 0)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
            System.out.println("that's overkill yo!");
        else
            System.out.println("DEAD CAT :(");
    }
}
