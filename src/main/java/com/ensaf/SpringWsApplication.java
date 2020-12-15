package com.ensaf;
import com.ensaf.exercices.EX1.Etudiant;
import com.ensaf.exercices.EX1.EtudiantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringWsApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringWsApplication.class, args);
	}


/*
 *  exercices : EX1 : Charger des etudiants dans la base de donnees
 */
	@Autowired
	private EtudiantsRepo etudiantsRepo;
	public void chargerEtudiants(){
		etudiantsRepo.save(new Etudiant(null,"mohamed","el hassak",14.5,14));
		etudiantsRepo.save(new Etudiant(null,"driss","aabour",13,14));
		etudiantsRepo.save(new Etudiant(null,"chaimae","ramdani",3.9,14));
	}
	//**************************************************************

	@Override
	public void run(String... args) throws Exception {

		chargerEtudiants();
	}
}
