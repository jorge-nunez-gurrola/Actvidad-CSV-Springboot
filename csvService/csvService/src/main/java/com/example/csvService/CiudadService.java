package com.example.csvService;

import java.io.FileReader;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class CiudadService {
    
    public List<Ciudad> ciudadCSV(String csvLink) {
        try {
            FileReader reader = new FileReader(csvLink);
            return new CsvToBeanBuilder<Ciudad>(reader)
                    .withType(Ciudad.class)
                    .build()
                    .parse();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
