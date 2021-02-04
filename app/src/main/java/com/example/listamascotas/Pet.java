package com.example.listamascotas;

public class Pet {
    private int imagen;
    private String nombre;
    private int favorito;

    public Pet(int imagen, String nombre, int favorito) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.favorito = favorito;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }
}
