package com.mosip.farmer_registration.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/api/farmer/registration")
    public ResponseEntity<RegistrationResponse> registerFarmer(@RequestBody FarmerInfoDto farmerInfo) {
        FarmerInfo entity = farmerInfoMapper.toEntity(farmerInfo);
        farmerInfoService.createFarmerInfo(entity);

        String registrationId = "REG-" + java.time.LocalDateTime.now().toString().replace("-", "");
        RegistrationResponse response = new RegistrationResponse("success", registrationId);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/api/farmer/registration/{id}")
    public ResponseEntity<FarmerInfoDto> getFarmer(@PathVariable("id") Long farmerId) {
        Optional<FarmerInfo> farmerInfoOptional  = farmerInfoService.getFarmerInfoById(farmerId);
        return farmerInfoOptional
                .map(farmerInfo -> {
                    FarmerInfoDto farmerInfoDto = farmerInfoMapper.toDto(farmerInfo);
                    return ResponseEntity.ok(farmerInfoDto);
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
