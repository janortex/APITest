package com.truper.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "detalleventa")
public class DetalleVenta {

    @Id
    @Column(name = "idproducto")
    private Integer idproducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precioventa")
    private Float precioventa;

    @Column(name = "idventa")
    private Integer idventa;

    /*
    @JoinColumn(name = "idventa")
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Ventas venta;*/


    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Float precioventa) {
        this.precioventa = precioventa;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }
}
