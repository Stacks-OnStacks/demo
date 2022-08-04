-- Table with no constraints
create table employee(
	email varchar(40),
	full_name varchar(50), -- this is following snake_case where _ inbetwen each word
	dob varchar(12),
	emp_position varchar(20), -- ensure comma after all columns except last
	salary numeric, 
	department varchar(20),
	depart_floor int
);

-- Table with some basic constraints
create table employee(
	email varchar(40) primary key, -- more specific not null unqiue key, known as the primary key
	full_name varchar(50) not null, -- not null, means it NEEDs some value
	dob varchar(12) not null,
	emp_position varchar(20), -- ensure comma after all columns except last
	salary numeric not null check (salary > 100), 
	department varchar(20),
	depart_floor int
);


-- Break table in two, one for employee another for department
create table employee(
	email varchar(40) primary key, 
	first_name varchar(15) not null,
	last_name varchar(15) not null,
	dob varchar(12) not null,
	emp_position varchar(20), 
	salary numeric not null check (salary > 100),
	department_id int
	-- constraint fk_department foreign key(department_id) references department(department_id) on delete cascade-- foreign key is the primary key in another table that it's relating too
); -- on delete cascade makes sure to delete any key when being removed fromt he parent table
-- foreign keys are not unique

create table department(
	department_id serial primary key, -- increments up one at a time
	phone_extension int,
	department varchar(20),
	depart_floor int
);

-- how to remove a table
-- WE need to restructure out table to have some constraints
drop table employee ; -- completely deletes the table
truncate table employee; -- removes all records under the table while keeping the same table structure

drop table department;
--
--

-- Alter our table to handle the FK constraint
alter table employee 
add constraint fk_department 
foreign key(department_id) references department(department_id) 
on delete cascade;

-- First insert a single employee
-- ctrl+enter runs whatever line your on
insert into employee 
values 
('cj@mail.com', 'Charles', 'Jester', '01-01-1900', 'Trainer', 1000,  1);

-- let's delte that user from the table
delete from employee where email = 'ar@mail.com';

-- Multi-insert
insert into employee
values
('ar@mail.com', 'Adam', 'Ranieri', '01-01-1000', 'Principle Trainer', 1005, 1),
('hh@mail.com', 'Harvey', 'Hill', '01-01-100', 'Tech Manager', 10000, 1);

insert into employee
values
('sl@mail.com', 'Shelby', 'Lloyd', '01-01-1000', 'Head of HR', 2005, 2),
('os@mail.com', 'Ola', 'Sig', '01-01-100', 'HR Specialist', 1000, 2);
-- the above code fails if there is no department_id = 3. This is due to referential integrity, meaning 
-- whenever you have a foreign key it MUST have a reference to the record it's point

-- let's update someone without the table having primary keys
-- UPDATES
update employee set salary = 1900 where email = 'cj@mail.com';

update employee set salary = 1500 where email = 'ar@mail.com' and salary = 1005;

update employee set salary = salary + 500 where department = 'Technology';

-- READ or Query information from our table
select * from employee;

select * from employee where salary >= 2000 and department = 'Technology';

-- Insert record into department 

insert into department
values
(default, 900, 'Technology', 2),
(default, 600, 'Human Resources', 3);

insert into department
values
(default, 900, 'Technology', 2),
(default, 700, 'Sales', 3);

insert into department 
values
(1, 300, 'Delivery', 1);
delete from department where department_id = 1;

select * from department;




-----
-- What if we are looking at a different company? i.e Walmart, Wells Fargo, CitiBank

create schema walmart;

create table walmart.employee(
	email varchar(40) primary key, 
	first_name varchar(15) not null,
	last_name varchar(15) not null,
	dob varchar(12) not null,
	emp_position varchar(20), 
	salary numeric not null check (salary > 100),
	department_id int
); 

create schema  wells_fargo;

create table wells_fargo.employee(
	email varchar(40) primary key, 
	first_name varchar(15) not null,
	last_name varchar(15) not null,
	dob varchar(12) not null,
	emp_position varchar(20), 
	salary numeric not null check (salary > 100),
	department_id int
); 

create schema citi;

create table citi.employee(
	email varchar(40) primary key, 
	first_name varchar(15) not null,
	last_name varchar(15) not null,
	dob varchar(12) not null,
	emp_position varchar(20), 
	salary numeric not null check (salary > 100),
	department_id int
); 


create schema p0;

select * from employee;

select * from department;


-- read
select * from employee;

select first_name, dob, emp_position, email from employee; -- can be selective with select

-- create a record
insert into employee 
(department_id, dob, emp_position, salary, last_name, first_name, email) -- should follow order of columns, can exclude anything you may not no so null is added by default
values
(2,  'Trainer', '01-01-0900', 1700, 'Arathyeal', 'Brian', 'bra@mail.coml');

-- update 
update employee set dob = '01-01-0900', emp_position = 'Trainer', email = 'bra@mail.com' where email = 'bra@mail.coml';

-- delete
delete from employee where email = 'ba@mail.coml';
delete from employee where emp_position = 'Head of HR';

select employee.email, employee.salary, employee.emp_position, department.department, department.phone_extension 
from employee
join department on employee.department_id = department.department_id;

-- because of column specification order does not mater of which table is accessed first
select employee.email, employee.salary, employee.emp_position, department.department, department.phone_extension 
from department
join employee on employee.department_id = department.department_id;



select *
from department
join employee on employee.department_id = department.department_id;


select f.email, f.first_name, f.salary, d.phone_extension, d.depart_floor, d.department 
from employee f 
join department d on f.department_id = d.department_id;

create table enlistings(
	training_name varchar(20),
	department_id int,
	constraint fk_department foreign key(department_id) references department(department_id)
)

drop table enlistings;

insert into enlistings 
values
('Java React', 2);

select *
from employee e 
join enlistings en  on e.department_id = en.department_id;

-- Views

create view employee_department as
select f.email, f.first_name, f.salary, d.phone_extension, d.depart_floor, d.department 
from employee f 
join department d on f.department_id = d.department_id;

insert into employee 
values
('sl@mail.com', 'Shelby', 'Lloyd', '01-01-2000', 'Support Specialist', 2000, );

select * from employee
union
select * from walmart_employee;

insert into employee 
values
('sw@mail.com', 'Shelby', 'Woods', '01-01-2000', 'HR Specialist', 4000, 2);

-- Functions

-- Scalar - they apply something to each record that's returning
select upper(email) from employee; -- just changed in the query statement
select lower(emp_position) from employee;
select email, length(email) from employee e;

select * from employee e ;

-- Aggregate - taking multiple values and returning a single input

-- before we do aggregate let's talk about grouping and order 

select * from employee e order by salary; -- by default it orders ascendingly
select * from employee e order by salary asc;
select * from employee e order by salary desc limit 3;

select avg(salary) from employee e; -- aggregate 

select * from employee e limit 5;

select department_id, avg(salary) from employee e group by department_id order by avg(salary) desc;









