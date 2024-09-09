package com.quiz.g4.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "record_student")
public class RecordStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Integer recordId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // Học sinh làm bài kiểm tra

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;  // Bài kiểm tra mà học sinh đã làm

    @Column(name = "score")
    private Double score;

    @Column(name = "attempted_date", nullable = false)
    private LocalDate attemptedDate = LocalDate.now();
}
