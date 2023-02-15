package dians.microservices.companystationsservice.models;

import java.util.List;

public class CompanyGasStations {

    private List<GasStation> companyStations;

    public CompanyGasStations(){

    }

    public CompanyGasStations(List<GasStation> companyCoordinates) {
        this.companyStations = companyCoordinates;
    }

    public List<GasStation> getCompanyStations() {
        return companyStations;
    }

    public void setCompanyStations(List<GasStation> companyStations) {
        this.companyStations = companyStations;
    }
}
