package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try{
            // 저장
//            Member member = new Member();
//
//            member.setId(2L);
//            member.setName("HelloA");
//            em.persist(member);

            //조회
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.getId() = " + findMember.getId());
//            System.out.println("findMember.getname() = " + findMember.getName());

//            //수정
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            //JPQL
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(1)
//                    .setMaxResults(8)
//                    .getResultList();
//
//            for (Member member: result) {
//                System.out.println("member.getName() = " + member.getName());
//            }
//

//            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");
//
//            //영속 -persist context
//            System.out.println("==== BEFORE ====");
//            em.persist(member); //1차캐시 영속 컨텍스트에 저장
//            em.detach(member);



//            System.out.println("==== AFTER ====");
//
//            Member findMember1 = em.find(Member.class, 101L); //1차 캐시에서 찾음 - 없으면 DB에서 찾음 찾고 잇으면 다시 1차캐시에 올림
//            Member findMember2 = em.find(Member.class, 101L); //1차 캐시에서 찾음 - 없으면 DB에서 찾음 찾고 잇으면 다시 1차캐시에 올림
//
//            System.out.println("result = " + (findMember1==findMember2));

//            System.out.println("findMember.getId() = " + findMember.getId());
//            System.out.println("findMember.getName() = " + findMember.getName());
            //삭제
//            em.remove(findMember);

//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//            em.persist(member1);
//            em.persist(member2);

//            Member member = em.find(Member.class, 150L);
//            member.setName("zzzzz"); //엔티티 변경 commit되는 시점에 자동으로 update

//            Member member = new Member(200L, "member200");
//            em.persist(member);

//            em.flush(); //데이터베이스에 쿼리가 즉시 나감

//            System.out.println("==============================");
//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
////            member.changeTeam(team); //**
//            em.persist(member);

           // team.addMember(member); //**
//            em.flush();
//            em.clear();

//            Member findMember = em.find(Member.class, member.getId());
//
//            List<Member> members = findMember.getTeam().getMembers();
//
//            for (Member m : members) {
//                System.out.println("m.getUsername() = " + m.getUsername());
//            }
//            Team findTeam = findMember.getTeam();
//            System.out.println("findTeam.getId() = " + findTeam.getId());

//            Member member =new Member();
//            member.setUsername("member1");
//            em.persist(member);
//
//            Team team = new Team();
//            team.setName("teamA");
//            team.getMembers().add(member);
//
//            em.persist(team);
//            Movie movie = new Movie();
//            movie.setDirector("aaaa");
//            movie.setActor("bbbb");
//            movie.setName("바람과함께사라지다");
//            movie.setPrice(10000);
//
//            em.persist(movie);
//            em.flush();
//            em.clear(); //1차캐시지움
//
//            Movie findMovie = em.find(Movie.class, movie.getId());
//            System.out.println("findMovie = " + findMovie);


            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();

    }
}
