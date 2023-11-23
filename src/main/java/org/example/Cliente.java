package org.example;

public class Cliente {

    private String nome;
    private String estadoCheckIn;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getEstadoCheckIn() {
        return estadoCheckIn;
    }

    public void fazerCheckIn() {
        this.estadoCheckIn = "Check-in concluido";
    }

    public void cancelarCheckIn() {
        this.estadoCheckIn = "Check-in em aberto";
    }
}
