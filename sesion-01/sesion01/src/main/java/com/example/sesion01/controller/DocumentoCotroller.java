package com.example.sesion01.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;

@RestController
@RequestMapping("/api/v1/documento")
public class DocumentoCotroller {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String cargaArchivo(@RequestPart MultipartFile file){
        String fileName = file.getOriginalFilename();
        return fileName;
    }
}
