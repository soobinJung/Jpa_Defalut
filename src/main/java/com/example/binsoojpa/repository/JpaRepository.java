package com.example.binsoojpa.repository;

import com.example.binsoojpa.domain.BinsooUser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<BinsooUser, Long>, JpaSpecificationExecutor<BinsooUser> {
    public BinsooUser findById( long id );
}
