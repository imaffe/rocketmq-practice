package simple;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.CqlSessionBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("trying to use session");
        try {
            CqlSession session = CqlSession.builder().build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
