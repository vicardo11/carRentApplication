CREATE TABLE IF NOT EXISTS users(
	userId INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(255) NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS cars(
	carId INT AUTO_INCREMENT PRIMARY KEY,
    manufacturer VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS carDetails(
	carId INT NOT NULL,
    engineCapacity DOUBLE NOT NULL,
    productionYear INT NOT NULL,
    horsePower INT NOT NULL,
    gearboxType ENUM('manual', 'automatic') NOT NULL,
	numberOfDoor SMALLINT NOT NULL,
    axleDrive ENUM('front', 'rear', '4x4') NOT NULL,
    avgFuelUsage DOUBLE NOT NULL,
    trunkCapacity DOUBLE NOT NULL,
    FOREIGN KEY (carId) REFERENCES cars(carId)
);

CREATE TABLE IF NOT EXISTS reservations(
	reservationId INT AUTO_INCREMENT PRIMARY KEY,
    startingDateOfReservation DATETIME NOT NULL,
    endingDateOfReservation DATETIME NOT NULL,
	carId INT NOT NULL,
   FOREIGN KEY (carId) REFERENCES cars(carId)
);

CREATE TABLE IF NOT EXISTS users_reservations(
	userId INT NOT NULL,
    reservationId INT NOT NULL,
    FOREIGN KEY(userId) REFERENCES users(userId),
    FOREIGN KEY(reservationId) REFERENCES reservations(reservationId),
    PRIMARY KEY(userId, reservationId)
);