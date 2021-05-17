create database YIFY; 
use YIFY ; 

create table movies (
name varchar(200),
genre varchar(20), 
year int, 
imdb_rating float
);

INSERT INTO movies (name, genre, year, imdb_rating)
	            VALUES('Jurassic World', 'action', 2015, 7.3),
	            ('The Avengers', 'action', 2012, 8.1), 
	            ('The Dark Knight', 'action', 2008, 9.0),
	            ('Star Wars: Episode I - The Phantom Menace', 'action', 1999, 6.6),
	            ('Star Wars', 'action', 1997, 8.7),
	            ('Avengers: Age of Ultron', 'action', 2015, 7.9),
	            ('The Dark Knight Rises', 'action', 2012, 8.5),
	            ('Pirates of the Carribbean: Dead Mans Chest', 'action', 2006, 7.3),
	            ('Iron man 3', 'action', 2013, 7.3),
	            ('Spider-Man', 'action', 2002, 7.3),
	            ('Transformers: Revenge of the Fallen', 'action', 2009, 6.0),
	            ('Star Wars: Episode III', 'action', 2005, 7.7),
	            ('Spider Man 2', 'action', 2004, 7.3),
	            ('Transformers: Dark of the Moon', 'action', 2011, 6.3),
	            ('American Sniper', 'action', 2014, 7.4),
	            ('Furious Seven', 'action', 2015, 7.4),
	            ('Spider-Man 3', 'action', 2017, 6.2),
	            ('Paranormal Activity 2', 'horror', 2011, 5.9),
	            ('Scream', 'horror', 1996, 7.2),
	            ('Jaws 2', 'horror', 1978, 5.7),
	            ('Scream 2', 'horror', 1977, 6.1),
	            ('Sleepy Hollow', 'horror', 1999, 7.4),
	            ('The Others', 'horror', 2001, 7.6),
	            ('The Haunting', 'horror', 1999, 4.9),
	            ('Scream 3', 'horror', 2000, 5.5),
	            ('SAW II', 'horror', 2005, 6.6),
	            ('The Amityville Horror', 'horror', 1979, 6.2),
	            ('Aliens', 'horror', 1986, 8.4),
	            ('Paranormal Activity 2', 'horror', 2010, 5.7),
	            ('Shrek 2', 'comedy', 2004, 7.2),
	            ('Toy Story 3', 'comedy', 2010, 8.4),
	            ('Frozen', 'comedy', 2013, 7.6),
	            ('Finding Nemo', 'comedy', 2003, 8.2),
	            ('Despicable Me 2', 'comedy', 2013, 7.5),
	            ('Inside Out', 'comedy', 2015, 8.6),
	            ('Shrek the Third', 'comedy', 2007, 6.0),
	            ('Minions', 'comedy', 2015, 6.7),
	            ('Up', 'comedy', 2009, 8.3),
	            ('Monsters', 'comedy', 2001, 8.1);
select * from movies ;