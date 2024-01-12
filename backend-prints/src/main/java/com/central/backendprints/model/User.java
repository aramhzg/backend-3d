package com.central.backendprints.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
public class User {
    @Id
    @Column(name="usuarioid")
    private Long idPerson;
    @Column(name="nombre")
    private String name;
}
