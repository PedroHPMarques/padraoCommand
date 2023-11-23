package org.example;

public class FazerCheckInAcao implements Acao {

    private Cliente cliente;

    public FazerCheckInAcao(Cliente cliente) {
        this.cliente = cliente;
    }

    public void executar() {
        this.cliente.fazerCheckIn();
    }

    public void cancelar() {
        this.cliente.cancelarCheckIn();
    }
}