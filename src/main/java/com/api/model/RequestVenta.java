package com.truper.model;

public class RequestVenta {

    private String cliente;
    private String rfc;
    private DetalleVenta[] productos;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public DetalleVenta[] getProductos() {
        return productos;
    }

    public void setProductos(DetalleVenta[] productos) {
        this.productos = productos;
    }
}
