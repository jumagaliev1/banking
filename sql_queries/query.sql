DROP DATABASE IS EXISTS bankapp;
CREATE DATABASE bankapp;

USE bankapp;

-- users table structure;
create table users (
	user_id INT not null auto_increment primary key,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	email varchar(255) not null unique,
	password varchar(255) not null, 
	token varchar(255) null,
	code int null,
	verified int default 0,
	verified_at datetime,
	created_at timestamp,
	updated_at timestamp default now()
);

-- Bank Account
create table accounts(
	account_id int not null auto_increment primary key,
	user_id int,
	account_number varchar(100) not null,
	account_name varchar(50) not null,
	account_type varchar(50) not null,
	balance decimal(10,2) default 0.00,
	created_at timestamp,
	updated_at timestamp default now(),
	foreign key(user_id) references users(user_id) on delete cascade
);

-- Transaction history table;
create table transaction_history (
	transaction_id int not null auto_increment primary key, 
	account_id int,
	transaction_type varchar(50) not null,
	amount decimal(10,2),
	source varchar(50) null,
	status varchar(50) null,
	reason_code varchar(100) null,
	created_at timestamp,
	foreign key(account_id) references accounts(account_id) on delete cascade	
	);
	
-- payments table structure;
create table payments (
	payment_id int not null auto_increment primary key,
	account_id int, 
	beneficiary varchar(50) null,
	beneficiary_acc_no varchar(255) null,
	amount decimal(10,2) null,
	reference_no varchar(100) null,
	status varchar(50) null,
	reason_code varchar(100) null,
	created_at timestamp,
	foreign key(account_id) references accounts(account_id) on delete cascade
);


-- Transaction history view:
select
	t.tranaction_id,






