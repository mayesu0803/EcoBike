/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  user
 * Created: Sep 7, 2021
 */

CREATE SCHEMA ecobike;
USE ecobike;

DROP TABLE IF EXISTS client;
CREATE TABLE client(
	id     int PRIMARY KEY,
        alias varchar(30) NOT NULL
);
INSERT INTO client VALUES(1, 'Louvre'); 
INSERT INTO client VALUES(2, 'Met');
