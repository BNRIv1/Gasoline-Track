package pipeAndFilter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortByCityFilter implements Filter<String> {

    @Override
    public String execute(String input) {
        String city = input.split(",")[4];
        String result = "";
        if (city.equals("Скопје")) {
            result += input + "\n";
        }
        return result;
    }
}
