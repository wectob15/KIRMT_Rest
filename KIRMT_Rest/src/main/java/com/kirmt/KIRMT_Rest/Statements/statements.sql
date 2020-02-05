-- device
select * from device;

insert into device (inventar_nr, acquisition_date, description, brand, category, model, price, status)
values (4, to_date('01.02.2020', 'DD.mm.yyyy'), 'Monitor', 'Samsung', 'PC-Accecories', 'LED', 400.99, 'OK');

insert into device (inventar_nr, acquisition_date, description, brand, category, model, price, status)
values (3, to_date('20.11.2000', 'DD.mm.yyyy'), 'Tastatur', 'Logitec', 'PC_Accecories', 'M2', 40.99, 'down');

insert into device (inventar_nr, acquisition_date, description, brand, category, model, price, status)
values (2, to_date('20.11.2000', 'DD.mm.yyyy'), 'PC', 'Acer', 'PC', 'AG6', 1500.99, 'OK');

insert into device (inventar_nr, acquisition_date, description, brand, category, model, price, status)
values (1, to_date('20.11.2000', 'DD.mm.yyyy'), 'Drucker', 'Canon', 'Drucker', 'MX5490', 150.99, 'OK');

-- classroom
select * from classroom;

insert into classroom (classroom_id, classname, floor)
values (4, '1.1.20', 1);

insert into classroom (classroom_id, classname, floor)
values (3, '1.1.19', 2);

insert into classroom (classroom_id, classname, floor)
values (2, '1.1.18', 1);

insert into classroom (classroom_id, classname, floor)
values (1, '1.1.17', 2);

-- admin
select * from admin;

insert into admin (firstname, lastname)
values ('Christoph', 'Kohlweg');

-- user
select * from dbuser;

insert into dbuser (user_id, email, password, username)
values (4, 'krived15@htlkaindorf.at', '*****', 'krived15');

insert into dbuser (user_id, email, password, username)
values (3, 'lamflc15@htlkaindorf.at', '*****', 'lamflc15');

insert into dbuser (user_id, email, password, username)
values (2, 'wectoa15@htlkaindorf.at', '*****', 'wectoa15');

insert into dbuser (user_id, email, password, username)
values (1, 'maualb15@htlkaindorf.at', '*****', 'maualb15');

-- classresponsible
select * from classresponsible;

insert into classresponsible(user_id, )
values (1, '1.7.2');

--statements

-- man kann sich als admin/user anmelden
-- ? wird mit preparedStatement mit username vom benutzer ersetzt
select  password
from    dbuser
where   username = ?;

-- Der Admin möchte zu jedem Gerät Informationen zu der History sehen
select  acquisition_date
from    device
where   category = ?

-- alle services und was gemacht wurde
select  service_date, description
from    device_service
where   inventar_nr = ?;

select  isadmin
from    user
where   email = ?;

