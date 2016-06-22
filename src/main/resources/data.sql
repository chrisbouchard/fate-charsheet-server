insert into character (id, name) values (1, 'Chris');
insert into character (id, name) values (2, 'Mary');

insert into aspect (character_id, index, type, name) values (1, 0, 'High Concept', 'Foo');
insert into aspect (character_id, index, type, name) values (1, 1, 'Trouble', 'Bar');
insert into aspect (character_id, index, type, name) values (1, 2, NULL, 'Baz');
