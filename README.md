# task
1.Setup a local database, create a table, insert some records using any database client 

Setting up a local database name jay_employee,

mysql> create database jay_employee;

Query OK, 1 row affected (0.12 sec)

![image](https://user-images.githubusercontent.com/70746268/117570192-c50f1a00-b0e6-11eb-936c-9c9bccf13f14.png)


Creating a table,

mysql> create table employee(EmpID varchar(255),Ename varchar(255),DeptID int ,Salary varchar(255),Dname varchar(255),Dlocation varchar(255));

Query OK, 0 rows affected (1.58 sec) 

![image](https://user-images.githubusercontent.com/70746268/117570247-ee2faa80-b0e6-11eb-89f8-3beb68ff5c7c.png)


Inserting records,

mysql> insert into employee values('1001','JAYGANESH','2','50000','IT','NEW DELHI');

Query OK, 1 row affected (0.18 sec)

![image](https://user-images.githubusercontent.com/70746268/117570265-fd165d00-b0e6-11eb-88cc-36768b1b65e7.png)


2.Write SQL to insert and retrieve records from the above table using the same database client 

Inserting records,

mysql> insert into employee values('1002','RUSHILKUMAR','1','40000','HR','MUMBAI');

Query OK, 1 row affected (0.18 sec)

mysql> insert into employee values('1003','SHARUKANMANI','3','30000','FINANCE','MUMBAI');

Query OK, 1 row affected (0.11 sec)

![image](https://user-images.githubusercontent.com/70746268/117570311-35b63680-b0e7-11eb-8718-ae212392cb38.png)


Retriving records,

mysql> select * from employee;

+-------+--------------+--------+--------+---------+-----------+

| EmpID | Ename        | DeptID | Salary | Dname   | Dlocation |

+-------+--------------+--------+--------+---------+-----------+

| 1001  | JAYGANESH    |      2 | 50000  | IT      | NEW DELHI |

| 1002  | RUSHILKUMAR  |      1 | 40000  | HR      | MUMBAI    |

| 1003  | SHARUKANMANI |      3 | 30000  | FINANCE | MUMBAI    |

+-------+--------------+--------+--------+---------+-----------+

3 rows in set (0.01 sec)

mysql> select EmpID,Ename from employee where Dname='IT';

+-------+-----------+

| EmpID | Ename     |

+-------+-----------+

| 1001  | JAYGANESH |

+-------+-----------+

1 row in set (0.00 sec)

Again inserting ,

mysql> insert into employee values('1004','revathy','3','30000','FINANCE','MUMBAI');

Query OK, 1 row affected (0.11 sec)

Again retriving ,

mysql> select * from employee;

+-------+--------------+--------+--------+---------+-----------+

| EmpID | Ename        | DeptID | Salary | Dname   | Dlocation |

+-------+--------------+--------+--------+---------+-----------+

| 1001  | JAYGANESH    |      2 | 50000  | IT      | NEW DELHI |

| 1002  | RUSHILKUMAR  |      1 | 40000  | HR      | MUMBAI    |

| 1003  | SHARUKANMANI |      3 | 30000  | FINANCE | MUMBAI    |

| 1004  | revathy      |      3 | 30000  | FINANCE | MUMBAI    |

+-------+--------------+--------+--------+---------+-----------+

4 rows in set (0.00 sec)


mysql> select Ename from employee where Salary>=35000;

+-------------+

| Ename       |

+-------------+

| JAYGANESH   |

| RUSHILKUMAR |

+-------------+

2 rows in set (0.03 sec)

mysql> select * from employee where Salary>=35000;

+-------+-------------+--------+--------+-------+-----------+

| EmpID | Ename       | DeptID | Salary | Dname | Dlocation |

+-------+-------------+--------+--------+-------+-----------+

| 1001  | JAYGANESH   |      2 | 50000  | IT    | NEW DELHI |

| 1002  | RUSHILKUMAR |      1 | 40000  | HR    | MUMBAI    |

+-------+-------------+--------+--------+-------+-----------+

2 rows in set (0.00 sec)

mysql> select * from employee where DeptID=3;

+-------+--------------+--------+--------+---------+-----------+

| EmpID | Ename        | DeptID | Salary | Dname   | Dlocation |

+-------+--------------+--------+--------+---------+-----------+

| 1003  | SHARUKANMANI |      3 | 30000  | FINANCE | MUMBAI    |

| 1004  | revathy      |      3 | 30000  | FINANCE | MUMBAI    |

+-------+--------------+--------+--------+---------+-----------+

2 rows in set (0.00 sec)


mysql> select EmpID,Ename from employee where Dlocation='MUMBAI';

+-------+--------------+

| EmpID | Ename        |

+-------+--------------+

| 1002  | RUSHILKUMAR  |

| 1003  | SHARUKANMANI |

| 1004  | revathy      |

+-------+--------------+

3 rows in set (0.00 sec)

![image](https://user-images.githubusercontent.com/70746268/117570358-66966b80-b0e7-11eb-83c9-8364983ff644.png)

![image](https://user-images.githubusercontent.com/70746268/117570402-8af24800-b0e7-11eb-90a0-905da792b905.png)

![image](https://user-images.githubusercontent.com/70746268/117570426-a78e8000-b0e7-11eb-9bbc-953861c8492b.png)


3.Write java code to insert and retrieve the records from the database table. 

a)Connecting Mysql using Java,
db_conn.java 
![image](https://user-images.githubusercontent.com/70746268/117570626-8d08d680-b0e8-11eb-9730-a6628f3aa4aa.png)

b)Inserting record,
insert.java
![image](https://user-images.githubusercontent.com/70746268/117572531-ec6ae480-b0f0-11eb-8eed-ff200339a671.png)

c)Retriving record,
retrive.java
![image](https://user-images.githubusercontent.com/70746268/117571315-ae1ef680-b0eb-11eb-9a44-a02e61c96c42.png)

d)Updating record,

update.java
![image](https://user-images.githubusercontent.com/70746268/117571431-2b4a6b80-b0ec-11eb-8a2d-2b340cdc8f72.png)

updated table ,
![image](https://user-images.githubusercontent.com/70746268/117571466-559c2900-b0ec-11eb-9a05-b1c548d72b77.png)


4.Create a REST API in JAVA to insert and retrieve the same records.

pom.xml file
![image](https://user-images.githubusercontent.com/70746268/117571872-05be6180-b0ee-11eb-8726-7c0ec71d6230.png)

Application.java
![image](https://user-images.githubusercontent.com/70746268/117571905-2981a780-b0ee-11eb-90a5-d791edb476f8.png)

application.properties
![image](https://user-images.githubusercontent.com/70746268/117571919-428a5880-b0ee-11eb-97f0-e480cf7414fa.png)

employee.java
![image](https://user-images.githubusercontent.com/70746268/117571973-78c7d800-b0ee-11eb-8cd6-a4d9d784b0c2.png)
![image](https://user-images.githubusercontent.com/70746268/117571979-80877c80-b0ee-11eb-9557-5a95fc9c7c3b.png)

employeeRepository.java
![image](https://user-images.githubusercontent.com/70746268/117571996-909f5c00-b0ee-11eb-92f2-a62823ae5008.png)

employeeService.java
![image](https://user-images.githubusercontent.com/70746268/117572025-a4e35900-b0ee-11eb-9f9d-d9c5c39223a5.png)

employeeController.java
![image](https://user-images.githubusercontent.com/70746268/117572069-d1977080-b0ee-11eb-9d7a-a835f9ad652e.png)

Output I got ,
While running the Application, I got Apllication run failed .
![image](https://user-images.githubusercontent.com/70746268/117572099-f7247a00-b0ee-11eb-8bbc-84c3e553eaa8.png)
![image](https://user-images.githubusercontent.com/70746268/117572131-1ae7c000-b0ef-11eb-868a-e360e1a372f5.png)





