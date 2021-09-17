public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (goal < 0 || bigCount < 0 || smallCount < 0){
            return false;
        }
        if (bigCount *5 <= goal){
            return ((goal-(bigCount*5)) <= smallCount);
        }

        else
            return ((goal%5) <= smallCount);

    }
}
