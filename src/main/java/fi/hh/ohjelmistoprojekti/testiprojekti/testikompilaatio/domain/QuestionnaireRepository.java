package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionnaireRepository extends CrudRepository <Questionnaire, Long> {
	
	List<Questionnaire>findByName(String name);
	
	List<Questionnaire>findById(Long id);

}
