package inah.springbootmember.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String address;

    public void update(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
