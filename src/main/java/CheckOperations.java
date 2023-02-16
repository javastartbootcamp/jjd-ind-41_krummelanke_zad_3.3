class CheckOperations {

    public static void main(String[] args) {

        int number = 111;
        double radius = 4.59;

        MathOperations mathOperations = new MathOperations();

        boolean resultEven = mathOperations.isEven(number);
        System.out.println("Liczba " + number + " jest parzysta: " + resultEven);

        boolean resultOdd = mathOperations.isOdd(number);
        System.out.println("Liczba " + number + " jest nieparzysta: " + resultOdd);

        double resultCircleField = mathOperations.crircleField(radius);
        System.out.println("Pole koła o promieniu " + radius + " cm wynosi: " + resultCircleField + " cm2");

        int resultPower = mathOperations.power(number);
        System.out.println(number + " do potęgi drugiej wynosi: " + resultPower);

    }
}
