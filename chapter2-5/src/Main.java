import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<20; i++){
            arr.add(i);
        }
        int toRemoveIndex = -1;
        for(int k: arr){
            if(k==10){
                toRemoveIndex = k;
            }
        }
        arr.remove(toRemoveIndex);
    }
}
