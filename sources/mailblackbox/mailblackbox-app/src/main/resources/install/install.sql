CREATE TABLE command (
  uid     VARCHAR(255) PRIMARY KEY,
  class   VARCHAR(255),
  object  TEXT,
  state   VARCHAR(255),
  created TIMESTAMP,
  updated TIMESTAMP
);

CREATE TABLE command_history (
  id          INT AUTO_INCREMENT PRIMARY KEY,
  command_uid VARCHAR(255),
  state       VARCHAR(255),
  occured     TIMESTAMP
);

CREATE TABLE installation (
  id INT AUTO_INCREMENT PRIMARY KEY ,
  version VARCHAR(255),
  installed TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO installation (version) VALUES ("1.0");
