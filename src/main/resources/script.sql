CREATE table if not exist usertable (
	id int primary key not null,
	name VARCHAR(100),
	firstname VARCHAR(100),
	email VARCHAR(100),
	age int
)

INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (1,"chris","chris","chris@chris",11)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (2,"chris","chris2","chris@chris",19)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (3,"test","test","test@test",33)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (4,"test","test2","test@test",48)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (5,"chuk","norris","chuk@chuk",80)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (6,"nina","nina","nina@nina",25)
INSERT INTO USERTABLE (id,name,firstname,email,age) VALUES (7,"jordan","jordan","jordan",37)