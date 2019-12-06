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
@Table(name = "personas")
//@NamedStoredProcedureQueries({
//    @NamedStoredProcedureQuery(
//            name = "spProductoSearch", procedureName = "spproductosearch", resultClasses = Producto.class
//            , parameters = { @StoredProcedureParameter(mode = ParameterMode.IN, name = "arg", type = String.class) }
//    )
//})
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    public String nombre;

    @NotBlank
    public String apellido;

    @NotBlank
    public String ciudad;

    @NotBlank
    public String curp;

    @NotBlank
    public String correo;

    // @Column(nullable = false, updatable = true)

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
