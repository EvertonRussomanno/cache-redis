package com.martinseverton.cacheredis.service;
import com.martinseverton.cacheredis.cloud.Ibge;
import com.martinseverton.cacheredis.cloud.IbgeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IbgeService {

    private final Ibge ibge;

    @Cacheable(value = "estados", condition = "#estado.equalsIgnoreCase('MG')")
    public List<IbgeResponse> findAllCidades(String estado) {
        System.out.println("vai buscar no IBGE");
        return ibge.findAllCidades(estado);
    }
}