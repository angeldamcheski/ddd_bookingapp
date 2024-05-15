package mk.ukim.finki.emt.reservation.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.reservation.domain.valueobjects.BookingUser;
import mk.ukim.finki.emt.reservation.domain.valueobjects.BookingUserId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import java.util.Date;

@Entity
@Table(name="reservation")
public class Reservation extends AbstractEntity<ReservationId> {
    private Date startDate;
    private Date endDate;
    private int numOfPeople;
    private Money totalPrice;
    private BookingUser bookingUser;
    private BookingUserId bookingUserId;
}
