package sn.isi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Integer> {
}
