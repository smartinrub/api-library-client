package com.sergiomartinrubio.apilibraryclient.controller;

import com.sergiomartinrubio.demoapplicationclient.ToUppercaseClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uppercase")
public class ToUppercaseClientController {

    private final ToUppercaseClient toUppercaseClient;

    public ToUppercaseClientController(ToUppercaseClient toUppercaseClient) {
        this.toUppercaseClient = toUppercaseClient;
    }

    @GetMapping("/{word}")
    public String toUppercase(@PathVariable("word") String word) {
        return toUppercaseClient.toUppercase(word);
    }
}
