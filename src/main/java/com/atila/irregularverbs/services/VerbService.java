package com.atila.irregularverbs.services;

import com.atila.irregularverbs.dtos.VerbDTO;
import com.atila.irregularverbs.entities.Verb;
import com.atila.irregularverbs.repositories.VerbRepository;
import com.atila.irregularverbs.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
public class VerbService {

    @Autowired
    VerbRepository verbRepository;

    @Transactional
    public VerbDTO save(VerbDTO verbDTO) {
        var verb = new Verb();
        copyProperties(verbDTO, verb);

        verb = verbRepository.save(verb);

        copyProperties(verb, verbDTO);
        return verbDTO;
    }

    public List<VerbDTO> findAll() {
        List<Verb> allVerbs = verbRepository.findAll();
        List<VerbDTO> allVerbsDTO = new ArrayList<>();
        allVerbs.forEach(verb -> {
            VerbDTO verbDTO = new VerbDTO();
            copyProperties(verb, verbDTO);
            allVerbsDTO.add(verbDTO);
        });
        return allVerbsDTO;
    }

    public VerbDTO findById(Long id) {
        Verb verb = verbRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found - Name: " + Verb.class + ", Id: " + id));
        var verbDTO = new VerbDTO();
        copyProperties(verb, verbDTO);
        return verbDTO;
    }
}
