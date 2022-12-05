package com.example.binsoojpa.domain;

import com.example.binsoojpa.common.spec.SpecBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import static com.example.binsoojpa.spec.JpaSpec.*;
import static org.springframework.data.jpa.domain.Specification.where;
@Getter
@Setter
public class BinsooSearch{

    private String userName;
    private String email;

    public Specification<BinsooUser> toSpecification() {
        return SpecBuilder.builder(BinsooUser.class)
                .addSpec(where(userNameLike(userName)))
                .addSpec(where(emailLike(email)))
                .toSpecification();
    }
}