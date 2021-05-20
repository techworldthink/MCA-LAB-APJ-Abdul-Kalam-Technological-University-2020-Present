use company;

SELECT country_name FROM countries;
SELECT email,phone_number FROM employees;
SELECT * FROM employees WHERE last_name='Fay';
SELECT hire_date FROM employees WHERE last_name='Grant' OR last_name='Whalen';
SELECT first_name FROM employees WHERE job_id=(SELECT job_id from jobs WHERE job_title='shipping clerk');
SELECT first_name FROM employees WHERE department_id=8;
SELECT department_name FROM dept ORDER BY department_name DESC;
SELECT first_name,last_name FROM employees WHERE last_name LIKE 'K%';
SELECT first_name FROM employees WHERE hire_date BETWEEN '1995-01-01' AND '1997-01-01';
SELECT job_title FROM jobs WHERE max_salary < 5000;
SELECT lower(email) FROM employees;
SELECT first_name FROM employees WHERE hire_date BETWEEN '1995-01-01' AND '1995-12-31';
INSERT INTO employees(first_name,last_name,department_id) VALUES('Paul',' Newton',11);
DELETE FROM dept WHERE department_name='Shipping';



