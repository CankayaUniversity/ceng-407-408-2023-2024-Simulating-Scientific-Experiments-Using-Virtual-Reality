package com.vrwebbackend.ws.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @GetMapping("/test1grade5")
    public ResponseEntity<Object> getTest1Grade5()
    {
        return questionService.getTest1Grade5();
    }

    @GetMapping("/test2grade5")
    public ResponseEntity<Object> getTest2Grade5()
    {
        return questionService.getTest2Grade5();
    }

    @GetMapping("/test3grade5")
    public ResponseEntity<Object> getTest3Grade5()
    {
        return questionService.getTest3Grade5();
    }

    @GetMapping("/test4grade5")
    public ResponseEntity<Object> getTest4Grade5()
    {
        return questionService.getTest4Grade5();
    }

    @GetMapping("/test5grade5")
    public ResponseEntity<Object> getTest5Grade5()
    {
        return questionService.getTest5Grade5();
    }

    @GetMapping("/test6grade5")
    public ResponseEntity<Object> getTest6Grade5()
    {
        return questionService.getTest6Grade5();
    }

    @GetMapping("/test7grade5")
    public ResponseEntity<Object> getTest7Grade5()
    {
        return questionService.getTest7Grade5();
    }

    @GetMapping("/test8grade5")
    public ResponseEntity<Object> getTest8Grade5()
    {
        return questionService.getTest8Grade5();
    }

    @GetMapping("/test9grade5")
    public ResponseEntity<Object> getTest9Grade5()
    {
        return questionService.getTest9Grade5();
    }
}
