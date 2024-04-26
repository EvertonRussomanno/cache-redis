package com.martinseverton.cacheredis.controller;

import com.martinseverton.cacheredis.cloud.IbgeResponse;
import com.martinseverton.cacheredis.service.IbgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ibge")
@RequiredArgsConstructor
public class IbgeController {

    private final IbgeService ibgeService;

    @GetMapping
    public ResponseEntity<List<IbgeResponse>> findAllCidades(@RequestParam String estado){
        return ResponseEntity.ok(ibgeService.findAllCidades(estado));
    }
}
