insert into character (id, name) values (1, 'Chris');
insert into character (id, name) values (2, 'Mary');

insert into character_aspects (character_id, index, type, name) values (1, 0, 'High Concept', 'Foo');
insert into character_aspects (character_id, index, type, name) values (1, 1, 'Trouble', 'Bar');
insert into character_aspects (character_id, index, type, name) values (1, 2, NULL, 'Baz');

insert into character_skills (character_id, name, rank) values (1, 'Foo', 1);
insert into character_skills (character_id, name, rank) values (1, 'Bar', 1);
insert into character_skills (character_id, name, rank) values (1, 'Baz', 2);
