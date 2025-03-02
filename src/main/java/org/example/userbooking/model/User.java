package org.example.userbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("Users")
public class User {
    @Id
    private UUID id = UUID.randomUUID();
    private String username;
    private String password;
}
