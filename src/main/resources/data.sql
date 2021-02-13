--DROP TABLE IF EXISTS FamilyMember;

--CREATE TABLE FamilyMember (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  full_name VARCHAR(250) NOT NULL
--);

INSERT INTO address (id, country_code, address) VALUES ('1', 'IRL', 'Dublin 12');
INSERT INTO address (id, country_code, address) VALUES ('2', 'UKR', 'Kyiv');
INSERT INTO user_type (id, name, role) VALUES ('1', 'simple user', 'user');
INSERT INTO user_type (id, name, role) VALUES ('2', 'advanced user', 'admin');
INSERT INTO user (user_name, password, user_type_id) VALUES ('olena.marchenko@workhuman.com', 'qwerty', '1');
INSERT INTO family_member (id, full_name, email, address_id) VALUES ('111', 'Olena Marchenko', 'olena.marchenko@workhuman.com', '1');
INSERT INTO family_member (id, full_name, address_id) VALUES ('222', 'Nina Marchenko', '2');
INSERT INTO family_relationship (id, relationship_type, family_member_id, family_member_relative_id) VALUES ('1', 'CHILD', '111', '222');
INSERT INTO family_relationship (id, relationship_type, family_member_id, family_member_relative_id) VALUES ('2', 'PARENT', '222', '111');