--DROP TABLE IF EXISTS FamilyMember;

--CREATE TABLE FamilyMember (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  full_name VARCHAR(250) NOT NULL
--);

INSERT INTO family_member (id, full_name, email, user_type, address) VALUES ('111', 'Olena Marchenko', 'olena.marchenko@workhuman.com', '1', '2');
INSERT INTO family_member (id, full_name, user_type, address) VALUES ('222', 'Nina Marchenko', '1', '1');
INSERT INTO address (id, country_code, address) VALUES ('1', 'IRL', 'Dublin 12');
INSERT INTO address (id, country_code, address) VALUES ('2', 'UKR', 'Kyiv');
INSERT INTO relationship_type (id, name) VALUES ('1', 'parent');
INSERT INTO relationship_type (id, name) VALUES ('2', 'child');
INSERT INTO relationship_type (id, name) VALUES ('3', 'sibling');
INSERT INTO family_member_relationship (relationship_type, id_from, id_to) VALUES ('1', '222', '111');
INSERT INTO family_member_relationship (relationship_type, id_from, id_to) VALUES ('2', '111', '222');