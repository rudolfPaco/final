package com.modulo.accidentes.model;

import com.modulo.accidentes.dto.EquipoDto;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "equipo")
public class Equipo extends ModelBase implements Serializable {


    private String nombre;
    private String categoria;
    private Date fechaAdquisicion;
    private int cantidad;
    private String estado;
    @Lob
    private Byte[] image;


    @OneToMany(mappedBy = "equipoD", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dotacion> dotaciones = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Dotacion> getDotaciones() {
        return dotaciones;
    }

    public void setDotaciones(List<Dotacion> dotaciones) {
        this.dotaciones = dotaciones;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public ModelBase toDomain(EquipoDto element, ModelMapper mapper) {
        return super.toDomain(element, mapper);
    }
}
