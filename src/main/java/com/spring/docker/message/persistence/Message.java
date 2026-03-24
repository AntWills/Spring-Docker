package com.spring.docker.message.persistence;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_massage")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;
}
