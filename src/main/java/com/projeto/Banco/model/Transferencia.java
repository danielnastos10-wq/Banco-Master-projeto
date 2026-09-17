package com.projeto.Banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity (name = "tb_transferencias")
@Getter 
@NoArgsConstructor 
public class Transferencia {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
private long id;
@Column (nullable = false)
private String tipo;
@Column (nullable = false, unique = true)
private long saldo;
@Column (nullable = false)
private String destinatario;
    
}
