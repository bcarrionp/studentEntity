package integracao;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;

public class ContratoTest {
	
	Contrato contrato;
	
	@Test
    public void naoDeveContratarAbaixoDe16OuAcimaDe55() {
        Contrato contrato = new Contrato();
        contrato.setIdade(55);
        List<Contrato.RegimeTrabalho> regimes = contrato.tipoDeRegime();
        assertFalse(regimes.isEmpty());
    }

}
