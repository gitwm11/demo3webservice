package ma.emsi.demo3webservice.dao.repositories;

import ma.emsi.demo3webservice.dao.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Integer> {
    public Compte findByCode(Integer code);
}
