package com.api.dao;

import com.api.model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasDao extends JpaRepository<Ventas,Integer> {

}
