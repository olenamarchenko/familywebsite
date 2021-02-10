package app.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class FamilyRelationship extends BaseEntity implements Serializable {

    @Enumerated(EnumType.STRING)
    @Column(name = "relationship_type")
//    @Convert(converter = RelationshipTypeConverter.class)
    private RelationshipTypeEnum relationshipType;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = FamilyMember.class)
    @JoinColumn(name = "family_member_id")
    private FamilyMember familyMember;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = FamilyMember.class)
    @JoinColumn(name = "family_member_relative_id")
    private FamilyMember of;
}
