package com.artemnizhnyk.cacheredispractice.dao;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class Dao {

    @SneakyThrows
    public String getData(final String name) {
        Thread.sleep(2000);
        List<String> strings = Files.readAllLines(Path.of(String.format("src/main/resources/%s.txt", name)));
        return String.join(" ", strings);
    }
}
