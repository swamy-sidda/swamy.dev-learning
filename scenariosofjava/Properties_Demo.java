package scenariosofjava;

import java.util.Properties;

public class Properties_Demo {
    static void main() {
        demo();
    }
    public static void demo() {
        Properties p = new Properties();
        p.put("key1", "value1");
        p.put("key2", "value2");
        p.put("key3", "value3");
        p.put("key4", "value4");

        System.out.println(p.get("key4"));
    }
}
