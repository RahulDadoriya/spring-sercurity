-- encode password is 123456
insert into customers(username, password) values("pankaj", "$2a$10$XVdzRCi5g574cmRAsYs5AeB1wKt6xTN1l1kAkZBhtYCns7QacwSxq");
insert into customers(username, password) values("sankaj", "$2a$10$XVdzRCi5g574cmRAsYs5AeB1wKt6xTN1l1kAkZBhtYCns7QacwSxq");
insert into customers(username, password) values("rankaj", "$2a$10$XVdzRCi5g574cmRAsYs5AeB1wKt6xTN1l1kAkZBhtYCns7QacwSxq");


insert into roles(username, authority) values("pankaj", "ROLE_ADMIN");
insert into roles(username, authority) values("sankaj", "ROLE_USER");
insert into roles(username, authority) values("rankaj", "ROLE_USER");