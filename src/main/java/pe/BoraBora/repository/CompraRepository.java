package pe.BoraBora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.BoraBora.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer>{
	
	//--OBTENER LA LISTA DE COMPRAS SEGUN EL USER ID
    List<Compra> findComprasByUserId(Integer userId);
}