package com.mosip.farmer_registration.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrationResponse {
    private String status;
    private String registrationId;
}
