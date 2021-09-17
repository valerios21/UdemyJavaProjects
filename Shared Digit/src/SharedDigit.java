public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){

        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99) ){
            return false;
        }else {

            int lastDigitOfNumber1 = number1 % 10;
            int firstDigitOfNumber1 = number1 / 10;

            int lastDigitOfNumber2 = number2 % 10;
            int firstDigitOfNumber2 = number2 / 10;

            return (lastDigitOfNumber1 == lastDigitOfNumber2 || lastDigitOfNumber1 == firstDigitOfNumber2 ||
                    firstDigitOfNumber1 == lastDigitOfNumber2 || firstDigitOfNumber1 == firstDigitOfNumber2);


        }
    }
}
