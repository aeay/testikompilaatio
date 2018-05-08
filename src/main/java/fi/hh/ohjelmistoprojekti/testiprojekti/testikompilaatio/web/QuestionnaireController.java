package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Question;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.QuestionRepository;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Choice;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.ChoiceRepository;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.Questionnaire;
import fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain.QuestionnaireRepository;

@Controller
public class QuestionnaireController {
	
	@Autowired
	private QuestionRepository qnrepository;
	
	@Autowired
	private ChoiceRepository crepository;
	
	@Autowired
	private QuestionnaireRepository qerepository;
	
	
	@RequestMapping(value="/questionnaires", method=RequestMethod.GET)
	public String questionnaireList(Model model){
		model.addAttribute("questionnaires", qerepository.findAll());
		return "questionnaires";
	}  
	
	
	@RequestMapping(value = "/newquestionnaire")
    public String addQuestionnaire(Model model){
    	model.addAttribute("questionnaire", new Questionnaire());
        return "newquestionnaire";
    }    
	
	 @RequestMapping(value= "/editquestionnaire/{id}", method=RequestMethod.GET)
	 	public String editQuestionnaire(@PathVariable("id") Long questionnaireId, Model model) {
		 	model.addAttribute("questionnaire", qerepository.findOne(questionnaireId));
		 	return "editquestionnaire";
	 }  
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String save(Questionnaire questionnaire, Model model){
	 	qerepository.save(questionnaire);
	 	return "redirect:questionnaires";
	 }   

}
