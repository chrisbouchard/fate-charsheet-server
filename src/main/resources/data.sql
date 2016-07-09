insert into character (id, name) values (1, 'Chris');
insert into character (id, name) values (2, 'Mary');

insert into aspect (id, character_id, index, type, name) values (1, 1, 0, 'High Concept', 'Foo');
insert into aspect (id, character_id, index, type, name) values (2, 1, 1, 'Trouble', 'Bar');
insert into aspect (id, character_id, index, type, name) values (3, 1, 2, NULL, 'Baz');

insert into skill (id, character_id, name, rank) values (1, 1, 'Foo', 1);
insert into skill (id, character_id, name, rank) values (2, 1, 'Bar', 1);
insert into skill (id, character_id, name, rank) values (3, 1, 'Baz', 2);

INSERT INTO stress_track (id, character_id, index, name) VALUES (1, 1, 0, 'Physical');
INSERT INTO stress_track (id, character_id, index, name) VALUES (2, 1, 1, 'Mental');

INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (1, 0, TRUE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (1, 1, FALSE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (1, 2, TRUE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (1, 3, FALSE);

INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (2, 0, FALSE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (2, 1, FALSE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (2, 2, FALSE);
INSERT INTO stress_track_boxes (stress_track_id, index, value) VALUES (2, 3, FALSE);

