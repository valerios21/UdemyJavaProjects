public class MinutesToYearsDaysCalculator {

        private static final String INVALID_VALUE_MESSAGE = "Invalid Value";


        public static void printYearsAndDays(long minutes){

            if (minutes < 0){
                System.out.println(INVALID_VALUE_MESSAGE);
            } else {

                long years = minutes / (60 * 24 * 365);
                long yearsRemaining = minutes % (60 * 24 * 365);
                long days = yearsRemaining / (60 * 24);

                System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");
            }
        }
}
