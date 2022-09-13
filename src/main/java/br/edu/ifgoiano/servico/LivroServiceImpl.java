package br.edu.ifgoiano.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.repositorio.LivroRepositorio;




@Service
public class LivroServiceImpl implements LivroService{
	
	static List<Livro> livros = new ArrayList<Livro>();
	
	@Autowired
	private LivroRepositorio livroRepository;
	
		
	public List<Livro> listarLivros(){
		return livroRepository.findAll();
	}

}
