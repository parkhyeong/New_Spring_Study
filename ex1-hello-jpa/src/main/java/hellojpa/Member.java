package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@SequenceGenerator(name="member_seq_generator", sequenceName = "member_seq")
//@Table(name="MBR")
public class Member {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
//    private Long id;
//    @Column(name = "name")
//    private String username;

//    private Integer age;
//    @Enumerated(EnumType.STRING) //필수로 enum에 저장된 String으로 표시
//    private RoleType roleType;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//
//    private LocalDate testLocalDate;
//    private LocalDateTime testLocalDateTime;
//
//    @Lob //문자면 clob
//    private String description; //큰 컨텐트를 넣고싶으면 lob


}
