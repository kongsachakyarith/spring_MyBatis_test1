create table if not exists books(
    id serial primary key not null,
    title varchar(50) not null,
    description varchar(255) not null

);
create table if not exists categories(
    id serial primary key not null,
    name varchar(100) not null
);
create table authors(
    id serial primary key not null,
    name varchar(100) not null,
    gender varchar(10) not null

)


