package com.api.controller;

import com.api.logic.DetalleVentaService;
import com.api.logic.VentasService;
import com.api.model.RequestVenta;
import com.api.model.Response;
import com.api.model.ResponseVenta;
import com.api.model.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class VentasController {

    @Autowired
    private VentasService ventasService;

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping(value = "/status",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> status(){
        Response respuesta = new Response();
        respuesta.setFolio(UUID.randomUUID().toString());
        respuesta.setMensaje("API - OK");
        respuesta.setEstatus(1);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping(value = "/ventas",produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Object> getVentas(){
        List<Ventas> ventas = ventasService.getVentaS();
        return new ResponseEntity<>( ventas , HttpStatus.OK);
    }

    @PostMapping(value = "/registrarventa", produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseBody
    public ResponseEntity<Response> setVentas(@RequestBody RequestVenta venta){
        Response response = detalleVentaService.addVenta(venta);
        return new ResponseEntity<Response>( response , HttpStatus.OK);
    }

}
