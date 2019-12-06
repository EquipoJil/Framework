package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by Armando on 28/07/18.
 */
@Entity
@Table(name = "telefonos")
//@NamedStoredProcedureQueries({
//    @NamedStoredProcedureQuery(
//            name = "spProductoSearch", procedureName = "spproductosearch", resultClasses = Producto.class
//            , parameters = { @StoredProcedureParameter(mode = ParameterMode.IN, name = "arg", type = String.class) }
//    )
//})
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    public String marca;

    @NotBlank
    public String modelo;

    @NotBlank
    public String descripcion;

    @NotBlank
    public String precio;

/*
    public Producto(){

    }
    public Producto(long id, String nombre, String descripcion, Date fecha){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.createdAt = fecha;
    }
*/
    // @Column(nullable = false)
    // @Temporal(TemporalType.TIMESTAMP)
    // @LastModifiedDate
    // private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo= modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
