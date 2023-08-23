INSERT INTO users (username, password, enabled)
VALUES ('user', '$2a$10$Fpr05pE9ioWEb3spBvoUR.Bi/ThGEpD0S4G5zMHYFJAdh.48oBye6', true);

INSERT INTO authorities (username, authority)
VALUES ('user', 'ROLE_USER');
