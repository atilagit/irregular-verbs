package com.atila.irregularverbs.services;

import com.atila.irregularverbs.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerbService {

    @Autowired
    VerbRepository verbRepository;
}
