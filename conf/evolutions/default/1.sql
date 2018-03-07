# DC schema

# --- !Ups
CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(128) NOT NULL,
  email varchar(128) NOT NULL,
  password varchar(128) NOT NULL,
  created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE KEY users_email_uniq_1 (email),
  PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE users;
