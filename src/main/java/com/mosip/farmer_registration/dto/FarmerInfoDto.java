package com.mosip.farmer_registration.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FarmerInfoDto {

    private Long id;

    private String name;

    private String phone_number;

    private String email;

    private LocalDate date_of_birth;

    private String gender;

    private String state;

    private String district;

    private String village;

    private Integer pin_code;

    private String address;

    private String civil_status;

    private LocalDate registration_date;



    private String education_level;

    private String employment_status;

    private String hh_income_type;



    private Integer total_land_area;

    private String ownership_type;

    private String land_certificate;

    private Integer land_id;



    private String primary_crop;

    private String collected_gc;

    private String season;

    private String secondary_crop;


    
    private String livestock_type;
    
    private String livestock_count;


}
