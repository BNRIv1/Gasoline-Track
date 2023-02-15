package dians.microservices.stationsinfoservice.repository;

import dians.microservices.stationsinfoservice.models.GasStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasStationRepository extends JpaRepository<GasStation, Long> {
}
