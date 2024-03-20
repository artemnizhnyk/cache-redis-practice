package com.artemnizhnyk.cacheredispractice.controller;

import com.artemnizhnyk.cacheredispractice.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final CacheService cacheService;

    @GetMapping("/{name}")
    public String getData(@PathVariable final String name) {
        return cacheService.getData(name);
    }

    @GetMapping("/manual/{name}")
    public String getManualData(@PathVariable final String name) {
        return cacheService.getManualData(name);
    }

    @GetMapping("/update/{name}")
    public String updateData(@PathVariable final String name) {
        return cacheService.updateData(name);
    }

    @GetMapping("/evict")
    public void evictData() {
        cacheService.evictData();
    }
}
