package com.atila.irregularverbs.services;

import com.atila.irregularverbs.dtos.VerbDTO;
import com.atila.irregularverbs.entities.Verb;
import com.atila.irregularverbs.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
public class VerbService {

    @Autowired
    VerbRepository verbRepository;


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

    public VerbDTO getById(Long id) {
        Verb verb = verbRepository.getById(id);
        var verbDTO = new VerbDTO();
        copyProperties(verb, verbDTO);
        return verbDTO;
    }
}
