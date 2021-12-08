CREATE DEFINER=`root`@`localhost` PROCEDURE `insertProduct`(
IN barcode INT(100),
IN productname VARCHAR(100),
IN price INT(100),
IN quantityInStock INT(100)
)
BEGIN
IF price > 0 and quantityInStock >= 0
THEN
Insert into product values (barcode,productname,price,quantityInStock);
END IF;
END