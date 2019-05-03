package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		
		pf.setCpf(3252555);
		pf.setEndereco("Rua Sonho Gaucho");
		pf.setNome("Nícolas de Moraes Bonifacio");
		pf.setCep(123456);
		pf.setBairro("Itaquera");
		pf.setCidade("São Paulo");
		pf.setEstado("São Paulo");
		
		PessoaJuridica pj = new PessoaJuridica ();
		
		pj.setCnpj(7637643);
		pj.setEndereco("Rua Romano");
		pj.setNome("Gabrielle Coutinho");
		pj.setCep(456789);
		pj.setBairro("Itaquera");
		pj.setCidade("São Paulo");
		pj.setEstado("São Paulo");
		
		
		System.out.println(pf.getCpf());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getNome());
		System.out.println(pf.getBairro());
		System.out.println(pf.getCidade());
		System.out.println(pf.getEstado());
		
		
		
	}

}
