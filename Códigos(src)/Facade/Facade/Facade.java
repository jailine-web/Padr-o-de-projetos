package Facade;

import SubsistemaConta.Conta;
import subsistemaVerificaEmail.VerificaEmail;
import subsistemaVerificaSMS.VerificaCodigo;

public class Facade {
	 
	
	public void verificacoes(String codigo) {
		String senha = null;
		
		String verificaemail = new VerificaEmail().verificarEmail(codigo);
		String verificaCod = new VerificaCodigo().verificarCodigo(codigo);
		
		Conta.ProcessoCadastro(verificaemail, senha, verificaCod);
		
	}
	
	;
	

}
