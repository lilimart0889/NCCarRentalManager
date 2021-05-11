-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Sistema
-- -----------------------------------------------------
-- Modelo de administracion de usuarios para renta de coches
DROP SCHEMA IF EXISTS `Sistema` ;

-- -----------------------------------------------------
-- Schema Sistema
--
-- Modelo de administracion de usuarios para renta de coches
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Sistema` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `Sistema` ;

-- -----------------------------------------------------
-- Table `Sistema`.`USERS_GUEST`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Sistema`.`USERS_GUEST` ;

CREATE TABLE IF NOT EXISTS `Sistema`.`USERS_GUEST` (
  `ID_USER_GUEST` INT(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` VARCHAR(60) NOT NULL,
  `LAST_NAME` VARCHAR(60) NOT NULL,
  `AGE` VARCHAR(6) NOT NULL,
  `RESIDENCE` VARCHAR(60) NOT NULL,
  `PHONE_NUMBER` VARCHAR(15) NOT NULL,
  `EMAIL` VARCHAR(320) NOT NULL,
  PRIMARY KEY (`ID_USER_GUEST`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Sistema`.`GAMMA_VEHICLES`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Sistema`.`GAMMA_VEHICLES` ;

CREATE TABLE IF NOT EXISTS `Sistema`.`GAMMA_VEHICLES` (
  `ID_GAMA_VEHICLES` VARCHAR(45) NOT NULL,
  `DESCRIPTION` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`ID_GAMA_VEHICLES`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Sistema`.`VEHICLES`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Sistema`.`VEHICLES` ;

CREATE TABLE IF NOT EXISTS `Sistema`.`VEHICLES` (
  `NUMBER_PLATE` INT(11) NOT NULL AUTO_INCREMENT,
  `BRAND` VARCHAR(45) NULL,
  `ID_GAMA_VEHICLES` VARCHAR(45) NOT NULL,
  `MODEL` VARCHAR(45) NULL,
  `TRANSMISSION` VARCHAR(45) NULL,
  `SEATS_CAPACITY` INT NULL,
  `PRICE` FLOAT NOT NULL,
  PRIMARY KEY (`NUMBER_PLATE`, `ID_GAMA_VEHICLES`),
  INDEX `GAMMA_VEHICLES1_IDX` (`ID_GAMA_VEHICLES` ASC) VISIBLE,
  CONSTRAINT `GAMMA_VEHICLES_FK`
    FOREIGN KEY (`ID_GAMA_VEHICLES`)
    REFERENCES `Sistema`.`GAMMA_VEHICLES` (`ID_GAMA_VEHICLES`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Sistema`.`RESERVATIONS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Sistema`.`RESERVATIONS` ;

CREATE TABLE IF NOT EXISTS `Sistema`.`RESERVATIONS` (
  `ID_RESERVATION` INT(11) NOT NULL AUTO_INCREMENT,
  `PICKUP_DATE` DATE NOT NULL,
  `RETURN_DATE` DATE NOT NULL,
  `TOTAL_PRICE` DOUBLE NOT NULL,
  `ISAVAILABILITY` TINYINT(1) NOT NULL,
  `ID_USER_GUEST` INT(11) NOT NULL,
  `VEHICLES_NUMBER_PLATE` INT(11) NOT NULL,
  PRIMARY KEY (`ID_RESERVATION`, `ID_USER_GUEST`, `VEHICLES_NUMBER_PLATE`),
  INDEX `ID_USER_GUEST_FK` (`ID_USER_GUEST` ASC) VISIBLE,
  INDEX `NUMBER_PLATE` (`VEHICLES_NUMBER_PLATE` ASC) VISIBLE,
  CONSTRAINT `ID_USER_GUEST_FK`
    FOREIGN KEY (`ID_USER_GUEST`)
    REFERENCES `Sistema`.`USERS_GUEST` (`ID_USER_GUEST`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `NUMBER_PLATE_FK`
    FOREIGN KEY (`VEHICLES_NUMBER_PLATE`)
    REFERENCES `Sistema`.`VEHICLES` (`NUMBER_PLATE`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
