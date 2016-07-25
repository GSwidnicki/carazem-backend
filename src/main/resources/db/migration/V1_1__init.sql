CREATE TABLE users
(
id BIGSERIAL,
email VARCHAR (50) UNIQUE NOT NULL,
password VARCHAR (50) NOT NULL,
first_name VARCHAR (50),
second_name VARCHAR (50),
phone_number VARCHAR (50),
hometown VARCHAR (50),
birth_date DATE,
description VARCHAR (255),
car_model VARCHAR (50),
photo_url VARCHAR (50),
PRIMARY KEY (id)
);

CREATE TABLE rides
(
id BIGSERIAL,
city_from VARCHAR (50) NOT NULL,
city_to VARCHAR (50) NOT NULL,
ride_date DATE NOT NULL,
driver_id INT NOT NULL,
seats INT NOT NULL,
price BIGINT NOT NULL,
description VARCHAR(1000),
PRIMARY KEY (id),
FOREIGN KEY (driver_id) REFERENCES users (id)
);

CREATE TABLE user_ride
(
ride_id BIGINT NOT NULL,
passanger_id BIGINT NOT NULL,
PRIMARY KEY (ride_id, passanger_id),
FOREIGN KEY (ride_id) REFERENCES rides(id) ON DELETE CASCADE,
FOREIGN KEY (passanger_id) REFERENCES users(id) ON DELETE CASCADE
);