package com.example.dev.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Dinossauro
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dinossauroId;
    @NotEmpty
    private String dinossauroNome;
    @NotEmpty
    private Integer dinossauroIdade;
    @NotEmpty
    private Float dinossauroAltura;
    @NotEmpty
    private Float dinossauroComprimento;

    public Long getDinossauroId() {
        return dinossauroId;
    }

    public void setDinossauroId(Long dinossauroId) {
        this.dinossauroId = dinossauroId;
    }

    public String getDinossauroNome() {
        return dinossauroNome;
    }

    public void setDinossauroNome(String dinossauroNome) {
        this.dinossauroNome = dinossauroNome;
    }

    public Integer getDinossauroIdade() {
        return dinossauroIdade;
    }

    public void setDinossauroIdade(Integer dinossauroIdade) {
        this.dinossauroIdade = dinossauroIdade;
    }

    public Float getDinossauroAltura() {
        return dinossauroAltura;
    }

    public void setDinossauroAltura(Float dinossauroAltura) {
        this.dinossauroAltura = dinossauroAltura;
    }

    public Float getDinossauroComprimento() {
        return dinossauroComprimento;
    }

    public void setDinossauroComprimento(Float dinossauroComprimento) {
        this.dinossauroComprimento = dinossauroComprimento;
    }
}
