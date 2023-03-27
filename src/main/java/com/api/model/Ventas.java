package com.truper.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idventa;

    @Column(name = "cliente")
    private String cliente;
    @Column(name = "Total")
    private Float total;

    @Column(name = "rfc",nullable = true)
    private String RFC;

    @JoinColumn(name = "idventa")
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<DetalleVenta> detventas;

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public List<DetalleVenta> getDetventas() {
        return detventas;
    }

    public void setDetventas(List<DetalleVenta> detventas) {
        this.detventas = detventas;
    }
}
