package pipeAndFilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();
        RemoveFieldsFilter removeFieldsFilter = new RemoveFieldsFilter();
        pipe.filters.add(removeFieldsFilter);
        SortByCityFilter sortByCityFilter = new SortByCityFilter();
        pipe.filters.add(sortByCityFilter);

        Scanner scanner = new Scanner(new File("C:\\Users\\User\\Desktop\\V SEMESTAR\\Dizajn i arhitektura na softver\\Homework1\\test.csv"));
        scanner.useDelimiter(",");

        Scanner consoleInput = new Scanner(System.in);
        String input = consoleInput.nextLine();

        while (scanner.hasNextLine()) {
            System.out.print(pipe.runFilter(scanner.nextLine(), input));
        }
    }
}
