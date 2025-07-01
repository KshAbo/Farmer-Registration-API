package com.mosip.farmer_registration.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mosip.farmer_registration.entity.FarmerInfo;

@Repository
public interface FarmerInfoRepository extends JpaRepository<FarmerInfo, Long> {
    
}
