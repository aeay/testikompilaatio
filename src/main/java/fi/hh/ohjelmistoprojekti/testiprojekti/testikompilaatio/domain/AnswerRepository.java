/**
 * 
 */
package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author
 *
 */
public interface AnswerRepository extends CrudRepository<Answer, Long>{
	
	List<Answer> findByQuestionid(Long questionid);
	
}
