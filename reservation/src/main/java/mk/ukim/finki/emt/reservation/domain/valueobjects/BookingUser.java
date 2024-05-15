package mk.ukim.finki.emt.reservation.domain.valueobjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name="booking_user")
public class BookingUser extends AbstractEntity<BookingUserId> {
    public String firstName;
    public String lastName;
    public String emailAddress;
    public PhoneNumber phoneNumber;
}
