package com.mgestionProduit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgestionProduit.entites.*;;

@Repository
public interface ILivraisonRepository extends JpaRepository<Livraison, Long> {

}
