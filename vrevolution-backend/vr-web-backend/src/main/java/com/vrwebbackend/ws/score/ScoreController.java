package com.vrwebbackend.ws.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreController
{
    @Autowired
    ScoreService scoreService;

    @PostMapping("/api/v1/add-score")
    public ResponseEntity<String> addScore(@RequestBody ScoreRequest scoreRequest)
    {
        try
        {
            scoreService.addScore(scoreRequest);
            return ResponseEntity.ok("Score added successfully!");
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding score: " + e.getMessage());
        }
    }

    @GetMapping("/api/v1/user/{userId}")
    public List<ScoreDTO> getScoresByUserId(@PathVariable Long userId)
    {
        return scoreService.getScoresByUserId(userId);
    }
}
