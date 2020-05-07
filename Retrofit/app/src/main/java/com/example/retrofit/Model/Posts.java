package com.example.retrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
public class Posts {
    @SerializedName("CP")
    @Expose
    private String cP;
    @SerializedName("Categoria")
    @Expose
    private String categoria;
    @SerializedName("Direccion")
    @Expose
    private String direccion;
    @SerializedName("FechaRegistro")
    @Expose
    private String fechaRegistro;
    @SerializedName("Nombre")
    @Expose
    private String nombre;
    @SerializedName("Telefono")
    @Expose
    private String telefono;
    @SerializedName("ciudad")
    @Expose
    private String ciudad;
    @SerializedName("coordenadas")
    @Expose
    private String coordenadas;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("idRestaurante")
    @Expose
    private String idRestaurante;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("pais")
    @Expose
    private String pais;
    @SerializedName("rfc")
    @Expose
    private String rfc;

    public String getCP() {
        return cP;
    }

    public void setCP(String cP) {
        this.cP = cP;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}