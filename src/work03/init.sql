create database mikey default charset utf8;
use mikey;
create table student(
    s_no int primary key auto_increment comment 'id',
    s_name char(20) comment '姓名',
    s_sex char(1) comment '性别：0:男  1：女',
    s_class char(30) comment '班级',
    s_birthday datetime comment '出生日期'
) default charset utf8;