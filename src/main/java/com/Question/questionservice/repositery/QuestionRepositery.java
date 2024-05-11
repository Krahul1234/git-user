package com.Question.questionservice.repositery;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Question.questionservice.dto.Question;

@Repository
public interface QuestionRepositery extends JpaRepository<Question,Long> {

	List<Question> findByQuizId(Long quizId);

}
