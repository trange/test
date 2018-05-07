set names utf8;
set foreign_key_checks = 0;
drop database if exists ec;

create database if not exists ec;
use ec;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
update_date datetime
);

drop table if exists login_creator_transaction;

create table login_creator_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
update_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

drop table if exists creator_create_item_transaction;

create table creator_create_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

drop table if exists user_contact_transaction;

create table user_contact_transaction(
id int not null primary key auto_increment,
user_id varchar(30),
user_mell varchar(30),
user_contact varchar(255),
insert_date datetime,
update_date datetime
);
drop table if exists creator_contact_transaction;

create table creator_contact_transaction(
id int not null primary key auto_increment,
creator_id varchar(30),
creator_mell varchar(30),
creator_contact varchar(255),
insert_date datetime,
update_date datetime
);
