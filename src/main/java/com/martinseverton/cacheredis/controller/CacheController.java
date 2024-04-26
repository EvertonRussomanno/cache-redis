package com.martinseverton.cacheredis.controller;

import com.martinseverton.cacheredis.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
@RequiredArgsConstructor
public class CacheController {

    private final CacheService cacheService;

    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName){
        cacheService.evictAllCacheValues(cacheName);
    }

    @PutMapping
    public void atualizar(){
        cacheService.atualizarCacheEmpresas();
    }
}
