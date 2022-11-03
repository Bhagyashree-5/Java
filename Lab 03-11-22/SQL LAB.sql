use anudip;

/* Creating tables */
create table Branchs(Branchcode int PRIMARY KEY, Location varchar(10) NOT NULL);
insert into branchs value(101, 'Murbad'),(102, 'Kalyan'),(103, 'Dadar'),(104, 'Bhiwandi'), (105, 'Thane');

create table BankMaster(Acno int PRIMARY KEY, Cname varchar(25) NOT NULL, City varchar(40) DEFAULT 'Hyderabad', Balance int NOT NULL CHECK(balance >= 500), Branchcode int , FOREIGN KEY(Branchcode) REFERENCES Branchs(Branchcode));
insert into bankmaster value(10567, 'Vandana', 'Kurla', 150000, 101), (10568, 'Asha', 'Matunga', 230600, 102), (10575, 'Bhagyashree', 'Kalyan', 30000, 102), (26845, 'Vikas', 'Pune', 55600, 108), (79327, 'Ashutosh', 'Murbad', 42000, 201);

create table banktransaction(Acno int, FOREIGN KEY(Acno) REFERENCES BankMaster(Acno), Ttype char(1), Tdate datetime NOT NULL, Amt int NOT NULL);
insert into banktransaction(10567, 'w', 2022-11-02, 9500),(10568, 'd', 2022-10-12, 15000),(10575, 'd', 2022-06-10, 20000),(26845, 'w', 2021-09-21, 5000),(79327, 'w', 2022-06-10, 10000);


/* 1)List the Bank Master details which customer have at least 30000 and above? */
select * from BankMaster where balance>=30000;

/* 2)List the All branchs,Bank Master details which branch have the customers. */
SELECT * FROM  Branchs, BankMaster WHERE Branchs.Branchcode = BankMaster.Branchcode;

/* 3)List the Bank master details which customer maximum no.of times ‘w’ transaction done. */
SELECT * FROM BankMaster Where Acno=(SELECT Acno FROM banktransaction WHERE Ttype = 'w');

/* 4)Find the total bal based on branch code and which branch total bal is above 100000 those branch,customer details. */
SELECT * FROM Branch, BankMaster WHERE BankMaster.Balance>100000 ORDER BY Branch.Branchcode;

/* 5)To display all bankmaster details for given acno using ‘procedure’ */
CREATE PROCEDURE CusDetail
AS 
BEGIN
SELECT * FROM BankMaster WHERE Acno = 10243;
END

/* 6)To get all transaction details based on date wise. */
SELECT * FROM banktransaction ORDER BY Tdate;

/* 7)To list the 3rd maximum balance customer details. */
SELECT * FROM BankMaster WHERE ORDER BY Balance ASC(SELECT * FROM BankMaster WHERE row_number() = 3);