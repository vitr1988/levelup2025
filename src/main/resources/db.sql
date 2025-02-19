create table clients(
    id serial primary key,
    name varchar,
    last_name varchar,
    middle_name varchar,
    birth_date date
);

create table accounts
(
    id             serial
        constraint accounts_pk
            primary key,
    account_number varchar(100) not null,
    client_id      integer
        constraint accounts_clients_id_fk
            references clients
);


insert into clients (id, name, last_name, middle_name, birth_date)
values (0, 'Petr', 'Petrov', 'Petrovich', '1988-01-01');


insert into clients (name, last_name, middle_name, birth_date)
values ('Vitalii', 'Ivanov', 'Andreevich', '1988-03-10');

insert into clients (name, last_name, middle_name, birth_date)
values ('Vasiliy', 'Ivanov', 'Ivanovich', '2020-01-01');

select id as identifier, name, last_name,
       last_name || ' ' || name || ' ' || middle_name full_name,
       birth_date
from clients
where last_name like 'P%' --and birth_date < '2020-01-01'
order by last_name desc, birth_date
;

select last_name, count(*) from clients
group by last_name
having count(*) > 1

select * from clients;

update clients set birth_date = '2000-02-01', name = 'Vasily'
where id = 1;

commit;

delete from clients
where id % 2 = 1

insert into accounts(account_number, client_id)
values ('4343434143', 2);


insert into accounts(account_number, client_id)
values ('43542554542', null);


insert into accounts(account_number, client_id)
values ('43542554542', 100);

select * from clients
where id in (
    select client_id
             from accounts
             )

select cl.id, cl.name, cl.last_name, cl.middle_name, cl.birth_date,
       a.account_number from clients cl
join accounts a on cl.id = a.client_id


select * from clients cl
left join accounts a on cl.id = a.client_id


select * from clients cl
right join accounts a on cl.id = a.client_id