package com.f1.f1list.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="formula1_resultados")
public class ResultRaceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer posicion;
    @Column
    private Integer numero;
    @Column
    private String piloto;
    @Column
    private String auto;
    @Column
    private Integer vueltas;
    @Column
    private String tiempo;
    @Column
    private Integer pts;
    @Column
    private Integer year;
    @Column
    private String grandPrix;
    @Column
    private String detalle;
    @Column
    private String codigoConductor;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPosicion() {
        return posicion;
    }
    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getAuto() {
        return auto;
    }
    public void setAuto(String auto) {
        this.auto = auto;
    }
    public Integer getVueltas() {
        return vueltas;
    }
    public void setVueltas(Integer vueltas) {
        this.vueltas = vueltas;
    }
    public String getTiempo() {
        return tiempo;
    }
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    public Integer getPts() {
        return pts;
    }
    public void setPts(Integer pts) {
        this.pts = pts;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getGrandPrix() {
        return grandPrix;
    }
    public void setGrandPrix(String grandPrix) {
        this.grandPrix = grandPrix;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getCodigoConductor() {
        return codigoConductor;
    }
    public void setCodigoConductor(String codigoConductor) {
        this.codigoConductor = codigoConductor;
    }

    
}
