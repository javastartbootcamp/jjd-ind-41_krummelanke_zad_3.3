class MathOperations {

    int number;

    boolean isEven(int number) {

        return number % 2 == 0;
    }

    boolean isOdd(int number) {

        return number % 2 != 0;
    }

    double crircleField(double radius) {

        return 3.14159 * radius * radius;
    }

    int power(int number) {

        return number * number;
    }
}