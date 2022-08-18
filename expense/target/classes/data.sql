insert into customer (CUSTOMER_ID, NAME ,EMAIL) values (1,'Sianak','Codeengine11@gmail.com')
insert into customer (CUSTOMER_ID, NAME ,EMAIL) values (2,'John','John@john.com')
insert into customer (CUSTOMER_ID, NAME ,EMAIL) values (3,'Adam','Adam@adam.com')

insert into category (CATEGORY_ID, NAME) values (1,'Travel')
insert into category (CATEGORY_ID, NAME) values (2,'Auto Loan')
insert into category (CATEGORY_ID, NAME) values (3,'Student Loan')


insert into expense (EXPENSE_ID, EXPENSE_DATE ,DESCRIPT, CUSTOMER_ID,CATEGORY_ID) values (100, '2019-06-16T17:00:00.000Z', 'New York',1,1)
insert into expense (EXPENSE_ID, EXPENSE_DATE ,DESCRIPT, CUSTOMER_ID,CATEGORY_ID) values (101, '2019-06-16T15:00:00.000Z', 'Ford Mustang',2,2)
insert into expense (EXPENSE_ID, EXPENSE_DATE ,DESCRIPT, CUSTOMER_ID,CATEGORY_ID) values (102, '2019-06-15T13:00:00.000Z', 'Grand Canyon',3,1)