package br.com.generation.AtividadeEncapsulamento;

public class TestaAtividade {

	//1) Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	public static void main(String[] args) {
		
		
		Atividade01  nomeCliente = new Atividade01 ();
		Atividade01  nomeCliente1 =new Atividade01 ();
		
		nomeCliente.setNome("Carlos");
        nomeCliente.setIdade (28);
        nomeCliente.setEndereco ("Rua: Henrique Muzzio, n 300");
        nomeCliente.setCpf("41122833658");
      
        nomeCliente1.setNome("Felipe");
        nomeCliente1.setIdade(33);
        nomeCliente1.setEndereco("Rua: Henrique Muzzio, n 300");
        nomeCliente1.setCpf("4552685225");
 
        System.out.println("Seu nome é " + nomeCliente.getNome() );
        System.out.println(" Sua idade é " + nomeCliente.getNome());
        System.out.println(" Seu endereço é  " + nomeCliente.getEndereco());
        System.out.println(" Seu cpf é " + nomeCliente.getCpf());
       
        System.out.println();    
        
        System.out.println("Seu nome é " + nomeCliente1.getNome());
        System.out.println(" Sua idade é  " + nomeCliente1.getNome());
        System.out.println(" Seu endereço é " + nomeCliente1.getEndereco());
        System.out.println(" Seu cpf é " + nomeCliente1.getCpf());
       
        
     

	}

}
