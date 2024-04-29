INSERT INTO users (email, password) VALUES ('user@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;
INSERT INTO users (email, password) VALUES ('user1@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;
INSERT INTO users (email, password) VALUES ('user2@example.com', '123456')
ON DUPLICATE KEY UPDATE email = email;
INSERT IGNORE INTO activities (name, price_per_hour, description) VALUES
                                                                      ('Basketball', 10.00, 'Enjoy a game of basketball with friends.'),
                                                                      ('Badminton', 8.00, 'Play badminton and improve your skills.'),
                                                                      ('Fitness Center', 15.00, 'Work out in our fully equipped fitness center.'),
                                                                      ('Table Tennis', 6.00, 'Have fun playing table tennis with family.'),
                                                                      ('Golf', 20.00, 'Hit the golf course and practice your swing.'),
                                                                      ('Billiards', 12.00, 'Relax and play billiards with friends.');
INSERT IGNORE INTO admins (username, password, email) VALUES
                                                          ('admin1', 'admin123', 'admin1@example.com'),
                                                          ('admin2', 'admin456', 'admin2@example.com'),
                                                          ('admin3', 'admin789', 'admin3@example.com');
INSERT IGNORE INTO orders (activity_name, total_hours, customer, status) VALUES
                                                                             ('Basketball', 2, 'John Doe', '未消费'),
                                                                             ('Badminton', 3, 'Jane Smith', '未消费'),
                                                                             ('Fitness Center', 1, 'Alice Johnson', '未消费'),
                                                                             ('Table Tennis', 2, 'Bob Brown', '未消费'),
                                                                             ('Golf', 4, 'Charlie Wilson', '未消费'),
                                                                             ('Billiards', 2, 'David Lee', '未消费');
