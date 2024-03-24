package com.vrwebbackend.ws.score;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score,Long>
{
    List<Score> findByUser_Id(Long userId);

    Score findByUserIdAndGradeAndTestNumber(long userId, String grade, String testNumber);
}
