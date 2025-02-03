CREATE table stocks (
    id bigint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name varchar(255) NOT NULL,
    open_date date NOT NULL,
    close_date date,
    volume double precision NOT NULL,
    open_price double precision NOT NULL,
    close_price double precision,
    open_value double precision,
    close_value double precision,
    duration int,
    duration_unit varchar(45),
    return double precision
);