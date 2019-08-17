create table company (id bigserial not null, name varchar(255), primary key (id));
create table employee (id bigserial not null, last_name varchar(255), name varchar(255), company_id int8, primary key (id));
alter table employee add constraint FK5v50ed2bjh60n1gc7ifuxmgf4 foreign key (company_id) references company;