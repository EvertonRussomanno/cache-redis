package com.martinseverton.cacheredis.controller;

import com.martinseverton.cacheredis.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
@RequiredArgsConstructor
public class CacheController {

    private final CacheService cacheService;

    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName){
        cacheService.evictAllCacheValues(cacheName);
    }
}
