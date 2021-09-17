public class EqualSumChecker {

        public static boolean hasEqualSum(int number1, int number2, int number3){

            int sum1 = number1 + number2;

            if ( sum1 == number3){
                return true;
            }else
                return false;

        }

}
