import com.java.spring.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void main() {
        // Given
        String[] args = {"3", "1", "2"};

        // When & Then
        Main.main(args);
    }
}
