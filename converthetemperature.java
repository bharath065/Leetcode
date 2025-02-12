public class converthetemperature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        double celsius = 36.50;

        converthetemperature solution = new converthetemperature();
        double[] result = solution.convertTemperature(celsius);

        System.out.printf("Kelvin: %.5f\n", result[0]);
        System.out.printf("Fahrenheit: %.5f\n", result[1]);
    }
}