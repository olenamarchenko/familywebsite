package app.model;

import app.util.UserTypeConverter;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class UserType {
    
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "family_members")
    private FamilyMember familyMember;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "family_members")
//    private FamilyMember familyMember;

    @Convert(converter = UserTypeConverter.class)
    private UserRoleEnum role;
}
