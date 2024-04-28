INSERT INTO users (email, password) VALUES ('user@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;
INSERT INTO users (email, password) VALUES ('user1@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;
INSERT INTO users (email, password) VALUES ('user2@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;