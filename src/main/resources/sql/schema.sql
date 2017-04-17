-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE seckill;

-- 使用数据库
use seckill;

-- 创建秒杀库存表：使用InnoDB引擎，其支持事务。主键自增设置为从1000开始，字符格式设置为UTF8
CREATE TABLE seckill(
  seckill_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
  name varchar(120) NOT NULL COMMENT '商品名称',
  number int NOT NULL COMMENT '库存数量',
  start_time timestamp NOT NULL COMMENT '秒杀开启时间',
  end_time timestamp NOT NULL COMMENT '秒杀结束时间',
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 秒杀成功明细表
CREATE TABLE success_killed(
  seckill_id bigint NOT NULL COMMENT '秒杀商品id',
  user_phone bigint NOT NULL COMMENT '用户手机号',
  state tinyint NOT NULL  COMMENT '状态标示：-1指无效，0指成功，1指已付款',
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (seckill_id,user_phone),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

-- 初始化数据
INSERT INTO seckill(name,number,start_time,end_time)
VALUES
('1000元秒杀iphone6',100,'2016-06-28 00:00:00','2016-06-29 00:00:00'),
('500元秒杀iphone5',200,'2016-06-28 00:00:00','2016-06-29 00:00:00'),
('200元秒杀小米4',300,'2016-06-28 00:00:00','2016-06-29 00:00:00'),
('100元秒杀红米note',400,'2016-06-28 00:00:00','2016-06-29 00:00:00');


-- show create table seckill;
-- 为什么手写DDL，记录每次上线的DDL修改