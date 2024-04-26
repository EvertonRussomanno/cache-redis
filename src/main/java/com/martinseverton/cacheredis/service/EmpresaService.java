package com.martinseverton.cacheredis.service;

import com.martinseverton.cacheredis.entity.Empresa;
import com.martinseverton.cacheredis.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    @Cacheable("empresas")
    public List<Empresa> findAllComCache(){
        return findAll();
    }

    public List<Empresa> findAll(){
        return (List<Empresa>) empresaRepository.findAll();
    }
}
