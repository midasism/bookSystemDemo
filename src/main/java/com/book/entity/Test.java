package com.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("test")
@Data
public class Test {
    //主键类型
    @TableId(type = IdType.AUTO)
    //如果数据库字段名和变量名相同，@TableField可省略
//    @TableId
    @TableField("id")
    private Integer id;
    @TableField("name")
    private String name;
}
