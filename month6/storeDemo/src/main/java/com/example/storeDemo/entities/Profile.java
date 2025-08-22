package com.example.storeDemo.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfbirth;

    @Column(name = "loyalty_points")
    private Integer loyaltyPoints;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @MapsId
    private User user;
}
