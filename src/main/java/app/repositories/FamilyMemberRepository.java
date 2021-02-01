package app.repositories;

import app.model.FamilyMember;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer> {

    default List<FamilyMember> findByName(@Param("fullName") String name) {
        return null;
    }

}
