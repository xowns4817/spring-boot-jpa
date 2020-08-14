package com.example.springboot.jpa.demo.entity;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity(name="school")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long scno;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String addr;

    @Column(nullable = false)
    private String dial;

    //해당 학교에 속한 학생들
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "school")
    private List<StudentEntity> studentEntityList;

    @Builder
    public SchoolEntity(String name, String addr, String dial) {
        this.name = name;
        this.addr = addr;
        this.dial = dial;
    }

    @Override
    public String toString( ) {
        return "name : " + this.name
                +" addr : " + this.addr
                +" dial : " + this.dial;
    }
}
