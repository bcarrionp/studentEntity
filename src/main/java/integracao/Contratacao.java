package integracao;

//import java.util.List;

public class Contratacao {
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/*
	public static String verificaContratacao(int idade) {
        if (idade < 16) {
            return "Não é possível contratar pessoas com idade inferior a 16 anos.";
        } else if (idade >= 16 && idade <= 18) {
            return "Contratação em tempo parcial permitida.";
        } else if (idade > 18 && idade <= 55) {
            return "Contratação em período integral permitida.";
        } else {
            return "Não é possível contratar pessoas com idade superior a 55 anos.";
        }
    }
	*/
	
	/*
	public boolean Contrato() {
		if (idade < 16) {
			return false;
		}
		else if (idade >= 16 && idade <=18) {
			return true;
		}
		else if (idade > 18 && idade <= 55) {
			return true;
		}
		else {
			return false;
		}
	}
	*/
	
	
	/*
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
	*/
}
