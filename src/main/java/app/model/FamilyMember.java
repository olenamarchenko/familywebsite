package app.model;

import app.util.UserTypeConverter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @Column(name = "family_member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_type", referencedColumnName = "id")
    private UserType userType;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
//    private List<UserType> userType = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name = "contact_details")
    private String contactDetails;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "family_relationship")
    private int familyRelationship;

    @Override
    public String toString() {
        return "FamilyMember [id=" + id + ", fullName=" + fullName + "]";
    }

//
//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "Family_Relationship",
//            joinColumns = { @JoinColumn(name = "family_member_id") },
//            inverseJoinColumns = { @JoinColumn(name = "family_relation_id") }
//    )
//    Set<FamilyRelationship> familyRelationships = new HashSet<>();

}
