package com.mosip.farmer_registration.service;

import org.springframework.stereotype.Service;

import com.mosip.farmer_registration.entity.FarmerInfo;
import com.mosip.farmer_registration.repository.FarmerInfoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FarmerInfoServiceImpl implements FarmerInfoService {

    private final FarmerInfoRepository farmerInfoRepository;

    @Override
    public FarmerInfo createFarmerInfo(FarmerInfo farmerInfo) {
        return farmerInfoRepository.save(farmerInfo);
    }
}
