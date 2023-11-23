package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtendimentoTest {

    Atendimento atendimento;
    Cliente cliente;

    @BeforeEach
    void setUp() {
        atendimento = new Atendimento();
        cliente = new Cliente ("Pedro");
    }

    @Test
    void deveFazerCheckIn() {
        Acao fazerCheckIn = new FazerCheckInAcao(cliente);
        atendimento.executarAcao(fazerCheckIn);

        assertEquals("Check-in concluido", cliente.getEstadoCheckIn());
    }

    @Test
    void deveCancelarCheckIn() {
        Acao cancelarCheckIn = new CancelarCheckInAcao(cliente);
        atendimento.executarAcao(cancelarCheckIn);

        assertEquals("Check-in em aberto", cliente.getEstadoCheckIn());
    }

    @Test
    void deveDesfazerCancelamentoCheckIn() {
        Acao fazerCheckIn = new FazerCheckInAcao(cliente);
        Acao cancelarCheckIn = new CancelarCheckInAcao(cliente);

        atendimento.executarAcao(fazerCheckIn);
        atendimento.executarAcao(cancelarCheckIn);

        atendimento.cancelarUltimaAcao();

        assertEquals("Check-in concluido", cliente.getEstadoCheckIn());
    }

}