package com.vinay.webapp.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "todo")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    @NotNull(message = "Is Required")
    private String description;

    @Column(name = "target_date")
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate targetDate;

    @Column(name = "status")
    private String status;
}
