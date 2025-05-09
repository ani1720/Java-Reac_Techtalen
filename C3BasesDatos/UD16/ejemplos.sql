- Cláusula WHERE condición
-- https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all
SELECT CustomerName, City FROM Customers WHERE City='Berlin';
SELECT CustomerName, City FROM Customers WHERE City='London';
SELECT CustomerName, City, Country FROM Customers WHERE Country='Mexico';
SELECT CustomerName FROM Customers WHERE CustomerID=13;

-- Operadores AND OR
SELECT * FROM Customers WHERE Country='Germany' AND City='Berlin';
SELECT * FROM Customers WHERE Country='Mexico' OR City='Berlin';
SELECT * FROM Customers WHERE Country='Germany ' AND NOT City='Berlin';

-- Equialentes para BETWEEN
SELECT * FROM Customers WHERE CustomerID BETWEEN 30 AND 86;
SELECT * FROM Customers WHERE CustomerID >= 30 AND CustomerID <=86;

SELECT * FROM Products WHERE Price AS PRECIO BETWEEN 10 AND 20;

SELECT * FROM Products WHERE (Price BETWEEN 10 AND 20) AND NOT CategoryID IN (1,2,3) ;

-- Alias AS
SELECT Price, Price*0.21  AS IVA, Price+Price*0.21 AS TOTAL FROM Products;

SELECT `PRECIO` AS `PRECIO BASE`, `PRECIO`*0.21 AS IVA, `PRECIO`*1.21 AS `PRECIO FINAL` FROM `productos`;

SELECT o.OrderID,o.OrderDate, c.CustomerName
FROM Customers c, Orders o
WHERE c.CustomerName="Around the Horn" AND c.CustomerID=o.CustomerID;

-- SQL COUNT(), AVG(), SUM(), MIN(), MAX()
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(ProductID) FROM Products;

SELECT AVG(Price) FROM Products;

SELECT SUM(Quantity) FROM OrderDetails;

SELECT MIN(Price) FROM Products;
SELECT MAX(Price) FROM Products;    

--HAVING
SELECT Employees.LastName, COUNT(Orders.OrderID) AS NumberOfOrders
FROM (Orders INNER JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID)
GROUP BY Employees.LastName
HAVING COUNT(Orders.OrderID) > 10;