package org.emerjoin.mpesa.cdi;

/**
 * @author Mario Junior.
 */
public class MpesaException extends RuntimeException {

    public MpesaException(String message, Throwable cause){
        super(message,cause);
    }

}
