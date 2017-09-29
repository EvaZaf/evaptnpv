--
-- File generated with SQLiteStudio v3.1.1 on Τετ Σεπ 27 11:50:47 2017
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: info
DROP TABLE IF EXISTS info;

CREATE TABLE info (
    username_info VARCHAR PRIMARY KEY
                          UNIQUE
                          NOT NULL,
    username      VARCHAR REFERENCES Users_Result (username) MATCH [FULL]
                          NOT NULL
                          UNIQUE
);


-- Table: results
DROP TABLE IF EXISTS results;

CREATE TABLE results (
    id          PRIMARY KEY
                NOT NULL
                UNIQUE,
    username    NOT NULL
                UNIQUE,
    result      NOT NULL,
    imerominia  NOT NULL
                DEFAULT CURRENT_DATE
);

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        '',
                        'rr',
                        45,
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        1,
                        'hhh',
                        3,
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        7,
                        'ugiugiug',
                        8,
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        '5',
                        'ggg',
                        '3.6538461538461533',
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        '6',
                        'test',
                        '48.95238095238095',
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        '8',
                        'jsjsjsj',
                        '2232.6390977443607',
                        '2017-09-21'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        8,
                        'test1',
                        '9333.962264150943',
                        '2017-09-22'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        15,
                        'login',
                        '37.09803921568627',
                        '2017-09-22'
                    );

INSERT INTO results (
                        id,
                        username,
                        result,
                        imerominia
                    )
                    VALUES (
                        66,
                        'admin',
                        '442.30769230769215',
                        '2017-09-22'
                    );


-- Table: users_login
DROP TABLE IF EXISTS users_login;

CREATE TABLE users_login (
    id_user  INTEGER NOT NULL
                     PRIMARY KEY,
    username VARCHAR NOT NULL,
    password VARCHAR NOT NULL
);

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            1,
                            'test1',
                            '1212'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            2,
                            'test',
                            '2020'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            3,
                            'eva',
                            '2092017'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            4,
                            'user',
                            '123456789'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            5,
                            'user1',
                            '654321'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            6,
                            'user2',
                            '123456'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            7,
                            'login',
                            'login'
                        );

INSERT INTO users_login (
                            id_user,
                            username,
                            password
                        )
                        VALUES (
                            8,
                            'admin',
                            'admin'
                        );


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
