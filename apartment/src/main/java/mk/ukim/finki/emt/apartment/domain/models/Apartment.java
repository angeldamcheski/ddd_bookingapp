package mk.ukim.finki.emt.apartment.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name="apartment")
public class Apartment extends AbstractEntity<ApartmentId> {
    private String apartmentName;
    private Boolean isAvailable;
    private Money pricePerNight;
    private String location;
    private Integer maxCapacity;
}
