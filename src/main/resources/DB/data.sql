INSERT INTO withboard.user (user_id, email, password, user_image, username)
VALUES (1, 'aaron@naver.com', '1111', 'https://www.ghibli.jp/gallery/totoro030.jpg', 'aaron'),
       (2, 'baron@naver.com', '2222', 'https://www.ghibli.jp/gallery/totoro031.jpg', 'baron'),
       (3, 'caron@naver.com', '3333', 'https://www.ghibli.jp/gallery/totoro032.jpg', 'caron'),
       (4, 'daron@naver.com', '4444', 'https://www.ghibli.jp/gallery/totoro033.jpg', 'daron'),
       (5, 'earon@naver.com', '5555', 'https://www.ghibli.jp/gallery/totoro034.jpg', 'earon');



INSERT INTO withboard.post (post_id, title, content, write_at)
VALUES (1, '완전 재미있어', '재미재미재미', '2023-04-01 12:00:00'),
       (2, '우와오앙', '우와와오아와왕', '2023-04-03 12:00:00'),
       (3, '집 보내줘', '집에 보내줘 집각고 싶어', '2023-04-05 12:00:00'),
       (4, '자고 싶어', '잠 자고 싶다', '2023-04-08 12:00:00'),
       (5, '졸려', '졸려졸려졸려졸려졸려', '2023-04-10 12:00:00'),
       (6, 'to완전 재미있어', '재미재미재미', '2023-04-01 12:00:00'),
       (7, 'to우와오앙', '우와와오아와왕', '2023-04-03 12:00:00'),
       (8, 'to집 보내줘', '집에 보내줘 집각고 싶어', '2023-04-05 12:00:00'),
       (9, 'to자고 싶어', '잠 자고 싶다', '2023-04-08 12:00:00'),
       (10, 't0졸려', '졸려졸려졸려졸려졸려', '2023-04-10 12:00:00');

INSERT INTO withboard.Affection_post (affection_post_id, user_id, post_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4),
       (5, 5, 5);


INSERT INTO withboard.spot_location(location_id, park_name, latitude, longitude, image_url, hotspot_address)
VALUES (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, 'https://lh3.googleusercontent.com/p/AF1QipOD0vFLhAUy1faBLSPyT1L6sdNd_q02m8dXMQXy=s1360-w1360-h1020','대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
       (2,'서울숲 스케이트파크', 37.54496, 127.042197, 'https://lh3.googleusercontent.com/p/AF1QipMzjLdHDXC1tlN2l31sDDVtKgFwe1gZGStA9cPx=s1360-w1360-h1020', '대한민국 서울특별시 성동구 뚝섬로 273 서울숲 스케이트파크'),
       (3,'광명대교 파크', 37.4850526, 126.8723223, 'https://lh3.googleusercontent.com/p/AF1QipN8hZJzmVXfgkeFvLctaxZpS16yf_fQPuhw99vb=s1360-w1360-h1020',  '대한민국 경기도 광명시 안양천로 광명대교'),
       (4,'뚝섬 X-GAME 장', 37.5294, 127.0715728, 'https://lh3.googleusercontent.com/p/AF1QipMKYbKxdAJib3VkUdg5LEsBza-3-cHEPMt575Ru=s1360-w1360-h1020' ,'대한민국 서울특별시 광진구 자양동 427-20'),
       (5,'난지 스케이트 파크', 37.5653239, 126.8792654, 'https://lh3.googleusercontent.com/p/AF1QipNdAkxs7AVcdLdqguk63-5S9FL0seHUntOSPXHQ=s1360-w1360-h1020', '대한민국 서울특별시 마포구 상암동 482-137'),
       (6,'엑스파크공원', 37.322683, 127.110304, 'https://lh3.googleusercontent.com/p/AF1QipNogxZq7VAneHnUrF79u9De9bJ2UzFZZ0w4Kmz7=s1360-w1360-h1020', '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크');

INSERT INTO withboard.together_post (together_post_id, capacity, user_id, spot_location_id, post_id)
VALUES (1, 6, 1, 1, 1),
       (2, 7, 2, 2, 3),
       (3, 8, 3, 3, 2),
       (4, 9, 4, 4, 4),
       (5, 10, 5, 5, 5);

INSERT INTO withboard.review(review_id, write_at, content, user_id, post_id)
VALUES (1,'2023-04-01 12:00:00','졸려졸려졸려',1, 1),
       (2,'2023-04-03 12:00:00','22222222',2, 2),
       (3,'2023-04-05 12:00:00','33333',3, 3),
       (4,'2023-04-07 12:00:00','44444',4, 4),
       (5,'2023-04-09 12:00:00','55555',5, 5);

INSERT INTO withboard.likes(like_id, post_id, user_id, like_status)
VALUES (1,1,1,true),
       (2,2,2,true),
       (3,3,3,true),
       (4,4,4,true),
       (5,5,5,true);

INSERT INTO withboard.image(image_id, post_id, image_url)
VALUES (1,1, 'https://img.danawa.com/prod_img/500000/716/865/img/32865716_1.jpg?shrink=330:*&_v=20240118150723'),
       (2,2, 'https://img.danawa.com/prod_img/500000/171/905/img/15905171_1.jpg?_v=20211210131729'),
       (3,3, 'https://img.danawa.com/prod_img/500000/103/318/img/16318103_1.jpg?shrink=330:*&_v=20220204124802'),
       (4,4, 'https://img.danawa.com/prod_img/500000/751/793/img/15793751_1.jpg?shrink=330:*&_v=20211126144658'),
       (5,5, 'https://img.danawa.com/prod_img/500000/677/416/img/13416677_1.jpg?shrink=330:*&_v=20211231114259');
