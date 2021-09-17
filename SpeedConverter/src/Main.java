public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(30.30);
        System.out.println("Miles " + miles);
        SpeedConverter.printConversion(30.30);
    }

}
