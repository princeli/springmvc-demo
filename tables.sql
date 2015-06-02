Create DATABASE spring4_mybatis3;
USE spring4_mybatis3;

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  name varchar(30) DEFAULT NULL,
  password varchar(30) DEFAULT NULL,
  birthday date DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_student;
CREATE TABLE `t_student` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dateOfBirth` date NOT NULL,
  `emailAddress` VARCHAR(255) NOT NULL,
  `firstName` VARCHAR(255) NOT NULL,
  `lastName` VARCHAR(255) NOT NULL,
  `password` VARCHAR(8) NOT NULL,
  `userName` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;