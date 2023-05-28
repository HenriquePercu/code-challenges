package codesignal;

import java.util.ArrayList;

import java.util.List;

public class AddBorder {

    public static String[] solution(String[] picture) {
        List<String> pictureList = new ArrayList<>();

        pictureList.add(0, "*".repeat(picture[0].length() + 2));

        // descobrir quantos faltam para cada lado
        for (String word : picture) {
            pictureList.add("*" + word + "*");
        }
        pictureList.add("*".repeat(picture[0].length() + 2));

        return pictureList.toArray(new String[pictureList.size()]);

    }


}
