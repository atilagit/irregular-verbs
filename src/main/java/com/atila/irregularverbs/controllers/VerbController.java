package com.atila.irregularverbs.controllers;

import com.atila.irregularverbs.services.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/verb")
public class VerbController {

    @Autowired
    VerbService verbService;
}
