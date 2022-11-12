package pipeAndFilter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class RemoveFieldsFilter implements Filter<String> {

    @Override
    public String execute(String input) {
        String[] array = input.split(",");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 2 || i == 4 || i == 8 || i == 9) {
                result.append(array[i]).append(",");
            }
            if (i == 19) {
                result.append(array[i]);
            }
        }
        return result.toString();
    }

    @Override
    public String execute(String input, String searchInput) {
        return null;
    }
}
