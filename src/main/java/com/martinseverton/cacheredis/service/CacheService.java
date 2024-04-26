package com.martinseverton.cacheredis.service;

import com.martinseverton.cacheredis.entity.Empresa;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CacheService {

    private final CacheManager cacheManager;

    private final EmpresaService empresaService;

    public void evictAllCacheValues(String cacheName){
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }

    @CachePut(value = "empresas")
    public List<Empresa> atualizarCacheEmpresas() {
        return empresaService.findAll();
    }
}
