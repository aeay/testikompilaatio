package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.repository.CrudRepository;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Choice {
	
	@Id
	@Column(name="choice_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String choice;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "question_Id")
	private Question question;
	
	/**
	 * 
	 */
	public Choice() {

	}

	/**
	 * @param id
	 * @param choice_text
	 * @param question
	 */
	public Choice(Long id, String choice, Question question) {
		super();
		this.id = id;
		this.choice = choice;
		this.question = question;
	}

	/**
	 * @param choice_text
	 * @param question
	 */
	public Choice(String choice, Question question) {
		super();
		this.choice = choice;
		this.question = question;
	}

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
	 * @return the choice_text
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * @param choice_text the choice_text to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Choice [id=" + id + ", choice=" + choice + ", question="
				+ question + "]"; 
		}	

}
