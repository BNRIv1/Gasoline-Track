package pipeAndFilter;

public interface Filter <T>{
    T execute (T input);
    T execute (T input, String searchInput);
}
