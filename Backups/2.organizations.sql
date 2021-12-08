create database organization;
use organization;

create table employee(
emp_no int not null,
emp_name varchar(20),
DOB date,
address varchar(30), 
doj varchar(30),
mobile_no varchar(15),
dept_no int,
salary int,
primary key(emp_no)
);

create table department(
dept_no int not null,
dept_name varchar(20),
location varchar(30),
primary key(dept_no)
);

show tables;
describe employee;
alter table department drop  location;
drop table department;
drop table employee;
drop database organization;