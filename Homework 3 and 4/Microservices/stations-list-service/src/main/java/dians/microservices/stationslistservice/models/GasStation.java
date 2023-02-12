package dians.microservices.stationslistservice.models;

public class GasStation {

    private Long id;
    private String name;
    private String city;
    private String coordinate_x;
    private String coordinate_y;

    public GasStation(){

    }

    public GasStation(String name, String city, String coordinate_x, String coordinate_y){
        this.name = name;
        this.city = city;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordinate_x() {
        return coordinate_x;
    }

    public void setCoordinate_x(String coordinate_x) {
        this.coordinate_x = coordinate_x;
    }

    public String getCoordinate_y() {
        return coordinate_y;
    }

    public void setCoordinate_y(String coordinate_y) {
        this.coordinate_y = coordinate_y;
    }
}
