package app.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
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
public class FamilyMember extends BaseEntity implements Serializable {

    @Column
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email")
    private User email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "familyRelationships")
    @OrderColumn(name = "relationship_type")
    private List<FamilyRelationship> familyRelationships;

    @Column
    private String contactDetails;

    @Override
    public String toString() {
        return "FamilyMember [id=" + id + ", fullName=" + fullName + "]";
    }

}
