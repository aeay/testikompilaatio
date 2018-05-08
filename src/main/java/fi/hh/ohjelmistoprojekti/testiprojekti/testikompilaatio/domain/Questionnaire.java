package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Questionnaire {

	@Id
	@Column(name = "questionnaire_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	@Column(name = "group_name")
	private String name;
	@Column(name = "questionnaire_name")
	private String questionnairename;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "questionnaire")
	private List<Question> questions;

	public Questionnaire() {
	}

	public Questionnaire(Long id, String name, String questionnairename) {
		super();
		this.id = id;
		this.name = name;
		this.questionnairename = questionnairename;
	}
	
	public Questionnaire(Long id, String name, String questionnairename, List<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.questionnairename = questionnairename;
		this.questions = questions;
	}

	public Questionnaire(String name, String questionnairename, List<Question> questions) {
		super();
		this.name = name;
		this.questionnairename = questionnairename;
		this.questions = questions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestionnairename() {
		return questionnairename;
	}

	public void setQuestionnairename(String questionnairename) {
		this.questionnairename = questionnairename;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	//If there's problems merging, don't recreate toString automatically, because questions-list must not be included to avoid endless looping
	@Override
	public String toString() {
		return "Questionnaire [id=" + id + ", name=" + name + ", questionnairename=" + questionnairename
				+ "]";
	}

}