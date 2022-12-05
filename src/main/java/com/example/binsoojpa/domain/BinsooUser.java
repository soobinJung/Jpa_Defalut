package com.example.binsoojpa.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@EqualsAndHashCode(callSuper = false, of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BINSOO_USER")
@Entity
public class BinsooUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "userName")
    String userName;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;
}
