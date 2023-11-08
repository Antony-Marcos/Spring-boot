package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String numeroConta;
    @OneToOne(mappedBy = "conta")
    private Cliente cliente;


}
