package ua.avada.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Poster {

    @Id
    private Long id;

    private LocalDate startActualDate;

    private LocalDate endActualDate;

    @OneToMany(targetEntity = Film.class)
    private List<Film> films;

}
