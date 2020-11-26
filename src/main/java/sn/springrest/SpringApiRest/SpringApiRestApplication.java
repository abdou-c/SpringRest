package sn.springrest.SpringApiRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.springrest.dao.IPharmacie;
import sn.springrest.entities.Pharmacie;

@SpringBootApplication
public class SpringApiRestApplication implements CommandLineRunner{


	private static IPharmacie pharmaciedao = null;
	public SpringApiRestApplication() {
		this(pharmaciedao);
	}

	public SpringApiRestApplication(IPharmacie pharmaciedao) {
		SpringApiRestApplication.pharmaciedao = pharmaciedao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApiRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pharmacie pharmacie = new Pharmacie();
		pharmacie.setId(1);
		pharmacie.setNom("Darabis");
		pharmacie.setQuartier("Sicap");
		pharmacie.setVille("Dakar");
		pharmacie.setEtat(1);

		pharmaciedao.save(pharmacie);
		pharmaciedao.findAll().forEach(c -> System.out.println(c.getVille()));
	}
}
