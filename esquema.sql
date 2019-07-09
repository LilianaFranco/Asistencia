create table clubes (
id MEDIUMINT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(200) NOT NULL,
razon_social VARCHAR(500),
logo VARCHAR(200),
PRIMARY KEY (id)
);

CREATE TABLE integrantes (
nombre VARCHAR(200),   
identificacion VARCHAR(20),   
fecha_nacimiento date,  
eps VARCHAR(100),   
telefono VARCHAR(20),   
profesion VARCHAR(100),   
direccion VARCHAR(100),
nombre_contacto_emergencia VARCHAR(200) DEFAULT NULL, 
telefono_contacto_emergencia VARCHAR(20)
PRIMARY KEY (identificacion)
);

CREATE TABLE sesiones_entrenamiento (
id MEDIUMINT(9) NOT NULL AUTO_INCREMENT,
club_id MEDIUMINT(9) NOT NULL,
fecha DATE,
hora_inicio TIME,
hora_fin TIME,
lugar VARCHAR(300),
plan_entrenamiento VARCHAR(800),
PRIMARY KEY (id),
FOREIGN KEY (club_id) REFERENCES clubes(id) 
);

CREATE TABLE roles (
id MEDIUMINT(20) NOT NULL AUTO_INCREMENT,
integrantes_id VARCHAR(20) NOT NULL,
club_id MEDIUMINT NOT NULL,
FOREIGN KEY (integrantes_id) REFERENCES integrantes(identificacion),
FOREIGN KEY (club_id) REFERENCES clubes(id),
rol VARCHAR(50),
PRIMARY KEY (id)
);


CREATE TABLE asistencias (
id MEDIUMINT(20) NOT NULL AUTO_INCREMENT,
sesiones_entrenamiento_id MEDIUMINT(20) NOT NULL,
integrantes_id VARCHAR(20) NOT NULL,
FOREIGN KEY (sesiones_entrenamiento_id) REFERENCES sesiones_entrenamiento(id),
FOREIGN KEY (integrantes_id) REFERENCES integrantes(identificacion),
PRIMARY KEY (id)
);



insert into integrantes (nombre, identificacion, fecha_nacimiento, eps, telefono, profesion, direccion, nombre_contacto_emergencia, telefono_contacto_emergencia) values ('Liliana Patricia Franco Uribe', '44005526', '1985-04-24', 'SURA', '3205875867', 'Project Manager', 'Calle 40sur 39-98', 'Edilia Uribe', '4977716');


select * from integrantes as inte join roles as rol where rol.integrantes_id=integrantes.identificacion and rol.club_id=1;