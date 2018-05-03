-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema useradmin
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema useradmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `useradmin` DEFAULT CHARACTER SET latin1 ;
USE `useradmin` ;

DROP TABLE IF EXISTS `Orders_has_Materials`;
DROP TABLE IF EXISTS `Users`;
DROP TABLE IF EXISTS `Orders`;
DROP TABLE IF EXISTS `Materials`;
DROP TABLE IF EXISTS `Carports`;

-- -----------------------------------------------------
-- Table `useradmin`.`Materials`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Materials` (
  `MaterialsID` INT(11) NOT NULL,
  `MaterialsName` VARCHAR(45) NOT NULL,
  `QuantityInOrder` INT(11) NOT NULL,
  `MaterialsInStock` INT(11) NOT NULL,
  `MaterialsInOrders` INT(11) NOT NULL,
  `Pris` INT(11) NOT NULL,
  PRIMARY KEY (`MaterialsID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `useradmin`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` VARCHAR(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `useradmin`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Orders` (
  `idOrder` INT(11) NOT NULL auto_increment,
  #`OrderDate` date NOT NULL,
  #`PriceTotal` INT(11) NOT NULL,
  #`Address` VARCHAR(45) NOT NULL,
  #`Phone` VARCHAR(45) NOT NULL,
  #`height` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `height` int(11) NOT NULL default 250,
  #`Users_id` INT(11) NOT NULL,
  PRIMARY KEY (`idOrder`));
  #INDEX `fk_Orders_Users1_idx` (`Users_id` ASC),
  #CONSTRAINT `fk_Orders_Users1`)
    #FOREIGN KEY (`Users_id`)
    #REFERENCES `useradmin`.`Users` (`id`)
    #ON DELETE NO ACTION
    #ON UPDATE NO ACTION)
#ENGINE = InnoDB
#DEFAULT CHARACTER SET = latin1;

#CREATE TABLE IF NOT EXISTS `useradmin`.`Carports` (
 # `idCarport` INT(11) NOT NULL auto_increment,
  #`type` varchar(45) NOT NULL DEFAULT 'Minus skur',
  #`tag` INT(2) NOT NULL,
  #`height` int(11) NOT NULL,
  #`length` int(11) NOT NULL,
  #`width` int(11) NOT NULL,
  #primary key (`idCarport`));
  
  
-- -----------------------------------------------------
-- Table `useradmin`.`Orders_has_Materials`
-- -----------------------------------------------------
#CREATE TABLE IF NOT EXISTS `useradmin`.`Orders_has_Materials` (
 # `Orders_idOrder` INT(11) NOT NULL,
  #`Materials_MaterialsID` INT(11) NOT NULL,
  #PRIMARY KEY (`Orders_idOrder`, `Materials_MaterialsID`),
  #INDEX `fk_Orders_has_Materials_Materials1_idx` (`Materials_MaterialsID` ASC),
  #INDEX `fk_Orders_has_Materials_Orders1_idx` (`Orders_idOrder` ASC),
  #CONSTRAINT `fk_Orders_has_Materials_Orders1`
  #  FOREIGN KEY (`Orders_idOrder`)
   # REFERENCES `useradmin`.`Orders` (`idOrder`)
    #ON DELETE NO ACTION
    #ON UPDATE NO ACTION,
  #CONSTRAINT `fk_Orders_has_Materials_Materials1`
   # FOREIGN KEY (`Materials_MaterialsID`)
    #REFERENCES `useradmin`.`Materials` (`MaterialsID`)
    #ON DELETE NO ACTION
    #ON UPDATE NO ACTION)
#ENGINE = InnoDB
#DEFAULT CHARACTER SET = latin1;


#SET SQL_MODE=@OLD_SQL_MODE;
#SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
#SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

LOCK TABLES `Users` WRITE;

INSERT INTO `Users` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');

LOCK TABLES `Orders` WRITE;
INSERT INTO `Orders` VALUES
#(1, (DATE '20120109'), 2.5, 5, 3),
#(2, (DATE '20120109'), 2.5, 5, 5),
#(3, (DATE '20120109'), 2.5, 8, 4);

(1,500,800, 250),
(2,400,600, 250);

#LOCK TABLES `Carports` WRITE;
#INSERT INTO `Carports` VALUES
#(1, 'Minus skur', 1, 5, 5, 5),
#(2, 'Plus skur', 1, 2.5, 5, 3);

UNLOCK TABLES;
