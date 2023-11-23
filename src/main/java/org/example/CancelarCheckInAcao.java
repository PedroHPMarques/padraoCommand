package org.example;

public class CancelarCheckInAcao implements Acao {

    private Cliente cliente;

    public CancelarCheckInAcao(Cliente cliente) {
        this.cliente = cliente;
    }

    public void executar() {
        this.cliente.cancelarCheckIn();
    }

    public void cancelar() {
        this.cliente.fazerCheckIn();
    }
}