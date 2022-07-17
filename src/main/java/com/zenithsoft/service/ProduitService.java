package com.zenithsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenithsoft.model.Produit;
import com.zenithsoft.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	public Iterable<Produit> findAllProduits() {
		return produitRepository.findAll();
	}
	
	public Produit findProduitById(Long id) {
		return produitRepository.findById(id).get();
	}
	
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}
}
