CREATE DATABASE music;

USE music;

CREATE TABLE users(
	user_id BIGINT AUTO_INCREMENT,
    user_name varchar(255) UNIQUE NOT NULL,
    user_password varchar(255)NOT NULL,
    PRIMARY KEY(user_id)
);
	
CREATE TABLE artists(
	artist_id BIGINT AUTO_INCREMENT,
    artist_name varchar(255) UNIQUE NOT NULL,
    artist_country varchar(255),
    PRIMARY KEY(artist_id)
);

CREATE TABLE genres(
    genre_id BIGINT AUTO_INCREMENT,
    genre_name varchar(255) UNIQUE NOT NULL,
    PRIMARY KEY(genre_id)
);

CREATE TABLE songs(
	song_id BIGINT AUTO_INCREMENT,
	song_name VARCHAR(255) UNIQUE NOT NULL,
    artist_id BIGINT,
    genre_id BIGINT,
    song_year_release INT,
    song_audio_filePath VARCHAR(255),
    song_duration TIME,
    PRIMARY KEY(song_id),
    FOREIGN KEY(artist_id) REFERENCES artists(artist_id),
    FOREIGN KEY(genre_id) REFERENCES genres(genre_id)
); 



