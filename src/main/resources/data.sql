INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ( 'HTML', 'https://media.istockphoto.com/id/1353769234/photo/training-and-skill-development-concept-with-icons-of-online-course-conference-seminar-webinar.jpg?b=1&s=170667a&w=0&k=20&c=Xvgely4jk8x3zPHifnzlsDg4Ou26QtH424SYrMfIbNo=', 'https://cdn4.vectorstock.com/i/1000x1000/71/08/online-course-icon-black-sign-vector-35237108.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ( 'CSS', 'https://media.istockphoto.com/id/1353769234/photo/training-and-skill-development-concept-with-icons-of-online-course-conference-seminar-webinar.jpg?b=1&s=170667a&w=0&k=20&c=Xvgely4jk8x3zPHifnzlsDg4Ou26QtH424SYrMfIbNo=', 'https://cdn4.vectorstock.com/i/1000x1000/71/08/online-course-icon-black-sign-vector-35237108.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ( 'Java', 'https://media.istockphoto.com/id/1353769234/photo/training-and-skill-development-concept-with-icons-of-online-course-conference-seminar-webinar.jpg?b=1&s=170667a&w=0&k=20&c=Xvgely4jk8x3zPHifnzlsDg4Ou26QtH424SYrMfIbNo=', 'https://cdn4.vectorstock.com/i/1000x1000/71/08/online-course-icon-black-sign-vector-35237108.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ( 'C#', 'https://media.istockphoto.com/id/1353769234/photo/training-and-skill-development-concept-with-icons-of-online-course-conference-seminar-webinar.jpg?b=1&s=170667a&w=0&k=20&c=Xvgely4jk8x3zPHifnzlsDg4Ou26QtH424SYrMfIbNo=', 'https://cdn4.vectorstock.com/i/1000x1000/71/08/online-course-icon-black-sign-vector-35237108.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ( 'PHP', 'https://media.istockphoto.com/id/1353769234/photo/training-and-skill-development-concept-with-icons-of-online-course-conference-seminar-webinar.jpg?b=1&s=170667a&w=0&k=20&c=Xvgely4jk8x3zPHifnzlsDg4Ou26QtH424SYrMfIbNo=', 'https://cdn4.vectorstock.com/i/1000x1000/71/08/online-course-icon-black-sign-vector-35237108.jpg');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-02-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-20T03:00:00', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-03-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-03-20T03:00:00', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('3.0', TIMESTAMP WITH TIME ZONE '2023-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-20T03:00:00', 1);

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-02-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-20T03:00:00', 2);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-03-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-03-20T03:00:00', 2);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('3.0', TIMESTAMP WITH TIME ZONE '2023-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-20T03:00:00', 2);

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-02-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-20T03:00:00', 3);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-03-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-03-20T03:00:00', 3);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('3.0', TIMESTAMP WITH TIME ZONE '2023-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-20T03:00:00', 3);

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-02-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-20T03:00:00', 4);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-03-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-03-20T03:00:00', 4);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('3.0', TIMESTAMP WITH TIME ZONE '2023-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-20T03:00:00', 4);

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-02-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-20T03:00:00', 5);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-03-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-03-20T03:00:00', 5);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('3.0', TIMESTAMP WITH TIME ZONE '2023-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-04-20T03:00:00', 5);
