use company;

SELECT country_name FROM countries;
SELECT email,phone_number FROM employees;
SELECT * FROM employees WHERE last_name='Fay';
SELECT hire_date FROM employees WHERE last_name='Grant' OR last_name='Whalen';
SELECT first_name FROM employees WHERE job_id=(SELECT job_id from jobs WHERE job_title='shipping clerk');
SELECT first_name FROM employees WHERE department_id=(SELECT department_id from dept WHERE department_id=8);

SELECT department_name FROM dept ORDER BY department_name DESC;
SELECT first_name,last_name FROM employees WHERE last_name LIKE 'K%';
SELECT first_name FROM employees WHERE hire_date BETWEEN '1995-01-01' AND '1997-01-01';
SELECT job_title FROM jobs WHERE max_salary < 5000;
SELECT lower(email) FROM employees;
SELECT first_name FROM employees WHERE hire_date BETWEEN '1995-01-01' AND '1997-12-31';
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES
(99,'Paul',' Newton','steven.king@sqltutorial.org','515.123.4567','1987-06-17',4,24000.00,NULL,11);

DELETE FROM dept WHERE department_name='Shipping';



