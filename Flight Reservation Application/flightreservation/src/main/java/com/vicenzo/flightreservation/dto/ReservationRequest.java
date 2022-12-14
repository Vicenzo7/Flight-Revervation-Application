package com.vicenzo.flightreservation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ReservationRequest {

    private Long flightId;

    private String passengerFirstName;
    private String passengerLastName;
    private String passengerEmail;
    private String passengerPhone;

    private String nameOnTheCard;
    private String cardNumber;
    private String expirationDate;
    private String securityCode;
}
