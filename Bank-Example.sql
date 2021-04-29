create database Bank;

show databases;

use Bank;

create table users
( id int not null auto_increment ,
fname varchar(10) not null ,
salary int ,
primary key(id));

show tables;

describe users;

insert into users(id,fname,salary) values (1,'A',10);
insert into users(id,fname,salary) values (2,'B',20);
insert into users(id,fname,salary) values (3,'c',30);
insert into users(id,fname,salary) values (4,'D',40);
insert into users(id,fname,salary) values (5,'E',50);

select * from users;
select id,fname from users;
select count(id) from users;
select min(salary) from users;
select max(salary) from users;
select avg(salary) from users;
select sum(salary) from users;
select * from users limit 2;
select id from users where salary < 25;
select fname from users where id=1;
select id from users where salary < 25 AND salary >35;
select * from users order by id desc;
select * from users order by salary;

update users set fname="jobin" where id=1;
select * from users;
update users set salary=10000;
select * from users;

select * from users where fname like 'jo%';

drop table users;
drop database bank;



