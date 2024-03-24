package com.vrwebbackend.ws.score;

import com.vrwebbackend.ws.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScoreService
{
    private final ScoreRepository scoreRepository;
    private final UserService userService;

    @Autowired
    public ScoreService(ScoreRepository scoreRepository, UserService userService)
    {
        this.scoreRepository = scoreRepository;
        this.userService = userService;
    }

    public void addScore(ScoreRequest scoreRequest)
    {
        if (scoreRepository.findByUserIdAndGradeAndTestNumber(scoreRequest.getUserId(), scoreRequest.getGrade(), scoreRequest.getTestNumber()) == null)
        {
            Score score = new Score();
            score.setUser(userService.findById(scoreRequest.getUserId()).orElse(null));
            score.setScore(scoreRequest.getScore());
            score.setGrade(scoreRequest.getGrade());
            score.setTestNumber(scoreRequest.getTestNumber());
            scoreRepository.save(score);
        }
    }

    public List<ScoreDTO> getScoresByUserId(Long userId)
    {
        List<Score> scores = scoreRepository.findByUser_Id(userId);
        return scores.stream()
                .map(score -> new ScoreDTO(score.getGrade(), score.getTestNumber(), score.getScore()))
                .collect(Collectors.toList());
    }
}
