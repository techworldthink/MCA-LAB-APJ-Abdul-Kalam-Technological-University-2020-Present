/*drop database STORE;
create database STORE;
use STORE;
create table Product(
PdtId INT NOT NULL AUTO_INCREMENT,
PNAME VARCHAR(100) NOT NULL,
PRICE INT NOT NULL,
QUANTITY INT NOT NULL,
PRIMARY KEY(PdtId)
);
*/
call insertProduct(21,"AS",3,4);
call insertProduct(22,"JK",2,2);
SELECT * FROM Product;