package com.adaming.clientui.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



public class CommandeBean {

	private Long idCommande;
	
	private Date dateAchat;

	private float prix;
	

	@ManyToOne
	private LivraisonBean livraison;
	
	@OneToMany(mappedBy = "commande")
	private List<ProduitBean> produits=new ArrayList<>();
	
	public CommandeBean() {}
	
	

	

	public CommandeBean(Long idCommande, Date dateAchat, float prix, LivraisonBean livraison, List<ProduitBean> produits) {
		super();
		this.idCommande = idCommande;
		this.dateAchat = dateAchat;
		this.prix = prix;
		this.livraison = livraison;
		this.produits = produits;
	}



	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}



	public LivraisonBean getLivraison() {
		return livraison;
	}





	public void setLivraison(LivraisonBean livraison) {
		this.livraison = livraison;
	}


	public List<ProduitBean> getProduits() {
		return produits;
	}

	public void setProduits(List<ProduitBean> produits) {
		this.produits = produits;
	}





	@Override
	public String toString() {
		return "CommandeBean [idCommande=" + idCommande + ", dateAchat=" + dateAchat + ", prix=" + prix + ", livraison="
				+ livraison + ", produits=" + produits + "]";
	}







	


}