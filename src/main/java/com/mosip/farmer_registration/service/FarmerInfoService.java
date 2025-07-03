package com.mosip.farmer_registration.service;

import java.util.Optional;

import com.mosip.farmer_registration.entity.FarmerInfo;

public interface FarmerInfoService {

    FarmerInfo createFarmerInfo(FarmerInfo farmerInfo);

    Optional<FarmerInfo> getFarmerInfoById(Long farmerId);

    void deleteFarmerInfoById(Long farmerId);

}
