package service;

import model.Office;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface OfficeService {
    Set<Office> getAllOffices();

    Optional<Office> findOfficeById(BigDecimal id);

    void insertOffice(Office office);

    void updateOffice(Office office);

    void deleteOffice(BigDecimal id);

    List<Office> findByCityIgnoreCase(String city);
}