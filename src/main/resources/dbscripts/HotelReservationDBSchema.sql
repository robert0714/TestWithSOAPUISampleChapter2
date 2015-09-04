DROP TABLE IF EXISTS GUEST_T;
DROP TABLE IF EXISTS ROOM_TT;
DROP TABLE IF EXISTS RESERVATION_T;

CREATE TABLE IF NOT EXISTS GUEST_T(
            name VARCHAR(100) NOT NULL, 
			address VARCHAR(200), 
			age INT NOT NULL, 
			PRIMARY KEY(name));
			
CREATE TABLE IF NOT EXISTS ROOM_T(
			room_number INT NOT NULL, 
			room_type VARCHAR(100) NOT NULL, 
			room_size varchar(100) NOT NULL, 
			PRIMARY KEY(room_number));

CREATE TABLE IF NOT EXISTS RESERVATION_T(
			res_id INT NOT NULL AUTO_INCREMENT, 
			guest_name VARCHAR(100) NOT NULL, 
			room_no INT NOT NULL, 
			reserved_from DATE NOT NULL, 
			reserved_to DATE NOT NULL, 
			PRIMARY KEY(res_id), 
			FOREIGN KEY(guest_name) references GUEST_T(name),
			FOREIGN KEY(room_no) references ROOM_T(room_number));
