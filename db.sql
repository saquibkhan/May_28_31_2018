create database intuit_training;
use intuit_training;

create table persons(id int(4) auto_increment primary key not null,
first_name varchar(40),
last_name varchar(40),
age int(5));


























@PropertySource("classpath:config/config.properties")
<context:property-placeholder location="classpath:application.properties" />
