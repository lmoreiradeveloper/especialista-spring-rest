package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Restaurante;

import java.util.List;


public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante porId(Long id);
	Restaurante adicionar(Restaurante cozinha);
	void remover(Restaurante cozinha);

}
