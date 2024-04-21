package com.project.util;
import com.project.exception.CalculationException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static final String MARKER = "#";
    public List<String> readValidLinesFromFile(String filePath) throws IOException {
        List<String> validLines = new ArrayList<>();
        try {
            validLines = Files.lines(Paths.get(filePath))
                    .filter(line -> !line.startsWith(MARKER) && !line.trim().isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new CalculationException("Error reading file: " + filePath);
        }
        return validLines;
    }
}