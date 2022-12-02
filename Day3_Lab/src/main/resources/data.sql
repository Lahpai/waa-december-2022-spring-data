-- Data for Category
insert into Category (id, name) values (1,'iphone');
insert into Category (id, name) values (2,'Laptop');

--Data for Product
insert into product(id, name, price, rating, category_id) values (1, 'iPhone 14', 700, 3, 1);
insert into product(id, name, price, rating, category_id) values (2, 'iPhone 14 Plus', 800, 3, 1);

--Data for User
insert into User(id, email, password, firstName, lastName) values (1, 'dave@gmail.com', 123, David, DeGea);
insert into User(id, email, password, firstName, lastName) values (1, 'burno@gmail.com', 456, Burno, Fernandez);

--Data for Address
insert into Address(id,street, zip, city) values (1, '1Street', '147', 'Fairfield');
insert into Address(id,street, zip, city) values (2, '2Street', '258', 'Fairfield');

--Data for Review
insert into Review(id,comment) values (1, 'good');
insert into Review(id,comment) values (2, 'average');