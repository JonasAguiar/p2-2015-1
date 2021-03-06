import java.util.HashSet;
import java.util.Iterator;


public class PessoasDuplicadas {
	
	public static void main(String[] args) {
		
		HashSet<Pessoa> pessoasDistintas = new HashSet<Pessoa>();
		HashSet<Pessoa> pessoasDuplicadas = new HashSet<Pessoa>();
		
		for (int i = 0; i < args.length; i++) {
			Pessoa pessoa = new Pessoa(args[i]);
			
			if (!pessoasDistintas.add(pessoa)) {
				pessoasDuplicadas.add(pessoa);
			}				
		}
		pessoasDistintas.removeAll(pessoasDuplicadas);
		
		System.out.println(pessoasDistintas);
		System.out.println(pessoasDuplicadas);
		
		for (Pessoa pessoa : pessoasDistintas) {
			System.out.println("Nome: " + pessoa.getNome());
		}
		
		Iterator<Pessoa> iterator = pessoasDistintas.iterator();
		while (iterator.hasNext()){
			System.out.println("Nome: " + iterator.next().getNome());
		}
		
		
		
		
		
		
	}

}
