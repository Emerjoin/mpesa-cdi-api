package org.emerjoin.mpesa.cdi;

/**
 * @author Mario Junior.
 */
public class PaymentException extends BusinessException {

    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }

}
