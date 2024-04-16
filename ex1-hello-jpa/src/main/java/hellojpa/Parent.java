package hellojpa;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Parent {
    @Id
    @GeneratedValue
    private Long id;
}
