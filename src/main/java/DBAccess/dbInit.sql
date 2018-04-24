CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;

DROP TABLE IF EXISTS `users`;
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Table `mydb`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Users` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
	`role` varchar(20) NOT NULL DEFAULT 'customer',
  `E-mail` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE INDEX `E-mail_UNIQUE` (`E-mail` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Order` (
  `idOrder` INT NOT NULL,
  `OrderDate` INT NOT NULL,
  `PriceTotal` INT NOT NULL,
  `Users_idUser` INT NOT NULL,
	`Address` VARCHAR(45) NOT NULL,
  `Phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idOrder`),
  INDEX `fk_Order_Users_idx` (`Users_idUser` ASC),
  CONSTRAINT `fk_Order_Users`
    FOREIGN KEY (`Users_idUser`)
    REFERENCES `Users` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Materials`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Materials` (
  `MaterialsID` INT NOT NULL,
  `MaterialsName` VARCHAR(45) NOT NULL,
  `QuantityInOrder` INT NOT NULL,
  `MaterialsInStock` INT NOT NULL,
  `MaterialsInOrders` INT NOT NULL,
  PRIMARY KEY (`MaterialsID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Order_has_Materials`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Order_has_Materials` (
  `Order_idOrder` INT NOT NULL,
  `Materials_MaterialsID` INT NOT NULL,
  PRIMARY KEY (`Order_idOrder`, `Materials_MaterialsID`),
  INDEX `fk_Order_has_Materials_Materials1_idx` (`Materials_MaterialsID` ASC),
  INDEX `fk_Order_has_Materials_Order1_idx` (`Order_idOrder` ASC),
  CONSTRAINT `fk_Order_has_Materials_Order1`
    FOREIGN KEY (`Order_idOrder`)
    REFERENCES `Order` (`idOrder`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Order_has_Materials_Materials1`
    FOREIGN KEY (`Materials_MaterialsID`)
    REFERENCES `Materials` (`MaterialsID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
UNLOCK TABLES;