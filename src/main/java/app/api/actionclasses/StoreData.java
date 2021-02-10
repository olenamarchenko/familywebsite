package app.api.actionclasses;

import app.model.Address;
import app.model.FamilyMember;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();

    Transaction t = session.beginTransaction();

    Address address1 = new Address("IRL", "Swords");
    Address address2 = new Address("UA", "Kyiv");

    FamilyMember familyMember1 = new FamilyMember();

//    List<Address> addressList = Arrays.asList(address1, address2);
}
