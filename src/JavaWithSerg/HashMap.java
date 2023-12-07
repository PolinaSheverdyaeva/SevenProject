package JavaWithSerg;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMap {
    public static void main(String[] args) {

        Map<String, String> info = new LinkedHashMap<>();
        info.put("firstName", "John");
        info.put("middleName","George");
        System.out.println("Swap of First Name and Middle Name");
        System.out.println("First Name: " + info.get("firstName"));
        System.out.println("Middle Name: " + info.get("middleName"));
        String s = info.get("firstName");

        info.put("firstName",info.get("middleName"));
        info.put("middleName", s);
        System.out.println("Result: ");
        System.out.println("First Name: " + info.get("firstName"));
        System.out.println("Middle Name: " + info.get("middleName"));



    }

}
