package Exercise3Extend;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        ExtraRandom random = new ExtraRandom();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
// this has been extended from random
        System.out.println(random.nextLetter());
    }
}
