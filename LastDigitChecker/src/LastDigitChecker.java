public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int n){

        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (n < 10 || n > 1000)){
            return false;
        }

        int lastDigitX = x % 10;
        int lastDigitY = y % 10;
        int lastDigitN = n % 10;

        return  lastDigitX == lastDigitY || lastDigitX == lastDigitN || lastDigitN == lastDigitY;
    }

    public static boolean isValid(int number){

        return number >= 10 && number <= 1000;

    }
}
