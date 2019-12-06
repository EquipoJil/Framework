package com.example.demo.repository;


import com.example.demo.model.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelefonoRepository extends JpaRepository<Telefono, Long> {
//    @Procedure(procedureName = "spProductoSearch")
//    List<Producto> spproductosearch(String arg);
//    @Query(value = "SELECT p.* FROM Producto p where p.nombre like %?1%", nativeQuery = true)
//    List<Producto> findByName(String nombre);
}
