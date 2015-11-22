SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `site_ardor` DEFAULT CHARACTER SET latin1 ;
USE `site_ardor` ;

-- -----------------------------------------------------
-- Table `site_ardor`.`Clubs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`Clubs` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `city` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `site_ardor`.`Competition`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`Competition` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `club` INT(10) UNSIGNED NOT NULL,
  `start_year` DATE NOT NULL,
  `active` BINARY(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Competition_club_idx` (`club` ASC),
  CONSTRAINT `fk_Competition_club`
    FOREIGN KEY (`club`)
    REFERENCES `site_ardor`.`Clubs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `site_ardor`.`ComptetitionOccurence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`ComptetitionOccurence` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `date` DATETIME NOT NULL,
  `location` VARCHAR(100) NULL DEFAULT NULL,
  `team_number` INT(10) UNSIGNED NULL DEFAULT NULL,
  `is_instance_of` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_CompetitionOccurence_idx` (`is_instance_of` ASC),
  CONSTRAINT `fk_CompetitionOccurence`
    FOREIGN KEY (`is_instance_of`)
    REFERENCES `site_ardor`.`Competition` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `site_ardor`.`Debaters`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`Debaters` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `first_names` VARCHAR(100) NOT NULL,
  `last_name` VARCHAR(100) NOT NULL,
  `club` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Debaters_1_idx` (`club` ASC),
  CONSTRAINT `fk_Debaters_1`
    FOREIGN KEY (`club`)
    REFERENCES `site_ardor`.`Clubs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `site_ardor`.`Judges`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`Judges` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `first_names` VARCHAR(100) NOT NULL,
  `last_name` VARCHAR(100) NOT NULL,
  `in_club` INT(100) UNSIGNED NOT NULL,
  `was_debater` INT(100) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Judges_in_club_idx` (`in_club` ASC),
  INDEX `fk_Judges_was_debater_idx` (`was_debater` ASC),
  CONSTRAINT `fk_Judges_was_debater`
    FOREIGN KEY (`was_debater`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Judges_in_club`
    FOREIGN KEY (`in_club`)
    REFERENCES `site_ardor`.`Clubs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `site_ardor`.`Match`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `site_ardor`.`Match` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `judge` INT(10) UNSIGNED NOT NULL,
  `G1` INT(10) UNSIGNED NOT NULL,
  `G1_score` FLOAT NOT NULL,
  `G2` INT(10) UNSIGNED NOT NULL,
  `G2_score` FLOAT NOT NULL,
  `G3` INT(10) UNSIGNED NOT NULL,
  `G3_score` FLOAT NOT NULL,
  `O1` INT(10) UNSIGNED NOT NULL,
  `O1_score` FLOAT NOT NULL,
  `O2` INT(10) UNSIGNED NOT NULL,
  `O2_score` FLOAT NOT NULL,
  `O3` INT(10) UNSIGNED NOT NULL,
  `O3_score` FLOAT NOT NULL,
  `held_at` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Match_G1_idx` (`G1` ASC),
  INDEX `fk_Match_G2_idx` (`G2` ASC),
  INDEX `fk_Match_G3_idx` (`G3` ASC),
  INDEX `fk_Match_O1_idx` (`O1` ASC),
  INDEX `fk_Match_O2_idx` (`O2` ASC),
  INDEX `fk_Match_O3_idx` (`O3` ASC),
  INDEX `fk_Match_held_at_idx` (`held_at` ASC),
  INDEX `fk_Match_judge_idx` (`judge` ASC),
  CONSTRAINT `fk_Match_judge`
    FOREIGN KEY (`judge`)
    REFERENCES `site_ardor`.`Judges` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_G1`
    FOREIGN KEY (`G1`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_G2`
    FOREIGN KEY (`G2`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_G3`
    FOREIGN KEY (`G3`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_held_at`
    FOREIGN KEY (`held_at`)
    REFERENCES `site_ardor`.`ComptetitionOccurence` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_O1`
    FOREIGN KEY (`O1`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_O2`
    FOREIGN KEY (`O2`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Match_O3`
    FOREIGN KEY (`O3`)
    REFERENCES `site_ardor`.`Debaters` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
