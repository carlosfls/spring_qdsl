package com.carlosacademic.qdlsspring.core.infrastructure.mapper;

import com.carlosacademic.qdlsspring.core.domain.model.EstablishmentModel;
import com.carlosacademic.qdlsspring.core.infrastructure.model.Establishment;

public class EstablishmentEntityModelMapper {

    public static EstablishmentModel toEstablishmentModelFromEstablishment(Establishment establishment){
        EstablishmentModel response = new EstablishmentModel();
        response.setId(establishment.getId());
        response.setName(response.getName());
        response.setCode(establishment.getCode());
        response.setPhone(response.getPhone());
        response.setAddress(response.getAddress());
        response.setLatitude(response.getLatitude());
        response.setLongitude(response.getLongitude());
        response.setEmail(response.getEmail());
        response.setCity(response.getCity());

        return response;
    }
}
