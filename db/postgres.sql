CREATE TABLE IF NOT EXISTS example1 (
	id				SERIAL PRIMARY KEY, -- SERIAL is a "shortcut" for an integer auto_increment column
	name			varchar(255) NOT NULL,
	category	integer REFERENCES example2(id) -- REFERENCES means foreign key 
);