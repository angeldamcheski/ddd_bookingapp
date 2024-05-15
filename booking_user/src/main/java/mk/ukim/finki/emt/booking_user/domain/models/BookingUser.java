package mk.ukim.finki.emt.booking_user.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.booking_user.domain.valueobjects.PhoneNumber;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name="booking_user")
public class BookingUser extends AbstractEntity<BookingUserId> {
    public String firstName;
    public String lastName;
    public String emailAddress;
    public PhoneNumber phoneNumber;
}
