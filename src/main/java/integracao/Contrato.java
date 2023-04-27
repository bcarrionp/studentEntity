package integracao;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private int idade;
	public enum RegimeTrabalho {
		PARCIAL,
		INTEGRAL
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public List<Contrato.RegimeTrabalho> tipoDeRegime() {
		List<Contrato.RegimeTrabalho> listaRegimesDeTrabalho = new ArrayList<Contrato.RegimeTrabalho>();
		
		if(idade >= 16 && idade < 18) {
			listaRegimesDeTrabalho.add(Contrato.RegimeTrabalho.PARCIAL);
		}
		
		else {
			if(idade >= 18 && idade <= 55) {
				listaRegimesDeTrabalho.add(Contrato.RegimeTrabalho.PARCIAL);
				listaRegimesDeTrabalho.add(Contrato.RegimeTrabalho.INTEGRAL);
			}
		}
		return listaRegimesDeTrabalho;
	}
}
