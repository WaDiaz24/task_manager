package com.task.task_manager.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.YesNoConverter;

import java.time.LocalDate;

@Setter @Getter
@Entity
@Table()
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false)
    private String priority;
    private LocalDate creationDate = LocalDate.now();
    @Convert(converter = YesNoConverter.class)
    private Boolean isDone;
}
