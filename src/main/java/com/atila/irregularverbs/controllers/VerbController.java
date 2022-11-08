package com.atila.irregularverbs.controllers;

import com.atila.irregularverbs.dtos.VerbDTO;
import com.atila.irregularverbs.services.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/verbs")
public class VerbController {

    @Autowired
    VerbService verbService;

    @PostMapping()
    public ResponseEntity<VerbDTO> saveVerb(@RequestBody @Valid VerbDTO verbDTO) {
        verbDTO = verbService.save(verbDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(verbDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(verbDTO);
    }

    @GetMapping()
    public ResponseEntity<List<VerbDTO>> findAll() {
        return ResponseEntity.ok(verbService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VerbDTO> getById(@PathVariable Long id) {
        VerbDTO verbDTO = verbService.findById(id);
        return ResponseEntity.ok(verbDTO);
    }
}
