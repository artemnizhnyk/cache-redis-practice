package com.artemnizhnyk.cacheredispractice.service;

import com.artemnizhnyk.cacheredispractice.dao.Dao;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CacheService {

    private final Dao dao;
    private final CacheManager cacheManager;

    @Cacheable("data")
    public String getData(final String name) {
        return dao.getData(name);
    }

    public String getManualData(final String name) {
        Cache data = cacheManager.getCache("data");
        return (String) data.get(name).get();
    }

    @CachePut("data")
    public String updateData(final String name) {
        return dao.getData(name);
    }

    @CacheEvict(value = "data", allEntries = true)
    public void evictData() {
    }
}
