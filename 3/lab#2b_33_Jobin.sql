
use company;

/*Write a query to display the number of cities in the country*/
select country_id,count(city) as No_Of_City from locations group by country_id;

/*Write a query to display minimal salary of employees in every department*/
select department_id,min(salary) as Min_salary from employees group by department_id;

/*Write a query to display maximum salary of employees in every department*/
select department_id,max(salary) as Max_salary from employees group by department_id;

/*Write a query to display sum of salary of employees in every department*/
select department_id,sum(salary) as Total_salary from employees group by department_id;

/* Display the ID of departments with average salary greater than 15000*/
select department_id,avg(salary) as Average_salary from employees   group by department_id having Average_salary>15000;

/*Write a query to display the number of employees managed by the manage*/
select manager_id,count(employee_id) as No_of_Employee from employees group by manager_id;

/*Write a query to display managers who are managing more than 3 employees*/
select manager_id,count(employee_id) as No_of_Employee from employees group by manager_id having No_of_Employee>3;

/* Write a query to increase salary of employee 111 to 5000*/
update employees set salary=salary+5000 where employee_id=111;
select *from employees where employee_id=111;