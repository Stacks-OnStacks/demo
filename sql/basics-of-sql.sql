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
('cj@mail.com', 'Charles Jester', '01-01-1900', 'Trainer', 1000, 'Technology', 2);

-- let's delte that user from the table
delete from employee where email = 'ar@mail.com';

-- Multi-insert
insert into employee
values
('ar@mail.com', 'Adam', 'Ranieri', '01-01-1000', 'Principle Trainer', 1005, 3),
('hh@mail.com', 'Harvey', 'Hill', '01-01-100', 'Tech Manager', 10000, 3);

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






















