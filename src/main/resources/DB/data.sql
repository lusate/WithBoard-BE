INSERT INTO user (id, email, pw, profile_image_url, user_name)
VALUES (1, 'aaron@naver.com', '1111', 'https://www.ghibli.jp/gallery/totoro030.jpg', 'aaron'),
       (2, 'baron@naver.com', '2222', 'https://www.ghibli.jp/gallery/totoro031.jpg', 'baron'),
       (3, 'caron@naver.com', '333', 'https://www.ghibli.jp/gallery/totoro032.jpg', 'caron'),
       (4, 'daron@naver.com', '4444', 'https://www.ghibli.jp/gallery/totoro033.jpg', 'daron'),
       (5, 'earon@naver.com', '5555', 'https://www.ghibli.jp/gallery/totoro034.jpg', 'earon');

INSERT INTO affectionPost (affection_post_id, user_id, post_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4),
       (5, 5, 5);

INSERT INTO post (post_id, title, content, write_at)
VALUES (1, '완전', '', '2023-04-01 12:00:00'),
       (2, '', '', '2023-04-03 12:00:00'),
       (3, '', '', '2023-04-05 12:00:00'),
       (4, '', '', '2023-04-08 12:00:00'),
       (5, '', '', '2023-04-10 12:00:00');


INSERT INTO location (lociation_id, parkname, latitude, longitude, image_url, hotspot_address)
VALUES (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
       (2,'서울숲 스케이트파크', 37.54496, 127.042197, '대한민국 서울특별시 성동구 뚝섬로 273 서울숲 스케이트파크'),
       (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
       (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
       (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
       (1,'한강 이촌 스케이트 파크', 37.519351, 126.966194, '대한민국 서울특별시 용산구 이촌동 370-2 한강 이촌 스케이트 파크'),
