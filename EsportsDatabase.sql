DROP TABLE REGISTERED_USERS;
DROP TABLE PLAYS_FOR;
DROP TABLE TOURNAMENT;
DROP TABLE TEAM;
DROP TABLE GAME;
DROP TABLE PLAYER;

--Players and teams part of the database
CREATE TABLE PLAYER
(
    PLAYERID            VARCHAR2(30),
    FNAME               VARCHAR2(30),
    LNAME               VARCHAR2(30),
    GAMERTAG            VARCHAR2(30),
    COUNTRY             VARCHAR2(30),
    AGE                 NUMBER(2),
    YEARS_PRO           NUMBER(2),
    TOURNAMENT_WINS     NUMBER(4),
    IMAGERESOURCEID     NUMBER(20),
    CONSTRAINT PLAYER_PRIMARY_KEY PRIMARY KEY (PLAYERID)
);

--Adding players
INSERT INTO PLAYER VALUES('EliGE_CSGO','Jonathan','Jablonowski','EliGE','USA',23,5,7,0);
INSERT INTO PLAYER VALUES('Stewie2K_CSGO','Jake','Yip','Stewie2K','USA',23,7,14,0);
INSERT INTO PLAYER VALUES('Grim_CSGO','Michael','Wince','Grim','USA',19,2,1,0);
INSERT INTO PLAYER VALUES('FalleN_CSGO','Gabriel','Toledo','FalleN','Brazil',29,6,13,0);
INSERT INTO PLAYER VALUES('NAF_CSGO','Keith','Markovic','NAF','Canada',23,7,9,0);


CREATE TABLE GAME
(
    GAMEID              VARCHAR2(30),
    NAME                VARCHAR2(30),
    YEARS_PLAYED        NUMBER(2),
    CONSTRAINT GAME_PRIMARY_KEY PRIMARY KEY (GAMEID)
);

--Games
INSERT INTO GAME VALUES('CSGO','CSGO',9);

CREATE TABLE TEAM
(
    TEAMID              VARCHAR2(30),
    NAME                VARCHAR2(30),
    COUNTRY             VARCHAR2(30),
    YEARS_PRO           NUMBER(2),
    MONEY_WON           NUMBER(14,2),
    CONSTRAINT TEAM_PRIMARY_KEY PRIMARY KEY (TEAMID)
);

--Team
INSERT INTO TEAM VALUES('Liquid','Liquid','USA',21,36000000);

CREATE TABLE TOURNAMENT
(
    TOURNAMENT_ID       VARCHAR2(30),
    DAY                VARCHAR2(30),
    GAMEID              VARCHAR2(30),
    WINNER              VARCHAR2(30),
    CONSTRAINT TOURNAMENT_PRIMARY_KEY PRIMARY KEY (TOURNAMENT_ID),
    CONSTRAINT TOURNAMENT_GAME_FOREIGN_KEY FOREIGN KEY (GAMEID) REFERENCES GAME(GAMEID),
    CONSTRAINT TOURNAMENT_TEAM_FOREIGN_KEY FOREIGN KEY (WINNER) REFERENCES TEAM(TEAMID)
);

CREATE TABLE PLAYS_FOR(
    PLAYERID            VARCHAR2(30),
    TEAMID              VARCHAR2(30),
    GAMEID              VARCHAR2(30),
    CONSTRAINT PLAYS_FOR_PRIMARY_KEY PRIMARY KEY (PLAYERID,TEAMID),
    CONSTRAINT PLAYS_FOR_PLAYERID_FOREIGN_KEY FOREIGN KEY (PLAYERID) REFERENCES PLAYER(PLAYERID),
    CONSTRAINT PLAYS_FOR_GAME_PLAYED_FOREIGN_KEY FOREIGN KEY (GAMEID) REFERENCES GAME(GAMEID),
    CONSTRAINT PLAYS_FOR_TEAMID_FOREIGN_KEY FOREIGN KEY (TEAMID) REFERENCES TEAM(TEAMID)
);

INSERT INTO PLAYS_FOR VALUES ('EliGE_CSGO','Liquid','CSGO');
INSERT INTO PLAYS_FOR VALUES ('Stewie2K','Liquid','CSGO');
INSERT INTO PLAYS_FOR VALUES ('Grim_CSGO','Liquid','CSGO');
INSERT INTO PLAYS_FOR VALUES ('FalleN_CSGO','Liquid','CSGO');
INSERT INTO PLAYS_FOR VALUES ('NAF_CSGO','Liquid','CSGO');

--For the users of the Database
CREATE TABLE REGISTERED_USERS
(
    USERID              VARCHAR2(30),
    PASSWORD            VARCHAR2(30),
    CONSTRAINT REGISTERED_USERS_PRIMARY_KEY PRIMARY KEY (USERID)
);