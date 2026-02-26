package kh.edu.paragoniu.helloworldapp.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"hwwa_user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotBlank(message = "Name is mandatory") //make sure user enter at least one character that is not a whitespace
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Column(unique = true) // to prevent duplicating emails
    private String email;

}
