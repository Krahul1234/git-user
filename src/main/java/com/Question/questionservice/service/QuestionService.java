package com.Question.questionservice.service;

import java.util.List;

import com.Question.questionservice.dto.Question;

public interface QuestionService {

	 Question add(Question question);
	 
	 List<Question> get();
	 
	 Question getone(Long questionId);
	 
	 List<Question> getQuestionofQuiz(Long quizId);
	 
}
