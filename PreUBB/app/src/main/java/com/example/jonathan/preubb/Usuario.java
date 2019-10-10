package com.example.jonathan.preubb;

public class Usuario {
    private String RutUsuario;
    private String PassUsuario;
    private String NombreUsuario;
    private String EmailUsuario;
    private int TelefonoUsuario;

    public Usuario(String rutUsuario, String passUsuario, String nombreUsuario, String emailUsuario, int telefonoUsuario) {
        RutUsuario = rutUsuario;
        PassUsuario = passUsuario;
        NombreUsuario = nombreUsuario;
        EmailUsuario = emailUsuario;
        TelefonoUsuario = telefonoUsuario;
    }

    public String getRutUsuario() {
        return RutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        RutUsuario = rutUsuario;
    }

    public String getPassUsuario() {
        return PassUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        PassUsuario = passUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return EmailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        EmailUsuario = emailUsuario;
    }

    public int getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        TelefonoUsuario = telefonoUsuario;
    }
}
