/**
 * Class allowing to get .txt file content as a multiline String
 */

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class TextfileReader {

    /**
     * @param filePath - path to the .txt file
     * @return - file content as a multiline string
     */
    public static String getContents(String filePath){
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
