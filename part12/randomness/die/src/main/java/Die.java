import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        return random.nextInt(1, numberOfFaces + 1);
        // Produces the same
        // return random.nextInt(numberOfFaces) + 1;
    }
}