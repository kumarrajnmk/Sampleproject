-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ecomm_demo_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ecomm_demo_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ecomm_demo_db` DEFAULT CHARACTER SET utf8 ;
USE `ecomm_demo_db` ;

-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_brand` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `descr` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_category` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `descr` VARCHAR(45) NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_product` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `display_name` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `overview` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `description` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `description1` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `author` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `image` VARCHAR(200) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `available_quantity` INT(11) NOT NULL,
  `price` DOUBLE NOT NULL,
  `sale_price` DOUBLE NOT NULL,
  `upc_code` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `status` INT(11) NOT NULL,
  `product_category_idx` INT NOT NULL,
  `company_idx` INT(11) NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_product_company1_idx` (`company_idx` ASC),
  INDEX `fk_product_product_category1_idx` (`product_category_idx` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_user` (
  `uid` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `pwd` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `first_name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `last_name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `middle_name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `email_address` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `home_phone` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL,
  `work_phone` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL,
  `mobile_phone` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `fax` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL,
  `status` VARCHAR(20) NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`uid`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  UNIQUE INDEX `mobile_phone_UNIQUE` (`mobile_phone` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_card_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_card_type` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `description` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_user_card`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_user_card` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `description` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `card` VARCHAR(30) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `exp_date` VARCHAR(20) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `cvv` VARCHAR(10) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `first_name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `last_name` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `address1` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `address2` VARCHAR(45) NULL,
  `city` VARCHAR(60) NULL,
  `state` VARCHAR(10) NULL,
  `zip_code` VARCHAR(20) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `user_uid` INT NOT NULL,
  `card_type_idx` INT NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_user_card_user1_idx` (`user_uid` ASC),
  INDEX `fk_user_card_card_type1_idx` (`card_type_idx` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_user_address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_user_address` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `street_address1` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `street_address2` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL,
  `city` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `state` VARCHAR(10) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `zip_code` VARCHAR(20) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `country` VARCHAR(60) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  `user_uid` INT NOT NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_user_address_user1_idx` (`user_uid` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_location`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_location` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `address1` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `address2` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `city` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `state` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `zipcode` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `country` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `phone` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `fax` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NOT NULL,
  `modified_date` DATETIME NOT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_order` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `delivery_method` VARCHAR(20) NOT NULL,
  `base_grand_total` DECIMAL(19,2) NULL DEFAULT NULL,
  `checkout_comment` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `status` INT(11) NOT NULL,
  `user_uid` INT NOT NULL,
  `user_address_idx` INT NOT NULL,
  `user_card_idx` INT(11) NOT NULL,
  `location_idx` INT NOT NULL,
  `transaction_id` VARCHAR(100) NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_order_user_card1_idx` (`user_card_idx` ASC),
  INDEX `fk_order_user_address1_idx` (`user_address_idx` ASC),
  INDEX `fk_order_user1_idx` (`user_uid` ASC),
  INDEX `fk_order_location1_idx` (`location_idx` ASC),
  UNIQUE INDEX `user_uid_UNIQUE` (`user_uid` ASC),
  UNIQUE INDEX `transaction_id_UNIQUE` (`transaction_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_order_line_items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_order_line_items` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(19,2) NOT NULL,
  `quantity` DECIMAL(19,2) NOT NULL,
  `product_idx` INT NOT NULL,
  `ecomm_order_idx` INT NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_order_line_items_product1_idx` (`product_idx` ASC),
  INDEX `fk_ecomm_order_line_items_ecomm_order1_idx` (`ecomm_order_idx` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_trans_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_trans_type` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `trans_type` VARCHAR(30) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `description` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `trans_type_UNIQUE` (`trans_type` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_audit_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_audit_log` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `xml_msg` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `trans_type_idx` INT NOT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_audit_log_trans_type1_idx` (`trans_type_idx` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `ecomm_demo_db`.`ecomm_card_transaction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecomm_demo_db`.`ecomm_card_transaction` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `transaction_id` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `transaction_type` VARCHAR(20) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NOT NULL,
  `transaction_date` DATETIME NOT NULL,
  `charge_amount` DECIMAL NOT NULL,
  `description` VARCHAR(100) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `ecomm_user_card_idx` INT NOT NULL,
  `parent_idx` INT NULL,
  `created_by` VARCHAR(45) NOT NULL,
  `create_date` DATETIME NOT NULL,
  `modified_by` VARCHAR(45) NULL,
  `modified_date` DATETIME NULL,
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `transaction_id_UNIQUE` (`transaction_id` ASC),
  INDEX `fk_ecomm_card_transaction_ecomm_user_card1_idx` (`ecomm_user_card_idx` ASC),
  UNIQUE INDEX `transaction_type_UNIQUE` (`transaction_type` ASC),
  INDEX `fk_ecomm_card_transaction_ecomm_card_transaction1_idx` (`parent_idx` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
