CREATE TABLE vehicule
(
  v_type character varying,
  v_constructor character varying,
  v_name character varying,
  v_id_user integer,
  "v_isLoue" boolean,
  v_id serial NOT NULL,
  CONSTRAINT vehicule_v_id_user_fkey FOREIGN KEY (v_id_user)
      REFERENCES usertable (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)

INSERT INTO vehicule(
            v_type, v_constructor, v_name, v_id_user, "v_isLoue", v_id)
    VALUES ('voiture', 'peugeot', '206', 2, true, 1);

INSERT INTO vehicule(
            v_type, v_constructor, v_name, v_id_user, "v_isLoue", v_id)
    VALUES ('voiture', 'peugeot', '306', 0, false, 2);
    
INSERT INTO vehicule(
            v_type, v_constructor, v_name, v_id_user, "v_isLoue", v_id)
    VALUES ('voiture', 'peugeot', '2008', 4, true, 3);