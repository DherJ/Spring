CREATE TABLE usertable
(
  user_name character varying(20) NOT NULL,
  user_firstname character varying(20) NOT NULL,
  user_email character varying(20) NOT NULL,
  user_age integer NOT NULL,
  user_identifiant character varying,
  user_pass character varying,
  user_id_adr integer,
  user_id serial NOT NULL,
  CONSTRAINT usertable_pkey PRIMARY KEY (user_id),
  CONSTRAINT usertable_user_id_adr_fkey FOREIGN KEY (user_id_adr)
      REFERENCES adresse (adr_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)

INSERT INTO usertable(
            user_name, user_firstname, user_email, user_age, user_identifiant, 
            user_pass, user_id_adr, user_id)
    VALUES ('name1', 'name1', 'name@nn', 1, 'name1', 
            'name1', 1, 1);
            
INSERT INTO usertable(
            user_name, user_firstname, user_email, user_age, user_identifiant, 
            user_pass, user_id_adr, user_id)
    VALUES ('name2', 'name2', 'name@nnn', 2, 'name2', 
            'name2', 2, 2);
            
INSERT INTO usertable(
            user_name, user_firstname, user_email, user_age, user_identifiant, 
            user_pass, user_id_adr, user_id)
    VALUES ('name3', 'name3', 'name@nn', 3, 'name3', 
            'name3', 3, 3);