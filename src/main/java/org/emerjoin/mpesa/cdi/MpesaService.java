package org.emerjoin.mpesa.cdi;

/**
 * @author Mario Junior.
 */
public interface MpesaService {

    Payment execute(PaymentOrder order) throws MpesaException;

}
