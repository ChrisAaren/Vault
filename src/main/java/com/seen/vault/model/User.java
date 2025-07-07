package com.seen.vault.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    int userId;

    String username;
    String password;
    String phoneNumber;
    String email;
}
