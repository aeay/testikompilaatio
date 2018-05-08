/**
 * 
 */
package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Answer;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.AnswerRepository;

/**
 * @author 
 *
 */
@Controller
@EnableAutoConfiguration
public class AnswerController {
	
	@Autowired
	private AnswerRepository repository;	
	
/*	// Save new answers
    @RequestMapping(value = "/questionnaires/{questionnaire_id}/answers", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody List<Answer> addNewAnswerList(@RequestBody List<Answer> answers){
    	ArrayList<Answer> savedAnswers = new ArrayList<Answer>();
    	for (int i=0;i<answers.size();i++){
    		repository.save(answers.get(i));
    		savedAnswers.add(answers.get(i));
		}
    	return savedAnswers;
    } */
	
	// Save new answers
    @RequestMapping(value = "/questionnaires/{questionnaire_id}/answers", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody void addNewAnswerList(@RequestBody List<Answer> answers){
    	
    	for (int i=0;i<answers.size();i++){
    		repository.save(answers.get(i));
		}
    }  
	
	// Save new answer
    @RequestMapping(value = "/questions/{id}/answer", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody Answer addNewAnswer(@RequestBody Answer answer){    	
        repository.save(answer);
        return answer;
    }

}
