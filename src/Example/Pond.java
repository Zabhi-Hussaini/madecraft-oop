package Example;

public class Pond {
    public static void main(String[] args) {

        duck mobyDuck = new duck("Moby", 90 / 3, "celery");
        duck wolfgangDuck = new duck("Wolfgang", 60 / 3, "cheeseburgers");

        mobyDuck.waddle();
    }
}
