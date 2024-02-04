package com.vrwebbackend.ws.score;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vrwebbackend.ws.user.User;
import com.vrwebbackend.ws.user.dto.UserCreate;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Table(name="score")
@Data
public class Score
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    User user;

    Integer score;

    String grade;

    String testNumber;
}
