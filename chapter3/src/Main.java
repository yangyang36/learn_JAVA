import java.util.HashMap;
import java.util.Map;

public class Main {
    public Main(){
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("Ashi",49000);
        incomeMap.put("Yuni",22000);
        incomeMap.put("Ste",30000);
        incomeMap.put("Cix",9999);

        System.out.println("==============================");
        for(Map.Entry<String, Integer> entry : incomeMap.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("==============================");

//        上面跟下面這段是一樣的
        incomeMap.forEach((name, income) -> {
            System.out.println(name + ", "+ income);
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
