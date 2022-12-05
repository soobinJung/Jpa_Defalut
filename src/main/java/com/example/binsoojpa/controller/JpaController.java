package com.example.binsoojpa.controller;

import com.example.binsoojpa.domain.BinsooSearch;
import com.example.binsoojpa.domain.BinsooUser;
import com.example.binsoojpa.service.JpaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class JpaController {

    private final JpaService service;

    @GetMapping("/user")
    public List<BinsooUser> findAll (BinsooSearch search){
        return service.findAll(search);
    }

    @GetMapping("/user/{id}")
    public BinsooUser findById(@PathVariable long id){
        return service.findById(id);
    }
}
