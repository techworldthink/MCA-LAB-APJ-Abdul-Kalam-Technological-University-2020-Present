drop database company;
create database company;
show databases;
use company;

create table jobs( 
	job_id int not null auto_increment ,
	job_title varchar(20) not null ,
	min_salary int ,
	max_salary int ,
	primary key(job_id));

create table  employees(
	employee_id int not null,
	first_name varchar(20) not null,
    last_name varchar(20) not null,
    email varchar(20) not null,
    phone_number varchar(11) not null,
    hire_date varchar(20) not null,
    job_id int not null,
    salary int,
    manager_id int,
    department_id int,
    primary key(employee_id));
    
create table dependents(
	dependent_id int not null,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    relationship varchar(20) not null,
    employee_id int,
    primary key(dependent_id));

create table departments(
	department_id int not null,
    department_name varchar(20) not null,
    location_id int,
    primary key(department_id));

create table regions(
	region_id int not null,
    region_name varchar(20) not null,
    primary key(region_id)); 
    
create  table countries(
	country_id int not null,
    country_name varchar(20) not null,
    region_id int,
    primary key(country_id));
    
create table locations(
	location_id int not null,
    street_address varchar(20) not null,
    postal_code int,
    city varchar(20) not null,
    state_province varchar(20) not null,
    country_id int,
    primary key(location_id));

show tables;
