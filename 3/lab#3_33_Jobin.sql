DROP DATABASE university;
CREATE DATABASE university;
SHOW DATABASES;
USE university;

CREATE TABLE student(
	s_no int not null primary key,
	s_name varchar(20) not null,
    s_class int,
    s_major varchar(10)
);

CREATE TABLE course(
	c_no varchar(10) not null primary key,
    c_name varchar(50),
    c_credit int,
    c_dept varchar(20)
);

CREATE TABLE section(
	s_identity int not null primary key,
    s_cno varchar(20),
    s_sem varchar(10),
    s_year varchar(5),
    s_instructor varchar(20)
);

CREATE TABLE grade_report(
	g_sec_identiy int not null primary key,
    g_stud_no int,
    g_grade varchar(10)
);

CREATE TABLE prerequisite(
	p_pre_no varchar(20) not null primary key,
    p_course_no varchar(20)
);

INSERT INTO student VALUES(17,'smith',1,'cs');
INSERT INTO student VALUES(8,'brown',2,'cs');

INSERT INTO course VALUES('CS1310','Intro to computer science',4,'cs');
INSERT INTO course VALUES('CS3320','Date structures',4,'cs');
INSERT INTO course VALUES('MATH2410','Discrete Mathematics',3,'cs');
INSERT INTO course VALUES('CS3380','Database',3,'cs');

INSERT INTO section VALUES(85,'MATH2410','fall','07','king');
INSERT INTO section VALUES(92,'CS1310','fall','07','anderson');
INSERT INTO section VALUES(102,'CS3320','spring','08','knuth');
INSERT INTO section VALUES(112,'MATH2410','fall','08','chang');
INSERT INTO section VALUES(119,'CS1310','fall','08','anderson');
INSERT INTO section VALUES(135,'CS3380','fall','08','stone');

INSERT INTO grade_report VALUES(112,17,'B');
INSERT INTO grade_report VALUES(119,17,'C');
INSERT INTO grade_report VALUES(85,8,'A');
INSERT INTO grade_report VALUES(92,8,'A');
INSERT INTO grade_report VALUES(102,8,'B');
INSERT INTO grade_report VALUES(135,8,'A');

INSERT INTO prerequisite VALUES('CS3320','CS3380');
INSERT INTO prerequisite VALUES('MATH2410','CS3380');
INSERT INTO prerequisite VALUES('CS1310','CS3320');

#3. Retrievethelistofallcoursesandgradesof‘Smith’
SELECT student.s_name,grade_report.g_grade,course.c_name FROM student INNER JOIN grade_report ON student.s_no=grade_report.g_stud_no INNER JOIN section ON grade_report.g_sec_identiy=section.s_identity INNER JOIN  course ON section.s_cno=course.c_no WHERE student.s_name='smith';

#4. List the names of students who took the section of the ‘Database’ course offered in fall2008andtheirgradesinthatsection.
SELECT student.s_name,grade_report.g_grade,course.c_name FROM student INNER JOIN grade_report ON student.s_no=grade_report.g_stud_no INNER JOIN section ON grade_report.g_sec_identiy=section.s_identity INNER JOIN  course ON section.s_cno=course.c_no WHERE course.c_name='Database' AND section.s_sem='fall' AND section.s_year='08';

#5. List the prerequisites of the ‘Database’ course.	
SELECT prerequisite.p_pre_no FROM prerequisite INNER JOIN course ON prerequisite.p_course_no=course.c_no WHERE course.c_name='Database';

#6. Retrieve the names of all senior students majoring in‘CS’(computerscience).
select s_name from student where s_major='CS' and s_class=4;

#7. Retrieve the names of all courses taught by Professor King in 2007 and 2008.
SELECT course.c_name FROM section INNER JOIN course ON section.s_cno=course.c_no WHERE section.s_instructor='king' AND section.s_year IN('07','08'); 

#8. For each section taught by Professor King, retrieve the course number,semester, year, and number of students who took the section
SELECT section.s_cno,section.s_sem,section.s_year,count(DISTINCT grade_report.g_stud_no) FROM section INNER JOIN grade_report ON grade_report.g_sec_identiy=section.s_identity WHERE section.s_instructor='king' GROUP BY grade_report.g_sec_identiy;

#9. Retrieve the name and transcript of each senior student (Class = 4)majoring in CS. A transcript includes course name, course number, credit hours, semester, year, and grade for each course completed by the student.
SELECT student.s_name,course.c_name,course.c_no,course.c_credit,section.s_sem,section.s_year,grade_report.g_grade FROM student INNER JOIN grade_report ON grade_report.g_stud_no=student.s_no INNER JOIN section ON section.s_identity=grade_report.g_sec_identiy INNER JOIN course ON course.c_no=section.s_cno WHERE student.s_class=4;

#10 Write SQL update statements to do the following on the database schema
#A.Insertanewstudent,<‘Johnson’,25,1,‘Math’>,inthedatabase.
INSERT INTO student VALUES(25,'johnson',1,'Math');		
SELECT * FROM student;
								
#B.Change th eclass of student ‘Smith’ t o2.
UPDATE student SET s_class=2 WHERE s_name='smith';
SELECT * FROM student;

#C.Insertanewcourse,<‘KnowledgeEngineering’,‘CS4390’,3,‘CS’>
INSERT INTO course VALUES('CS4390','KnowledgeEngineering',3,'cs');
SELECT * FROM course;

#D.Delete therecord forthestudentwhose nameis ‘Smith’and whosestudent number is17.
DELETE FROM student WHERE s_name='smith' AND s_no=17;
SELECT * FROM student;