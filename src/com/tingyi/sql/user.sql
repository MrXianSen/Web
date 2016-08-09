--create user table--
CREATE TABLE user(id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
				  name VARCHAR(32) NOT NULL,
				  age INT default 0);