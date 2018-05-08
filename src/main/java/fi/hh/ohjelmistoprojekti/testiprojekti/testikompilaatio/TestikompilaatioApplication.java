package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Question;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.QuestionRepository;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Questionnaire;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.QuestionnaireRepository;

@SpringBootApplication
public class TestikompilaatioApplication {
	
	/**extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KompilaatioApplication.class); 
	}  This part is only used when doing a .war-package **/
	
	private static final Logger log = LoggerFactory.getLogger(TestikompilaatioApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestikompilaatioApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner questionDemo(QuestionRepository repository, QuestionnaireRepository crepository) {
		return (args) -> {
			log.info("save a couple of questions");
			crepository.save(new Questionnaire(1L, "Halo", "Koulun tarjoamat liikuntapalvelut"));
			crepository.save(new Questionnaire(2L, "TBA", "Opiskelijaruoka Haaga-Heliassa"));

			repository.save(new Question(1L, 1, "Sukupuoli", "Teksti",
					crepository.findByName("Halo").get(0)));
			repository.save(new Question(2L, 2,  "Monettako vuotta koulussa?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(3L, 3, "Kuinka usein ruokailet koulussa?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(4L, 4, "Mielipide ruoan laadusta?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(5L, 5, "Tulisiko tarjolla olla enemmän erityisruokavalio vaihtoehtoja?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(6L, 6, "Vastaako hinta laatua?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(7L, 7, "Onko hinnoittelu selkeä?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(8L, 8, "Ovatko ruokalan ajankohtaiset tiedotukset riittäviä?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(9L, 9, "Onko astioiden palautus alue toimiva?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(10L, 10, "Onko kouluruokalan henkilökunta ystävällistä?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(11L, 11, "Mikä on koulun ruokalistan lempparisi?", "Teksti", crepository.findByName("Halo").get(0)));
			repository.save(new Question(12L, 12, "Mikä on koulun ruokalistan inhokkisi?", "Teksti", crepository.findByName("Halo").get(0)));

			repository.save(new Question(13L, 1, "Oletko käyttänyt koulun tarjoamia liikuntapalveluja?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(14L, 2, "Tarjoaako koulu tarpeeksi liikuntapalveluja opiskelijoille?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(15L, 3, "Mitä liikuntapalveluja käytät?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(16L, 4, "Kuinka usein käytät koulun tarjoamia liikuntapalveluja?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(17L, 5, "Mitä koulu voisi tarjota, mistä voisit olla kiinnostunut?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(18L, 6, "Mitä mieltä olet palveluista?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(19L, 7, "Olisitko valmis maksamaan tietyistä palveluista?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(20L, 8, "Miten kehittäisit koulun tarjoamia liikuntapalveluja?", "Teksti", crepository.findByName("TBA").get(0)));
			repository.save(new Question(21L, 9, "Miten HH voisi mainostaa palveluita paremmin?", "Teksti", crepository.findByName("TBA").get(0)));

			log.info("fetch all questions");
			for (Question question : repository.findAll()) {
				log.info(question.toString());
			}
		}; 
	} */
}