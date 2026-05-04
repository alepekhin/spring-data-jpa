drop table if exists users;
create table users (id int primary key, name text, salary int);
insert into users(id, name, salary) values (1, 'Alice', 1000);
insert into users(id, name, salary) values (2, 'Bob', 2000);

