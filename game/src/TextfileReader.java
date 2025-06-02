/**
 * Class allowing to get .txt file content as a multiline String
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
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
            InputStream is = TextfileReader.class.getResourceAsStream(filePath);
            if (is == null) {
                return "";
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
