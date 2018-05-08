package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {

	@Id
	@Column(name="question_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int rownumber;
	private String question;
	
	@Column(name="answer_type")
	private String answertype;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "questionnaire_id")
	private Questionnaire questionnaire;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Choice> choices;
		
/*	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Answer> answers;*/
	
/*	@Column(name="answer_id")
	private Long answerid;*/

	public Question() {
	}

	public Question(Long id, int rownumber, String question, String answertype, Questionnaire questionnaire) {
		super();
		this.id = id;
		this.rownumber = rownumber;
		this.question = question;
		this.answertype = answertype;
		this.questionnaire = questionnaire;
	}

	public Question(int rownumber, String question, String answertype, Questionnaire questionnaire) {
		super();
		this.rownumber = rownumber;
		this.question = question;
		this.answertype = answertype;
		this.questionnaire = questionnaire;
	}	

/*	*//**
	 * @param rownumber
	 * @param question
	 * @param answertype
	 * @param questionnaire
	 * @param answers
	 *//*
	public Question(int rownumber, String question, String answertype,
			Questionnaire questionnaire, List<Answer> answers) {
		super();
		this.rownumber = rownumber;
		this.question = question;
		this.answertype = answertype;
		this.questionnaire = questionnaire;
		this.answers = answers;
	}*/
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the rownumber
	 */
	public int getRownumber() {
		return rownumber;
	}


	/**
	 * @param rownumber the rownumber to set
	 */
	public void setRownumber(int rownumber) {
		this.rownumber = rownumber;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answertype
	 */
	public String getAnswertype() {
		return answertype;
	}

	/**
	 * @param answertype the answertype to set
	 */
	public void setAnswertype(String answertype) {
		this.answertype = answertype;
	}

	/**
	 * @return the questionnaire
	 */
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * @param questionnaire the questionnaire to set
	 */
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
	/**
	 * @return the choices
	 */
	public List<Choice> getChoices() {
		return choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	/*	*//**
	 * @return the answers
	 *//*
	public List<Answer> getAnswers() {
		return answers;
	}

	*//**
	 * @param answers the answers to set
	 *//*
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}*/

/*	@Override
	public String toString() {
		if (this.questionnaire != null)
			return "Question [id=" + id + ", rownumber=" + rownumber + ", question=" + question + ", answertype=" + answertype +", questionnaire="
					+ this.getQuestionnaire() + "]";
		else
			return "Question [id=" + id + ", rownumber=" + rownumber + ", question=" + question + ", answertype=" + answertype +"]";
	}*/
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
/*	@Override
	public String toString() {
		if (this.questionnaire != null)
			return "Question [id=" + id + ", rownumber=" + rownumber
				+ ", question=" + question + ", answertype=" + answertype
				+ ", questionnaire=" + this.getQuestionnaire() + ", answerid=" + answerid
				+ "]";
		else 
			return "Question [id=" + id + ", rownumber=" + rownumber
					+ ", question=" + question + ", answertype=" + answertype
					+ ", answerid=" + answerid
					+ "]";
	}*/
	
	@Override
	public String toString() {
		if (this.questionnaire != null)
			return "Question [id=" + id + ", rownumber=" + rownumber
				+ ", question=" + question + ", answertype=" + answertype
				+ ", questionnaire=" + this.getQuestionnaire()
				+ ", choices=" + choices
				+ "]";
		else 
			return "Question [id=" + id + ", rownumber=" + rownumber
					+ ", question=" + question + ", answertype=" + answertype
					+ ", choices=" + choices
					+ "]";
	}
	
	

}
