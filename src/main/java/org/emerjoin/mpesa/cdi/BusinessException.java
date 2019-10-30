package org.emerjoin.mpesa.cdi;

/**
 * @author Mario Junior.
 */
public class BusinessException extends MpesaException {

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
