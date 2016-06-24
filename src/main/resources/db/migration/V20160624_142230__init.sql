CREATE TABLE CHARACTER (
    id SERIAL,
    name TEXT NOT NULL,

    CONSTRAINT pk__character
        PRIMARY KEY (id)
);

CREATE TABLE character_aspects (
    character_id INTEGER NOT NULL,
    name TEXT NOT NULL,
    type TEXT,
    index INTEGER NOT NULL,

    CONSTRAINT pk__character_aspects
        PRIMARY KEY (character_id, index),
    CONSTRAINT fk__character_aspects__character__character_id
        FOREIGN KEY (character_id) REFERENCES character
        ON DELETE CASCADE
);

CREATE TABLE character_skills (
    character_id INTEGER NOT NULL,
    name TEXT NOT NULL,
    rank INTEGER NOT NULL,

    CONSTRAINT pk__character_skills
        PRIMARY KEY (character_id, name),
    CONSTRAINT fk__character_skills__character__character_id
        FOREIGN KEY (character_id) REFERENCES character
        ON DELETE CASCADE
);
