public class TeenNumberChecker {

    public static boolean hasTeen(int teen1, int teen2, int teen3){

        if( (teen1 >= 13 && teen1 <=19) || (teen2 >=13 && teen2 <= 19) || (teen3 >=13 && teen3 <=19) ){
            System.out.println("teen");
            return true;
        }else
            return false;

    }

    public static boolean isTeen(int teenAge){
        if(teenAge >= 13 && teenAge <= 19){
            return true;
        }else return false;
    }

}
