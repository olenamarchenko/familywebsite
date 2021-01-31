--DROP TABLE IF EXISTS FamilyMember;

--CREATE TABLE FamilyMember (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  full_name VARCHAR(250) NOT NULL
--);

INSERT INTO address (id, country_code, address) VALUES ('1', 'IRL', 'Dublin 12');
INSERT INTO address (id, country_code, address) VALUES ('2', 'UKR', 'Kyiv');
INSERT INTO user_type (id, name, role) VALUES ('1', 'simple user', 'user');
INSERT INTO user_type (id, name, role) VALUES ('2', 'advanced user', 'admin');
INSERT INTO family_member (family_member_id, full_name, email, user_type, address_id) VALUES ('111', 'Olena Marchenko', 'olena.marchenko@workhuman.com', '1', '1');
INSERT INTO family_member (family_member_id, full_name, user_type, address_id) VALUES ('222', 'Nina Marchenko', '1', '2');
INSERT INTO relationship_type (relationship_id, name) VALUES ('1', 'parent');
INSERT INTO relationship_type (relationship_id, name) VALUES ('2', 'child');
INSERT INTO relationship_type (relationship_id, name) VALUES ('3', 'sibling');
INSERT INTO family_relationship (family_relation_id, relationship_type, family_member_id, of) VALUES ('1', '222', '111', '000');
INSERT INTO family_relationship (family_relation_id, relationship_type, family_member_id, of) VALUES ('2', '111', '222', '000');