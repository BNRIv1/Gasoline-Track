package dians.microservices.companystationsservice.models;

import java.util.List;

public class AllGasStations {

    private List<GasStation> gasStations;

    public List<GasStation> getGasStations() {
        return gasStations;
    }

    public void setGasStations(List<GasStation> gasStations) {
        this.gasStations = gasStations;
    }

    public AllGasStations(){

    }

    public AllGasStations(List<GasStation> gasStations) {
        this.gasStations = gasStations;
    }
}
