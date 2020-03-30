create database products;
use products;
create table products(
    product_id smallint unsigned not null auto_increment,
    product_name varchar(255) not null,
    product_price decimal(13,2),
    product_price_interest decimal(13,2),
    product_update_timestamp timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    constraint pk_products primary key (product_id));
insert into products(product_name,product_price,product_price_interest) values ('product one', 10.1, 0.1);
insert into products(product_name,product_price,product_price_interest) values ('product two', 20.2, 0.2);
select * from products;
create table reviews(
    review_id smallint unsigned not null auto_increment,
    review_product_id smallint unsigned not null,
    review_text varchar(2550) not null,
    review_update_timestamp timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    constraint pk_reviews primary key (review_id),
    FOREIGN KEY (review_product_id)
            REFERENCES products(product_id)
            ON DELETE CASCADE
    );
insert into reviews(review_text, review_product_id) values ('my review on product two', 2);
select * from reviews;
commit;