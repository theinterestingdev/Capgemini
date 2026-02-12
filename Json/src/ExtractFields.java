import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFields {

    private static String readFile(Path path) throws IOException {
        return Files.readString(path, StandardCharsets.UTF_8);
    }

    private static String extractStringField(String json, String fieldName) {
        Pattern p = Pattern.compile("\\\"" + Pattern.quote(fieldName) + "\\\"\\s*:\\s*\\\"(.*?)\\\"");
        Matcher m = p.matcher(json);
        if (!m.find()) {
            return null;
        }
        return m.group(1);
    }

    public static void main(String[] args) throws Exception {
        String fileName = args.length > 0 ? args[0] : "user.json";

        String json = readFile(Path.of(fileName));
        String name = extractStringField(json, "name");
        String email = extractStringField(json, "email");

        System.out.println("Extracted fields:");
        System.out.println("name  = " + name);
        System.out.println("email = " + email);
    }
}
