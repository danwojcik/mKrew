package pl.mkrew.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class UserEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(unique = true)
    private String login;
    private String password;

    @Column(unique = true)
    private String email;
    private String nameUser;
    private String surname;
    private String phoneNumberUser;

    @ElementCollection
    private List<String> bloodGroup = new ArrayList<>();

    @ManyToOne
    private RCKiKEntity rcKiKEntity;
}
