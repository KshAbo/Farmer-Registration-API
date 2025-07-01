package com.mosip.farmer_registration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mosip.farmer_registration.dto.FarmerInfoDto;
import com.mosip.farmer_registration.entity.FarmerInfo;
import com.mosip.farmer_registration.mapper.FarmerInfoMapper;
import com.mosip.farmer_registration.response.RegistrationResponse;
import com.mosip.farmer_registration.service.FarmerInfoService;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class FarmerController {

    private final FarmerInfoService farmerInfoService;
    
    private final FarmerInfoMapper farmerInfoMapper;

    @RequestMapping("/api/farmer/registration")
    public ResponseEntity<RegistrationResponse> registerFarmer(@RequestBody FarmerInfoDto farmerInfo) {
        FarmerInfo entity = farmerInfoMapper.toEntity(farmerInfo);
        farmerInfoService.createFarmerInfo(entity);

        String registrationId = "REG-" + java.time.LocalDateTime.now().toString().replace("-", "");
        RegistrationResponse response = new RegistrationResponse("success", registrationId);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
