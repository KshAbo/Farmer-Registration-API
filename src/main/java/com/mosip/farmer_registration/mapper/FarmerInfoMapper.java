package com.mosip.farmer_registration.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mosip.farmer_registration.dto.FarmerInfoDto;
import com.mosip.farmer_registration.entity.FarmerInfo;

@Mapper(componentModel = "spring")
public interface FarmerInfoMapper {

    FarmerInfoDto toDto(FarmerInfo farmerInfo);

    @Mapping(target = "id", ignore = true)
    FarmerInfo toEntity(FarmerInfoDto farmerInfoDto);
}
