create table public.user (
    id bigint not null,
    name varchar(100) default null,
    password varchar(100) default null,
    phone varchar(11) default '',
    login_time timestamp default null,
    status bool default false,
    create_time timestamp default null,
    update_time timestamp default null,
    remark varchar(255) default null,
    primary key (id)
);

COMMENT ON TABLE public.user is '用户表';
comment on column public.user.id is '用户ID';
comment on column public.user.name is '用户名(工号)';
comment on column public.user.password is '密码';
comment on column public.user.phone is '手机号';
comment on column public.user.login_time is '最后登录时间';
comment on column public.user.status is '账号状态';
comment on column public.user.create_time is '创建时间';
comment on column public.user.update_time is '更新时间';
comment on column public.user.remark is '备注';