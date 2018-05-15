-- MySQL Workbench Forward Engineering
-- -----------------------------------------------------
-- Schema useradmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `useradmin` DEFAULT CHARACTER SET latin1 ;
USE `useradmin` ;

DROP TABLE IF EXISTS `Line_item`;
DROP TABLE IF EXISTS `Users`;
DROP TABLE IF EXISTS `Orders`;
DROP TABLE IF EXISTS `Materials`;
DROP TABLE IF EXISTS `Carport`;
DROP TABLE IF EXISTS `Type`;

-- -----------------------------------------------------
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema useradmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `useradmin` DEFAULT CHARACTER SET latin1 ;
USE `useradmin` ;

-- -----------------------------------------------------
-- Table `useradmin`.`Carport`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Carport` (
  `idCarport` INT(11) NOT NULL AUTO_INCREMENT,
  `type_skur` TINYINT(4) NOT NULL,
  `tag_fladt` TINYINT(4) NOT NULL,
  `tag_m_rejsning` TINYINT(4) NOT NULL,
  PRIMARY KEY (`idCarport`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `useradmin`.`Type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Type` (
  `idType` INT NOT NULL AUTO_INCREMENT,
  `Navn` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idType`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `useradmin`.`Materials`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Materials` (
  `MaterialsID` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `length` INT(11),
  `stock` INT(11) NOT NULL,
  `Pris` INT(11) NOT NULL,
  `desp` VARCHAR(100) NOT NULL,
  `Type_idType` INT NOT NULL,
  PRIMARY KEY (`MaterialsID`),
  INDEX `fk_Materials_Type1_idx` (`Type_idType` ASC),
  CONSTRAINT `fk_Materials_Type1`
    FOREIGN KEY (`Type_idType`)
    REFERENCES `useradmin`.`Type` (`idType`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
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
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `useradmin`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Orders` (
  `idOrder` INT(11) NOT NULL AUTO_INCREMENT,
  `width` INT(11) NOT NULL,
  `length` INT(11) NOT NULL,
  `height` INT(11) NOT NULL DEFAULT '250',
  `Users_id` INT(11) NOT NULL,
  #`Carport_idCarport` INT(11) NOT NULL,
  PRIMARY KEY (`idOrder`),
  INDEX `fk_Orders_Users1_idx` (`Users_id` ASC),
  #INDEX `fk_Orders_Carport1_idx` (`Carport_idCarport` ASC),
  #CONSTRAINT `fk_Orders_Carport1`
    #FOREIGN KEY (`Carport_idCarport`)
    #REFERENCES `useradmin`.`Carport` (`idCarport`)
    #ON DELETE NO ACTION
    #ON UPDATE NO ACTION,
  CONSTRAINT `fk_Orders_Users1`
    FOREIGN KEY (`Users_id`)
    REFERENCES `useradmin`.`Users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 39
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `useradmin`.`Line_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `useradmin`.`Line_item` (
  `Orders_idOrder` INT(11) NOT NULL,
  `Materials_MaterialsID` INT(11) NOT NULL,
  `antal` INT(11) NOT NULL,
  `pris` INT(11) NOT NULL,
  PRIMARY KEY (`Orders_idOrder`, `Materials_MaterialsID`),
  INDEX `fk_Orders_has_Materials_Materials1_idx` (`Materials_MaterialsID` ASC),
  INDEX `fk_Orders_has_Materials_Orders_idx` (`Orders_idOrder` ASC),
  CONSTRAINT `fk_Orders_has_Materials_Materials1`
    FOREIGN KEY (`Materials_MaterialsID`)
    REFERENCES `useradmin`.`Materials` (`MaterialsID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Orders_has_Materials_Orders`
    FOREIGN KEY (`Orders_idOrder`)
    REFERENCES `useradmin`.`Orders` (`idOrder`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



LOCK TABLES `Users` WRITE;
INSERT INTO `Users` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');

LOCK TABLES `Orders` WRITE;
INSERT INTO `Orders` VALUES

(1,500,800, 250, 1),
(2,400,600, 250, 2),
(3, 400, 1000, 250, 2);

LOCK TABLES `Carport` WRITE;
INSERT INTO `Carport` VALUES

(1,true,false,true),
(2,false,true,false);

UNLOCK TABLES;
