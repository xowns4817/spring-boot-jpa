package com.example.springboot.jpa.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long stno;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String major;

    /*
    @Column(name="school_id", nullable = false)
    private Long schoolId;
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="school_id")
    public SchoolEntity school;

    @Builder
    public StudentEntity(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        //this.schoolId = schoolId;
    }

    @Override
    public String toString( ) {
        return "name : " + this.name
                +" age : " + this.age
                +" major : " + this.major
                +" school : " + this.school.toString();
    }
}
