package app.model;

import java.time.Instant;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class FamilyMember {
    
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    
    @Column (name = "full_name")
    private String fullName;
    
    @Column (name = "email")
    private String email;

    @Column(name = "user_type")
    private int userType;

    @Column(name = "address")
    private int address;
    
    @Column (name = "contact_details")
    private String contactDetails;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column (name = "family_relationship")
//    private List<Integer> familyRelationship; -- when passing List error: Caused by: org.hibernate.MappingException: Could not determine type for: java.util.List, at table: family_member, for columns: [org.hibernate.mapping.Column(family_relationship)]
//	at org.hibernate.mapping.SimpleValue.getType(SimpleValue.java:499) ~[hibernate-core-5.4.21.Final.jar:5.4.21.Final]
    private int familyRelationship;
    
    @Override
    public String toString() {
        return "FamilyMember [id=" + id + ", fullName=" + fullName + "]";
    }
}
