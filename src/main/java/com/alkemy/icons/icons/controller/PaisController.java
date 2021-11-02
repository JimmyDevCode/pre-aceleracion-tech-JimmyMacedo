package com.alkemy.icons.icons.controller;


import com.alkemy.icons.icons.dto.PaisDto;
import com.alkemy.icons.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public ResponseEntity<List<PaisDto>> getAll(){
        //save pais
        List<PaisDto> paises = paisService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(paises);
    }
    @PostMapping
    public ResponseEntity <PaisDto> save(@RequestBody PaisDto pais){
        //sabe pais
        PaisDto paisGuardado = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisGuardado);
    }
}