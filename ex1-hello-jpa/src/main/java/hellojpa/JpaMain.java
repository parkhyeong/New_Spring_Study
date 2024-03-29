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

            //비영속
            Member member = new Member();
            member.setId(100L);
            member.setName("HelloJPA");

            //영속 -persist context
            System.out.println("==== BEFORE ====");
            em.persist(member);
//            em.detach(member);

            System.out.println("==== AFTER ====");

            //삭제
//            em.remove(findMember);

            tx.commit();
        }catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();

    }
}
