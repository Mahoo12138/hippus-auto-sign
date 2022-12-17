# create table public.user (
#     id bigint not null,
#     name varchar(100) default null,
#     password varchar(100) default null,
#     phone varchar(11) default '',
#     login_time timestamp default null,
#     status bool default false,
#     create_time timestamp default null,
#     update_time timestamp default null,
#     remark varchar(255) default null,
#     primary key (id)
# );
#
# COMMENT ON TABLE public.user is '用户表';
# comment on column public.user.id is '用户ID';
# comment on column public.user.name is '用户名(工号)';
# comment on column public.user.password is '密码';
# comment on column public.user.phone is '手机号';
# comment on column public.user.login_time is '最后登录时间';
# comment on column public.user.status is '账号状态';
# comment on column public.user.create_time is '创建时间';
# comment on column public.user.update_time is '更新时间';
# comment on column public.user.remark is '备注';

CREATE TABLE IF NOT EXISTS `user` (
    `id` bigint(20) not null primary key auto_increment comment '用户ID',
    `username` varchar(100) not null comment '用户名',
    `password` varchar(100)  not null comment '用户密码',
    `phone` varchar(11) default null comment '手机号',
    `login_time` timestamp comment '上次登录时间',
    `status` bool default false comment '用户状态',
    `create_time` timestamp comment '创建时间',
    `update_time` timestamp comment '更新实际',
    `remark` varchar(255) default '' comment '备注'
)