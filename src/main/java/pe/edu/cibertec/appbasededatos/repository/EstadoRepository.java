package pe.edu.cibertec.appbasededatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appbasededatos.model.bd.*;

//Repositorio: Opera directamente con la BBDD y permite hacer un CRUD
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
}
