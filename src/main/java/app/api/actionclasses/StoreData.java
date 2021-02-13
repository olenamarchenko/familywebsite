package app.api.actionclasses;


import app.model.Address;
import app.model.FamilyMember;
import app.model.FamilyRelationship;
import app.model.RelationshipTypeEnum;
import app.model.User;
import app.model.UserRoleEnum;
import app.model.UserType;
import java.util.Collections;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

@AllArgsConstructor
public class StoreData {

    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        // Address

        Address address1 = new Address("IRL", "Swords");
        Address address2 = new Address("UA", "Kyiv");

        // User type

        UserType userType1 = new UserType("admin", UserRoleEnum.ADMIN);
        UserType userType2 = new UserType("user", UserRoleEnum.USER);

        // User

        User user1 = new User("olena.marchenko@workhuman.com", "qwerty", userType2);
        User user2 = new User("nina.marchenko@gmail.com", "qwerty", userType1);

        // Family members

        FamilyMember familyMember1 = new FamilyMember("Olena Marchenko", user1, address1, Collections.EMPTY_LIST, "083 999 99 99");
        FamilyMember familyMember2 = new FamilyMember("Nina Marchenko", user2, address2, Collections.EMPTY_LIST, null);

        // Family relationship
        FamilyRelationship child = new FamilyRelationship(RelationshipTypeEnum.CHILD, familyMember1, familyMember2);
        FamilyRelationship parent = new FamilyRelationship(RelationshipTypeEnum.PARENT, familyMember2, familyMember1);

        familyMember1.setFamilyRelationships(Collections.singletonList(child));
        familyMember2.setFamilyRelationships(Collections.singletonList(parent));

        session.persist(familyMember1);
        session.persist(familyMember2);

        t.commit();
        session.close();
        System.out.println("success");
    }

}
