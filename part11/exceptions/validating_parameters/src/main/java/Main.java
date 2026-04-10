public class Main {
    public static void main(String[] args) {

        // These will all throw errors.
        Calculator calc = new Calculator();
        calc.factorial(-1);
        calc.binomialCoefficent(2, 5);

        Person tooOld = new Person("John", 253);
        Person noName = new Person("", 25);
    }
}