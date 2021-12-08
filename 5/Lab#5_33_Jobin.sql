/*drop database PRDCT;*/
create database PRDCT;
use PRDCT;

create table product (
pdtid varchar(50) not null,
pname varchar(100),
prIce int,
qtyinstock int,
primary key(pdtid)
);

create table sale (
saleid int  primary key not null,
Deliveryaddess varchar(100)
);

create table saleitem(
saleid int not null, 
pdtid varchar (50)  not null,
qty int 
);



insert into product (pdtid,pname,prIce,qtyinstock)  values ( "A","AA",40,2);
insert into product(pdtid,pname,prIce,qtyinstock) values ("B","BB",440,5);
select * from product;
insert into saleitem(saleid,pdtid,qty) values (1,"A",2);
insert into saleitem(saleid,pdtid,qty) values (1,"B",2);
select * from saleitem;

select * from product;