package app.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

/**
 * This class facilitates all of the common properties for each of the entities.
 */

@MappedSuperclass
@Setter
@Getter
public class BaseEntity implements Cloneable, Serializable {

    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    protected UUID id;

    protected Instant createdAt;

}
