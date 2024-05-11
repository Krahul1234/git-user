package com.Question.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.questionservice.dto.Question;
import com.Question.questionservice.service.QuestionService;
import com.Question.questionservice.service.QuestionServiceImpl;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	 private QuestionService questionService;
	
	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}

	//create
	@PostMapping
	public Question creQuestion(@RequestBody Question question) {
		return questionService.add(question);
		
    }
	@GetMapping
	public List<Question> getQuestion() {
		return questionService.get();
		
	}
	@GetMapping("/{questionId}")
	public Question getbyId(@PathVariable Long questionId) {
		return questionService.getone(questionId);
		
	}
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQustionofquiz(@PathVariable Long quizId){
		return questionService.getQuestionofQuiz(quizId);
	}

}
