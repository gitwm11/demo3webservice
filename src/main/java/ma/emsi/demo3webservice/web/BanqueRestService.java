package ma.emsi.demo3webservice.web;

import ma.emsi.demo3webservice.dao.entities.Compte;
import ma.emsi.demo3webservice.dao.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BanqueRestService {
    @Autowired
    CompteRepository compteRepository;

    @GetMapping("convert/{montant}")
    public double conversion(@PathVariable double montant) {
        return montant * 10.13;
    }

    @GetMapping("compte/{code}") public Compte getCompte(@PathVariable Integer code) {
        return   compteRepository.findByCode(code);
    }

    @GetMapping("comptes") public List<Compte> listComptes(){
    return compteRepository.findAll();
    }

    @PostMapping("comptes")
    public Compte addAccount(@RequestBody Compte compte ){
        return compteRepository.save(compte);
    }


}
