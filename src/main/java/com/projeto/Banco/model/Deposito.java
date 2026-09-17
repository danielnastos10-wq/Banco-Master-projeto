package com.projeto.Banco.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity (name = "tb_depositos")
@Getter
@NoArgsConstructor

public class Deposito {
    @Id  
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false)
    private String destinatario;
    @Column (nullable = false, unique = true)
    private long valor;
    
    @Column (nullable = false)
    private Date data;
}
