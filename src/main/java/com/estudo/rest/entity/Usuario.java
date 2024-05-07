package com.estudo.rest.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID usuarioId;

    private String name;

    public Usuario(UUID usuarioId, String name) {
        this.usuarioId = usuarioId;
        this.name = name;
    }

    public Usuario() {
    }

    public UUID getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
