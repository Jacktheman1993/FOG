CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;

DROP TABLE IF EXISTS `Users`;
DROP TABLE IF EXISTS `Order`;
DROP TABLE IF EXISTS `Materials`;
DROP TABLE IF EXISTS `Order_has_Materials`;

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Table `mydb`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Order` (
  `idOrder` INT NOT NULL ,
  `OrderDate` INT NOT NULL,
  `PriceTotal` INT NOT NULL,
  `Users_id` INT NOT NULL,
	`Address` VARCHAR(45) NOT NULL,
  `Phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idOrder`),
  INDEX `fk_Order_Users_idx` (`Users_id` ASC),
  CONSTRAINT `fk_Order_Users`
    FOREIGN KEY (`Users_id`)
    REFERENCES `Users` (`id`)
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

LOCK TABLES `Users` WRITE;

INSERT INTO `Users` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
LOCK TABLES `Order` WRITE;
INSERT INTO `Order` VALUES
(1, 24042018, 8500, 1,'hjortevej 9','88888888');
UNLOCK TABLES;