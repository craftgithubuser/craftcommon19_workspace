-- Creating New database 
Create database StudentDB;
-- create schema studentDB;
Use StudentDB;
Create table Student (
id int ,
FirstName varchar (20),
LastName varchar (20),
DepartmentName varchar (50),
Age int,
Salary double,
Pastalcode varchar (50) );


Use StudentDB;
Create table Teacher (
Tid int ,
TfirstName varchar (20),
TfastName varchar (20),
TdepartmentName varchar (50),
Age int,
Salary double,
Pastalcode varchar (50) );

-- Alter add,delete,
Alter table teacher 
add column Tsalary double;

Alter table student 
modify firstName Varchar(30);

Alter table teacher 
drop column Salary ;

alter table Student 
rename column FirstName to StudentFirstName;

alter table Student 
rename column LastName to StudentLastName;

Create Database Test;
use Test;
create table person (
Preson_Id int,
First_name varchar(30),
Last_name varchar(30),
Adress varchar(50), 
City varchar(50),
Zip_code int);

use studentdb;
create view  test_view as
select TfirstName,TfastName from teacher 








