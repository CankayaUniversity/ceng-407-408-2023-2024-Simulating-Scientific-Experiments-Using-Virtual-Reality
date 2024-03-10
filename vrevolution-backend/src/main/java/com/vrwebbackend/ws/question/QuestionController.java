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

    @GetMapping("/test10grade5")
    public ResponseEntity<Object> getTest10Grade5()
    {
        return questionService.getTest10Grade5();
    }

    @GetMapping("/test11grade5")
    public ResponseEntity<Object> getTest11Grade5()
    {
        return questionService.getTest11Grade5();
    }

    @GetMapping("/test12grade5")
    public ResponseEntity<Object> getTest12Grade5()
    {
        return questionService.getTest12Grade5();
    }

    @GetMapping("/test13grade5")
    public ResponseEntity<Object> getTest13Grade5()
    {
        return questionService.getTest13Grade5();
    }

    @GetMapping("/test14grade5")
    public ResponseEntity<Object> getTest14Grade5()
    {
        return questionService.getTest14Grade5();
    }

    @GetMapping("/test15grade5")
    public ResponseEntity<Object> getTest15Grade5()
    {
        return questionService.getTest15Grade5();
    }

    @GetMapping("/test16grade5")
    public ResponseEntity<Object> getTest16Grade5()
    {
        return questionService.getTest16Grade5();
    }

    @GetMapping("/test17grade5")
    public ResponseEntity<Object> getTest17Grade5()
    {
        return questionService.getTest17Grade5();
    }

    @GetMapping("/test18grade5")
    public ResponseEntity<Object> getTest18Grade5()
    {
        return questionService.getTest18Grade5();
    }

    @GetMapping("/test19grade5")
    public ResponseEntity<Object> getTest19Grade5()
    {
        return questionService.getTest19Grade5();
    }

    @GetMapping("/test20grade5")
    public ResponseEntity<Object> getTest20Grade5()
    {
        return questionService.getTest20Grade5();
    }

    @GetMapping("/test21grade5")
    public ResponseEntity<Object> getTest21Grade5()
    {
        return questionService.getTest21Grade5();
    }

    @GetMapping("/test1grade6")
    public ResponseEntity<Object> getTest1Grade6()
    {
        return questionService.getTest1Grade6();
    }

    @GetMapping("/test2grade6")
    public ResponseEntity<Object> getTest2Grade6()
    {
        return questionService.getTest2Grade6();
    }

    @GetMapping("/test3grade6")
    public ResponseEntity<Object> getTest3Grade6()
    {
        return questionService.getTest3Grade6();
    }

    @GetMapping("/test1grade7")
    public ResponseEntity<Object> getTest1Grade7()
    {
        return questionService.getTest1Grade7();
    }

    @GetMapping("/test2grade7")
    public ResponseEntity<Object> getTest2Grade7()
    {
        return questionService.getTest2Grade7();
    }

    @GetMapping("/test3grade7")
    public ResponseEntity<Object> getTest3Grade7()
    {
        return questionService.getTest3Grade7();
    }
}
