package com.carlosacademic.qdlsspring.core.application.controllers;

import com.carlosacademic.qdlsspring.core.application.dto.EnterpriseCountryDto;
import com.carlosacademic.qdlsspring.core.application.mapper.EnterpriseDtoMapper;
import com.carlosacademic.qdlsspring.core.domain.model.enums.Typology;
import com.carlosacademic.qdlsspring.core.domain.usecases.GetEnterpriseAndCountryByTypologyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/enterprise")
@RequiredArgsConstructor
public class EnterpriseController {

    private final GetEnterpriseAndCountryByTypologyUseCase getEnterpriseAndCountryByTypologyUseCase;

    @GetMapping("/typology")
    public ResponseEntity<List<com.carlosacademic.qdlsspring.core.application.dto.EnterpriseCountryDto>> getUserByUsername(@RequestParam Typology typology){
        List<EnterpriseCountryDto> response = getEnterpriseAndCountryByTypologyUseCase.get(typology).stream()
                .map(EnterpriseDtoMapper::enterpriseCountryDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }
}
