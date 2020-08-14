package com.example.springboot.jpa.demo;

import com.example.springboot.jpa.demo.entity.SchoolEntity;
import com.example.springboot.jpa.demo.entity.StudentEntity;
import com.example.springboot.jpa.demo.repository.SchoolRepo;
import com.example.springboot.jpa.demo.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    // @OneToOne

    // @OneToMany

    // @ManyToOne

    // @ManyToMany

    @Autowired
    private SchoolRepo schoolRepo;

    @Autowired
    private StudentRepo studentRepo;

    @Test
    void contextLoads() {

        // 학교 insert
        /*
        schoolRepo.save( SchoolEntity.builder()
                .name("홍성고등학교")
                .addr("충남 홍성군")
                .dial("041-633-1234")
                .build());

        schoolRepo.save( SchoolEntity.builder()
                .name("휘경고등학교")
                .addr("동대문구 전농동")
                .dial("02-2212-1123")
                .build());
        */

        // 학생 insert
        /*
        studentRepo.save(StudentEntity.builder()
                .name("김태준")
                .age(29)
                .major("컴퓨터 공학")
                .schoolId(1L)
                .build());

        studentRepo.save(StudentEntity.builder()
                .name("최혜원")
                .age(26)
                .major("디자인")
                .schoolId(1L)
                .build());
         */

        // 홍성고 학생 조회 ( 학교 Entity에서 해당 학생들 조회 )

        SchoolEntity school = schoolRepo.findById(1L).get();
        for (StudentEntity student: school.getStudentEntityList()) {
            System.out.print(student.toString());
        }


        /*  // 학생 Entity에서 소속된 학교 조회
         List<StudentEntity> list = studentRepo.findAll();
         for (StudentEntity studentEntity: list) {
             System.out.print(studentEntity);
         }
         */
    }
}
