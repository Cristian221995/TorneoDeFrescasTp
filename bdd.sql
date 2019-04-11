create database VikingosVsEspartanos;
use VikingosvsEspartanos;

create table ganadores(
id int(10) AUTO_INCREMENT,
nombre varchar(50),
bebida_en_cuerpo int(10),
constraint pk_ganador primary key(id)
);
