package pipeAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    public List<Filter<T>> filters = new ArrayList<>();

    public T runFilter(T input, String searchInput) {
        for (Filter<T> filter : filters) {
            if (filter instanceof SortByCityFilter) {
                input = filter.execute(input, searchInput);
            } else input = filter.execute(input);
        }
        return input;
    }
}
