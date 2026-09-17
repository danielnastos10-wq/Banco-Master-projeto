package com.projeto.Banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity (name = "tb_investimentos")
@Getter 
@NoArgsConstructor
class Investimento {
    @Id 
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
private Long id;
@Column (nullable = false)
    private String tipo;
    @Column (nullable = false, unique = true)
    private long valor;
    @Column (nullable = false)
    private long taxa;
}
