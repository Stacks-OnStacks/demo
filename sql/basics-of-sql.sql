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


create table employee(
	email varchar(40) primary key, -- more specific not null unqiue key, known as the primary key
	full_name varchar(50) not null, -- not null, means it NEEDs some value
	dob varchar(12) not null,
	emp_position varchar(20), -- ensure comma after all columns except last
	salary numeric not null check (salary > 100), 
	department varchar(20),
	depart_floor int
);
-- how to remove a table
-- WE need to restructure out table to have some constraints
drop table employee ; -- completely deletes the table
truncate table employee; -- removes all records under the table while keeping the same table structure
--
--

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
('ar@mail.com', 'Adam Ranieri', '01-01-1000', 'Principle Trainer', 1005, 'technology', 2),
('hh@mail.com', 'Harvey Hill', '01-01-100', 'Tech Manager', 10000, 'Technology', 2);