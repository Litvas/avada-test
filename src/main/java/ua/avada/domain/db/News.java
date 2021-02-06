package ua.avada.domain.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
public class News {

    @Id
    private Long id;

    private String title;

    private String content;

}
