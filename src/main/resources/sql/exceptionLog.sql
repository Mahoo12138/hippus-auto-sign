# create table public.exception_log (
#  id serial primary key,
#  exception_message text default '',
#  exception_name varchar(64) default '',
#  method varchar(64) default '',
#  request_param varchar(1024) default '',
#  ip varchar(64) default '',
#  url varchar(128) default '',
#  user_id int default null,
#  user_name varchar(64) default '',
#  create_time timestamp default null,
#  version varchar(64) default null
# );
#
# COMMENT ON TABLE public.exception_log is '接口异常记录表';
# comment on column public.exception_log.id is '异常ID';
# comment on column public.exception_log.method is '异常方法';
# comment on column public.exception_log.request_param is '异常请求参数';
# comment on column public.exception_log.exception_message is '异常信息';
# comment on column public.exception_log.exception_name is '异常名称';
# comment on column public.exception_log.ip is '异常请求IP';
# comment on column public.exception_log.url is '异常请求地址';
# comment on column public.exception_log.user_id is '异常用户ID';
# comment on column public.exception_log.user_name is '异常用户名称';
# comment on column public.exception_log.create_time is '异常创建时间';
# comment on column public.exception_log.version is '程序版本';

create table if not exists exception_log (
  id bigint(20) primary key auto_increment comment '异常ID',
  exception_message text comment '异常消息',
  exception_name varchar(64) default '' comment '异常名称',
  method varchar(64) default '' comment '异常方法',
  request_param varchar(1024) default '' comment '异常请求参数',
  ip varchar(64) default '' comment '异常IP',
  url varchar(128) default '' comment '异常链接',
  user_id int default null comment '异常用户ID',
  user_name varchar(64) default '' comment '异常用户名',
  create_time timestamp default null comment '异常记录创建时间',
  version varchar(64) default null comment '版本'
)