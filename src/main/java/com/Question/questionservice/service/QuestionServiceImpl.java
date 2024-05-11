package com.Question.questionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Question.questionservice.dto.Question;
import com.Question.questionservice.repositery.QuestionRepositery;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionRepositery questionRepositery;

	public QuestionServiceImpl(QuestionRepositery questionRepositery) {
		super();
		this.questionRepositery = questionRepositery;
	}

	@Override
	public Question add(Question question) {
		return questionRepositery.save(question);
	}

	@Override
	public List<Question> get() {
		return questionRepositery.findAll();
	}
	@Override
	public Question getone(Long questionId) {
		return questionRepositery.findById(questionId).orElseThrow(() -> new RuntimeException("question id is not found"));
	}

	@Override
	public List<Question> getQuestionofQuiz(Long quizId) {
		return questionRepositery.findByQuizId(quizId);
	}

}
