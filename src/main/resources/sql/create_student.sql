use StudentManagementSys;

drop table if exists `student`;
create table `student`(
    id int primary key auto_increment,
    sno varchar(16) unique not null,
    name varchar(16) not null,
    class_name varchar(32),
    gender tinyint unsigned default 1 comment '0:female 1:male',
    entry_date date,
    contact varchar(16),
    address varchar(128),
    status tinyint unsigned comment '0:deleted 1:normal',
    create_time datetime,
    update_time datetime,
    index idx_student_class_name(class_name)
)engine=innodb default charset=utf8mb4;

insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20232672','宋杰','102',1,'1986-02-20','13543698895','新疆维吾尔自治区 吐鲁番地区 其它区','1','1979-05-14 14:36:55','2021-12-26 16:43:07');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20232882','杨桂英','101',1,'2004-02-13','13518933555','海南省 三亚市 -','1','1985-04-09 01:00:36','2020-08-14 10:56:57');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20236353','常涛','101',1,'1984-10-17','18914312461','山东省 烟台市 福山区','1','1977-03-27 10:48:12','2008-01-20 00:47:53');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20232007','康超','203',1,'1995-01-24','13515480569','河南省 安阳市 滑县','1','1974-10-16 20:35:28','1996-07-22 02:09:50');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20237092','沈秀英','201',1,'2009-10-22','13514811591','澳门特别行政区 离岛 -','1','1988-12-30 17:03:30','1985-03-21 00:03:11');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20238555','廖超','301',0,'1994-01-05','18921795245','湖南省 邵阳市 大祥区','1','1970-10-21 00:22:53','1993-05-30 17:10:00');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20236814','彭娟','302',0,'1997-10-29','13244903151','宁夏回族自治区 石嘴山市 平罗县','1','1987-02-01 03:16:11','1982-07-20 05:43:57');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20238882','魏娜','202',0,'1971-12-16','13560351371','上海 上海市 长宁区','1','1994-10-18 06:04:28','2022-06-10 13:25:33');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20234718','蒋霞','102',0,'2007-11-04','18945974794','安徽省 阜阳市 其它区','1','1997-12-12 02:49:30','1999-12-04 18:50:05');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20234502','曾磊','301',1,'2007-08-21','13232228439','宁夏回族自治区 吴忠市 红寺堡区','1','2003-04-25 05:39:53','2017-01-11 12:22:57');

insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20236482','姚娟','101','0','2019-05-01','13508246466','天津 天津市 西青区','1','1986-02-18 10:53:53','2006-01-06 08:01:36');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20232125','乔伟','301','0','2002-04-23','18934472428','陕西省 榆林市 神木县','1','1975-12-06 07:58:45','1980-01-23 12:08:50');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20234559','唐秀英','302','1','2019-04-11','18932854480','广西壮族自治区 柳州市 鹿寨县','1','1988-08-19 06:47:56','2019-06-01 06:56:47');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20237152','黎洋','303','1','1991-05-25','13536557871','台湾 台南市 山上区','1','2008-07-26 07:04:39','1975-10-27 05:54:24');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20237786','高超','203','0','1984-08-13','13551114236','香港特别行政区 九龙 油尖旺区','1','2007-10-17 20:44:30','2012-06-05 12:34:45');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20230223','戴军','202','1','2007-08-26','13551833974','山西省 阳泉市 盂县','1','1976-08-09 13:21:07','2020-01-24 23:04:07');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20234996','林丽','201','0','1990-03-04','13515421267','福建省 南平市 建阳市','1','2017-05-30 23:33:58','2001-08-26 09:26:28');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20231723','郭勇','204','1','1996-08-20','13288887847','安徽省 亳州市 利辛县','1','2000-08-04 11:57:12','1973-08-23 18:42:24');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20231540','谢艳','204','0','1989-06-28','18975797820','北京 北京市 通州区','1','2021-05-19 05:05:39','1995-05-22 02:15:23');
insert into `student` (`id`,`sno`,`name`,`class_name`,`gender`,`entry_date`,`contact`,`address`,`status`,`create_time`,`update_time`) value (null,'20230341','黎杰','204','1','2014-12-26','18975648378','江西省 鹰潭市 余江县','1','2016-12-02 14:13:19','1990-12-04 02:16:00');
