package com.project.uniamerica.descomplica.backend.user;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String password;
}