
create database expenseTracker;
use expenseTracker;
create table User(user_id int primary key auto_increment,name varchar(50) not null,username varchar(60) not null,email varchar(60) not null unique,password varchar(60) not null, phone_no varchar(20) not null,created_at timestamp default current_timestamp,updated_at timestamp default current_timestamp on update current_timestamp,active_yn int default 1);
create table Category(category_id int primary key auto_increment,user_id int not null, name varchar(20) not null,description varchar(100)not null,icon_url varchar(300), type enum('income','expense') not null default 'expense',created_at timestamp default current_timestamp,updated_at timestamp default current_timestamp on update current_timestamp,active_yn int default 1, foreign key(user_id) references User(user_id) on delete cascade);
-- transaction type is incoming or expense(outgoing) ,transaction_type varchar(20)
create table Transaction(transaction_id int primary key auto_increment, user_id int not null,amount decimal(10,2) not null,category_id int not null,transaction_date date not null,notes varchar(100),created_at timestamp default current_timestamp,updated_at timestamp default current_timestamp on update current_timestamp,active_yn int default 1, foreign key(user_id) references User(user_id) on delete cascade, foreign key(category_id) references Category(category_id) on delete set null);

insert into Users(name,username,email,password,phone_no) values("Arzoo","this.too.is.zoo","arzoo@gmail.com","arz","9175627282");
INSERT INTO Categories(user_id, name, description)
VALUES (1, 'Shopping', 'General shopping expenses');
INSERT INTO Transactions(user_id, amount, category_id, transaction_date, notes)
VALUES (1, 50.00, 1, CURRENT_DATE(), 'Weekly groceries');

ALTER TABLE User RENAME TO Users;
ALTER TABLE Category RENAME TO Categories;
ALTER TABLE Transaction RENAME TO Transactions;



