package com.atila.irregularverbs.services;

import com.atila.irregularverbs.dtos.VerbDTO;
import com.atila.irregularverbs.entities.Verb;
import com.atila.irregularverbs.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
