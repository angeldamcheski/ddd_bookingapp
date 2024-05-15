package mk.ukim.finki.emt.sharedkernel.domain.financial;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;



@Embeddable
@Getter
public class Money implements ValueObject {
    @Enumerated(value = EnumType.STRING)
    private final Currency currency;
    private final double amount;

    protected Money(){
        this.amount = 0;
        this.currency = null;
    }
    public Money(@NonNull Currency currency, @NonNull double amount){
        this.currency = currency;
        this.amount = amount;
    }
    public static Money valueOf(Currency currency, double amount){return new Money(currency, amount);}
    public Money addMoney(Money money){
        if(!currency.equals(money.currency)){
            throw new IllegalArgumentException("Cannot add different currencies");
        }
        return new Money(currency, amount + money.amount);
    }
    public Money subtractMoney(Money money){
        if(!currency.equals(money.currency)){
            throw new IllegalArgumentException("Cannot subtract different currencies");
        }
        return new Money(currency, amount - money.amount);
    }
    public Money multiply(int m){
        return new Money(currency, amount*m);
    }
}
