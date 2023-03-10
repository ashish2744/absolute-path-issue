import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsolutePathTest {

    public void absolutePath() throws IOException, URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("Test.txt");
        String absolutePath = resource.getPath();
        Path path = Paths.get(absolutePath);
        System.out.println("Result is: "+path);

    }
}