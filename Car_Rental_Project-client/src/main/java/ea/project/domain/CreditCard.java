package ea.project.domain;

import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class CreditCard {
	String creditcardType;
	String creditCardNumber;
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @Future
    @NotEmpty(message="The credit card expiration date must not be null")
	String creditCardExpirationDate;
}
