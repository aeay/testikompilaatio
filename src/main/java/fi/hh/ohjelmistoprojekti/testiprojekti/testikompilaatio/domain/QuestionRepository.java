package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {

	//Used by QuestionController method questionListRestByQuestionnaire
	List<Question> findByQuestionnaireId(Long questionnaireId);

}
