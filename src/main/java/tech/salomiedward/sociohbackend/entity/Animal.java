package tech.salomiedward.sociohbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {

    @Id
    @GeneratedValue
    private Integer Id;

    private String name;

    private String category;

}
