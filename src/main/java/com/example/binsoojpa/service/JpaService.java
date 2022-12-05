package com.example.binsoojpa.service;

import com.example.binsoojpa.domain.BinsooSearch;
import com.example.binsoojpa.domain.BinsooUser;
import com.example.binsoojpa.repository.JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JpaService {

    private final JpaRepository repository;

    public List<BinsooUser> findAll (BinsooSearch search){
        return repository.findAll(search.toSpecification());
    }

    public BinsooUser findById (long id){
        return repository.findById(id);
    }
}
