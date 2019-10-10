package com.example.jonathan.preubb;

public class Pregunta {
    private int IdPregunta;
    private String Enunciado;
    private String RespA;
    private String RespB;
    private String RespC;
    private String RespD;
    private int RespUser;
    private int RespCorrect;

    //Constructor

    public Pregunta(int idPregunta, String enunciado, String respA, String respB, String respC, String respD, int respUser, int respCorrect) {
        IdPregunta = idPregunta;
        Enunciado = enunciado;
        RespA = respA;
        RespB = respB;
        RespC = respC;
        RespD = respD;
        RespUser = respUser;
        RespCorrect = respCorrect;
    }

    //Getter y Setter

    public int getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        IdPregunta = idPregunta;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public String getRespA() {
        return RespA;
    }

    public void setRespA(String respA) {
        RespA = respA;
    }

    public String getRespB() {
        return RespB;
    }

    public void setRespB(String respB) {
        RespB = respB;
    }

    public String getRespC() {
        return RespC;
    }

    public void setRespC(String respC) {
        RespC = respC;
    }

    public String getRespD() {
        return RespD;
    }

    public void setRespD(String respD) {
        RespD = respD;
    }

    public int getRespUser() {
        return RespUser;
    }

    public void setRespUser(int respUser) {
        RespUser = respUser;
    }

    public int getRespCorrect() {
        return RespCorrect;
    }

    public void setRespCorrect(int respCorrect) {
        RespCorrect = respCorrect;
    }
}
