	CREATE TABLE IF NOT EXISTS questionnaire (
	questionnaire_id int NOT NULL PRIMARY KEY,
	group_name varchar(50),
	questionnaire_name varchar(50)
	);

	CREATE TABLE IF NOT EXISTS question (
	question_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	rownumber int,
	question varchar(500),
	answer_type varchar(20),
	questionnaire_id int NOT NULL,
	CONSTRAINT FOREIGN KEY (questionnaire_id) REFERENCES questionnaire (questionnaire_id)
	);
	
	CREATE TABLE IF NOT EXISTS answer (
	answer_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	answer_text varchar(500),
	question_id int NOT NULL,
	CONSTRAINT FOREIGN KEY (question_id) REFERENCES question (question_id)
	);
	
	CREATE TABLE IF NOT EXISTS choice (
	choice_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	choice varchar(500),
	question_id int NOT NULL,
	CONSTRAINT FOREIGN KEY (question_id) REFERENCES question (question_id)
	);