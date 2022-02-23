CREATE DATABASE academy;

USE academy;

CREATE TABLE USER (
  `idUSER` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `socialNumber` VARCHAR(10) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `zipCode` VARCHAR(6) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUSER`));

  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('1', 'raul.io', 'Raul', 'Garcia', '12345678', 'Calle 1', '700012', 'Cali', 'Valle', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('2', 'mario.io', 'Mario', 'Sanchez', '23456789', 'Calle 2', '700013', 'Medellin', 'Antioquia', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('3', 'maria.io', 'Maria', 'Blanco', '34567891', 'Calle 3', '700014', 'Bogota', 'Cundinamarca', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('4', 'juan.io', 'Juan', 'Gutierrez', '45678910', 'Calle 4', '700015', 'Barranquilla', 'Atlantico', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('5', 'sebastian.io', 'Sebastian', 'Piña', '56789101', 'Calle 5', '700016', 'Cali', 'Valle', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('6', 'carlos.io', 'Carlos', 'Meza', '67891011', 'Carrera 1', '700017', 'Medellin', 'Antioquia', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('7', 'xavier.io', 'Xavier', 'Conrado', '78910111', 'Carrera 2', '700018', 'Bogota', 'Cundinamarca', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('8', 'esteban.io', 'Esteban', 'Jurado', '89101112', 'Carrera 3', '700019', 'Barranquilla', 'Atlantico', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('9', 'pedro.io', 'Pedro', 'Diez', '91011121', 'Carrera 4', '700020', 'Cali', 'Valle', 'Colombia');
  INSERT INTO USER (`idUSER`, `username`, `name`, `lastName`, `socialNumber`, `address`, `zipCode`, `city`, `state`, `country`) VALUES ('10', 'mariana.io', 'Mariana', 'Diaz', '10111213', 'Carrera 5', '700021', 'Medellin', 'Antioquia', 'Colombia');
