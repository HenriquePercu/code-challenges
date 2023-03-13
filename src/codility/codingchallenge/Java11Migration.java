package codility.codingchallenge;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Java11Migration {

    public boolean doesStringContainVisibleCharacters(String input) {
        return !input.isBlank();
    }

    public List<String> splitToLines(String input) {
        return input.lines().collect(Collectors.toList());
    }

    public String trimUnicodeString(String input) {
        return input.strip();
    }

    public String trimLeft(String input) {
        return input.stripLeading();
    }

    public String trimRight(String input) {
        return input.stripTrailing();
    }

    public String repeatStringFiveTimes(String input) {
        return input.repeat(5);
    }

    public void saveStringInFile(String fileContents, String filename) throws Exception {
        Path file = Paths.get(filename);

        Files.writeString(file, fileContents);
    }

    public String readFileContents(String filename) throws Exception {
        Path file = Paths.get(filename);
        return Files.readString(file);
    }

    public List<String> filterOutEmptyStrings(List<String> input) {
        return input.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.toList());
    }

}
