package com.example.binsoojpa.spec;

import com.example.binsoojpa.domain.BinsooUser;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class JpaSpec {

    public static Specification<BinsooUser> userNameLike(final String userName) {
        return new Specification<BinsooUser>() {
            public Predicate toPredicate(Root<BinsooUser> root, CriteriaQuery<?> query, CriteriaBuilder builder ) {
                if(userName == null || "".equals(userName) ) return builder.conjunction();
                return builder.like(root.get("userName"), new StringBuilder().append("%").append(userName).append("%").toString());
            }
        };
    }

    public static Specification<BinsooUser> emailLike(final String email) {
        return new Specification<BinsooUser>() {
            public Predicate toPredicate(Root<BinsooUser> root, CriteriaQuery<?> query, CriteriaBuilder builder ) {
                if(email == null || "".equals(email) ) return builder.conjunction();
                return builder.like(root.get("email"), new StringBuilder().append("%").append(email).append("%").toString());
            }
        };
    }
}
