CREATE TABLE adresse
(
  adr_id serial NOT NULL,
  adr_numero integer,
  adr_ville character varying,
  adr_code_postal integer,
  CONSTRAINT adresse_pkey PRIMARY KEY (adr_id)
)

INSERT INTO adresse(
            adr_id, adr_numero, adr_ville, adr_code_postal)
    VALUES (1, 25, 'val', 59);

INSERT INTO adresse(
            adr_id, adr_numero, adr_ville, adr_code_postal)
    VALUES (2, 33, 'val2', 59);
    
INSERT INTO adresse(
            adr_id, adr_numero, adr_ville, adr_code_postal)
    VALUES (3, 10, 'val3', 59);