create table public.operation_log (
 id serial primary key,
 module varchar(64) default '',
 type varchar(64) default '',
 description varchar(64) default '',
 method varchar(64) default '',
 request_param varchar(1024) default '',
 response_param varchar(1024) default '',
 ip varchar(64) default '',
 url varchar(128) default '',
 user_id int default null,
 user_name varchar(64) default '',
 create_time timestamp default null,
 version varchar(64) default null
);

COMMENT ON TABLE public.operation_log is '接口操作记录表';
comment on column public.operation_log.id is '操作ID';
comment on column public.operation_log.module is '操作模块';
comment on column public.operation_log.type is '操作类型';
comment on column public.operation_log.description is '操作描述';
comment on column public.operation_log.method is '操作方法';
comment on column public.operation_log.request_param is '操作请求参数';
comment on column public.operation_log.response_param is '操作返回结果';
comment on column public.operation_log.ip is '操作请求IP';
comment on column public.operation_log.url is '操作请求地址';
comment on column public.operation_log.user_id is '操作用户ID';
comment on column public.operation_log.user_name is '操作用户名称';
comment on column public.operation_log.create_time is '操作创建时间';
comment on column public.operation_log.version is '程序版本';