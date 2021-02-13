package app.model;

import app.util.UserTypeConverter;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
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
public class UserType extends BaseEntity implements Serializable {

    @Column
    private String name;

    @Convert(converter = UserTypeConverter.class)
    private UserRoleEnum role;
}
