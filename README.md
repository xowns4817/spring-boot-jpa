# spring-boot-jpa
spring boot jpa 연동

- @OneToMany
- @ManyToOne

- Student Entity,  School Entity
- 학생(N), 학교(1)의 관계 
   - 학생입장에서 학교를 조회할때 @ManyToOne
   - 학교입장에서 학생들을 조회할때 @OneToMany
   - 외래키가 존재하는 학생 Entity가 주인
