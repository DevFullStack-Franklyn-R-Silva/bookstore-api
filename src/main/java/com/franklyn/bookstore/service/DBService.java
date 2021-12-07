package com.franklyn.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franklyn.bookstore.domain.Categoria;
import com.franklyn.bookstore.domain.Livro;
import com.franklyn.bookstore.repositories.CategoriaRepository;
import com.franklyn.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Terror", "Livro de Terror");
		Categoria cat3 = new Categoria(null, "Ficção científica", "Livro de Ficção científica");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "It - A Coisa", "Stephen King",
				"It é um romance de terror de 1986 do autor estadunidense Stephen King.", cat1);
		Livro l3 = new Livro(null, "Jogador Nº 1", "Ernest Cline",
				"Ready Player One foi o primeiro livro escrito por Ernest Cline.", cat1);
		Livro l4 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem ipsum", cat1);
		Livro l5 = new Livro(null, "Percy Jackson e os Olimpianos", "Rick Riordan",
				"Percy Jackson & the Olympians é uma série literária composta por cinco livros de aventura, romance, suspense e fantasia, escritos pelo estadunidense Rick Riordan, que retrata a mitologia grega no século XXI.",
				cat1);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat1.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
