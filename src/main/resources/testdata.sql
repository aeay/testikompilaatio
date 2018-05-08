INSERT INTO questionnaire (questionnaire_id, group_name, questionnaire_name)
VALUES (1, 'Halo', 'Koulun tarjoamat liikuntapalvelut');
INSERT INTO questionnaire (questionnaire_id, group_name, questionnaire_name)
VALUES (2, 'TBA', 'Opiskelijaruoka Haaga-Heliassa');


INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(1, 1, 'Sukupuoli', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(2, 2,  'Monettako vuotta koulussa?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(3, 3, 'Kuinka usein ruokailet koulussa?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(4, 4, 'Mielipide ruoan laadusta?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(5, 5, 'Tulisiko tarjolla olla enemmän erityisruokavalio vaihtoehtoja?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(6, 6, 'Vastaako hinta laatua?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(7, 7, 'Onko hinnoittelu selkeä?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(8, 8, 'Ovatko ruokalan ajankohtaiset tiedotukset riittäviä? ', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(9, 9, 'Onko astioiden palautus alue toimiva?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(10, 10, 'Onko kouluruokalan henkilökunta ystävällistä?', 'radio', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(11, 11, 'Mikä on koulun ruokalistan lempparisi?', 'Teksti', 2);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(12, 12, 'Mikä on koulun ruokalistan inhokkisi?', 'Teksti', 2);

INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(13, 1, 'Sukupuoli', 'radio', 1);
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(14, 2, 'Oletko käyttänyt koulun tarjoamia liikuntapalveluja?', 'radio', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(15, 4, 'Tarjoaako koulu tarpeeksi liikuntapalveluja opiskelijoille?', 'radio', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(16, 5, 'Mitä liikuntapalveluja käytät?', 'Teksti', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(17, 6, 'Kuinka usein käytät koulun tarjoamia liikuntapalveluja?', 'radio', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(18, 7, 'Mitä koulu voisi tarjota, mistä voisit olla kiinnostunut?', 'Teksti', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(19, 8, 'Mitä mieltä olet palveluista?', 'Teksti', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(20, 9, 'Olisitko valmis maksamaan tietyistä palveluista?', 'radio', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(21, 10, 'Miten kehittäisit koulun tarjoamia liikuntapalveluja?', 'Teksti', 1 );
INSERT INTO question (question_id, rownumber, question, answer_type, questionnaire_id) VALUES
(22, 11, 'Miten HH voisi mainostaa palveluita paremmin?', 'Teksti', 1 );

INSERT INTO choice (choice_id, choice, question_id) VALUES
(1, "nainen", 1);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(2, "mies", 1);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(3, "En halua vastata", 1);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(4, "1", 2);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(5, "2", 2);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(6, "3", 2);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(7, "4", 2);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(8, "Ikuinen opiskelija", 2);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(9, "Päivittäin", 3);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(10, "Muutaman kerran viikossa", 3);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(11, "Harvemmin", 3);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(12, "En koskaan", 3);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(13, "huono 1", 4);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(14, "2", 4);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(15, "3", 4);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(16, "4", 4);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(17, "5 hyvä", 4);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(18, "Kyllä", 5);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(19, "Ei", 5);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(20, "En osaa vastata", 5);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(21, "Ei vastaa 1", 6);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(22, "2", 6);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(23, "3", 6);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(24, "4", 6);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(25, "5 hyvä", 6);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(26, "Kyllä", 7);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(27, "Ei", 7);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(28, "En osaa sanoa", 7);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(29, "Kyllä", 8);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(30, "Ei", 8);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(31, "En osaa sanoa", 8);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(32, "Kyllä", 9);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(33, "Ei", 9);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(34, "En osaa sanoa", 9);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(35, "Epäystävällistä 1", 10);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(36, "2", 10);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(37, "3", 10);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(38, "4", 10);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(39, "5 Ystävällistä", 10);

INSERT INTO choice (choice_id, choice, question_id) VALUES
(40, "nainen", 13);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(41, "mies", 13);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(42, "Kyllä", 14);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(43, "En", 14);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(44, "Kyllä", 15);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(45, "Ei", 15);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(46, "En lainkaan", 17);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(47, "1-2 krt/vko", 17);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(48, "3-5 krt/vko", 17);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(49, "yli 5 krt/vko", 17);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(50, "Kyllä", 20);
INSERT INTO choice (choice_id, choice, question_id) VALUES
(51, "En", 20);

