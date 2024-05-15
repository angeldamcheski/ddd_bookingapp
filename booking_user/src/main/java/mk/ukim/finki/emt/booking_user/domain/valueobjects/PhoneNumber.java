package mk.ukim.finki.emt.booking_user.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class PhoneNumber implements ValueObject {
    private final String phoneNumber;
    private final String operator;
    public PhoneNumber(){
        this.phoneNumber = null;
        this.operator = null;
    }
    protected PhoneNumber(String phoneNumber, String operator){
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

}
