package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

//    @Column(name = "TEAM_ID")
//    private Long teamId;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Embedded
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY) //member입장에서 member는 N team은 1
    @JoinColumn(name="TEAM_ID", insertable = false, unique = false) //연관관계의 주인 읽기쓰기 가능
    private Team team;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

    @OneToMany(mappedBy ="member")
    //@JoinTable(name = "MEMBER_PRODUCT")
    private List<MemberProduct> memberProducts = new ArrayList<>();

    private  String createBy;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }

//    public void changeTeam(Team team) {
//        this.team = team;
//
//        team.getMembers().add(this);
//    }
}
