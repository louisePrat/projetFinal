package com.mgestionProduit.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestionProduit.entites.Commande;
import com.mgestionProduit.services.ICommandeService;

@CrossOrigin
@RestController
public class CommandeController {
	
	@Autowired
	 ICommandeService commandeService;
	
	@GetMapping("/commandes")
	public List<Commande> findAll(){
		return commandeService.getCommandes();
	}
	
	@GetMapping("/commandes/{id}")
	public Commande findOne(@PathVariable("id") Long id) {
		return commandeService.getCommande(id);
		
	}
	
	@PostMapping("/commandes")
	public Commande saveOrUpdate(@RequestBody Commande commande) {
		return commandeService.saveCommade(commande);
	}
	
	@DeleteMapping("/commandes/{id}")
	public void deleteOneByID(@PathVariable("id") Long id) {
		commandeService.deleteCommande(id);
	}
	


}