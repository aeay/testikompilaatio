package fi.hh.ohjelmistoprojekti.testiprojekti.testikompilaatio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Answer {

	@Id
	@Column(name="answer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="answer_text")
	private String answertext;
	
	@Column(name="question_id")
	private Long questionid;
	
//	@ManyToOne
//	@JsonIgnore
//	@JoinColumn(name = "question_Id")
//	private Question question;
	

	/**
	 * 
	 */
	public Answer() {
	}
	
	/**
	 * @param id
	 * @param answertext
	 * @param questionid
	 */
	public Answer(Long id, String answertext, Long questionid) {
		super();
		this.id = id;
		this.answertext = answertext;
		this.questionid = questionid;
	}

	/**
	 * @param answertext
	 * @param questionid
	 */
	public Answer(String answertext, Long questionid) {
		super();
		this.answertext = answertext;
		this.questionid = questionid;
	}

//	/**
//	 * @return the id
//	 */
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}

	/**
	 * @return the answertext
	 */
	public String getAnswertext() {
		return answertext;
	}

	/**
	 * @param answertext the answertext to set
	 */
	public void setAnswertext(String answertext) {
		this.answertext = answertext;
	}

	/**
	 * @return the questionid
	 */
	public Long getQuestionid() {
		return questionid;
	}

	/**
	 * @param questionid the questionid to set
	 */
	public void setQuestionid(Long questionid) {
		this.questionid = questionid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answertext=" + answertext
				+ ", questionid=" + questionid + "]";
	}
	
}
