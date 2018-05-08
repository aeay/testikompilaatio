package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import org.springframework.web.bind.annotation.ResponseStatus;

import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Answer;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.AnswerRepository;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Question;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.QuestionRepository;

@Controller
@EnableAutoConfiguration
public class QuestionController {

	@Autowired
	private QuestionRepository repository;
	
	@Autowired
	private AnswerRepository ansrepository;

	// RESTful service to get all questions returns a list of questions
	// Note, we are using Spring Boot 1.x as defined by teacher, do methods
	// accordingly
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}

	// RESTful service to get one question by id
	@RequestMapping(value = "/questions/{id}", method = RequestMethod.GET)
	public @ResponseBody Question findQuestionRest(@PathVariable("id") Long questionId) {
		return repository.findOne(questionId);
	}

	// RESTful service to get all questions by questionnaire returns a list of questions
	@RequestMapping(value = "/questionnaires/{questionnaireid}/questions", method = RequestMethod.GET)
	public @ResponseBody List<Question> questionListRestByQuestionnaire(@PathVariable("questionnaireid") Long questionnaireId) {
		return repository.findByQuestionnaireId(questionnaireId);
	}
	
	 @RequestMapping(value= "/proto/restapi", method=RequestMethod.GET)
		public String REST_API(){
			return "proto.restapi";
		}
	 
	 @RequestMapping(value= "/restapi", method=RequestMethod.GET)
		public String h_REST_API(){
			return "restapi";
		}
	// RESTful service to get all answers by question returns a list of answers
	@RequestMapping(value = "/questions/{id}/answers", method = RequestMethod.GET)
	public @ResponseBody List<Answer> answerListRestByQuestion(@PathVariable("id") Long questionid) {
		return ansrepository.findByQuestionid(questionid);
	}
	
	// Save new answer
    @RequestMapping(value = "/questionnaires/{questionnaireid}/questionsave", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody Question addNewAnswer(@RequestBody Question question){    	
        repository.save(question);
        return question;
    }
    
}
