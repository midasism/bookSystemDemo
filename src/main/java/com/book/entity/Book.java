package com.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class Book {
    @TableId(type = IdType.AUTO)
    private long bookId;
    private String bookName;
    private String subTitle;
    private String author;
    private String cover;
    private String description;
    private long categoryId;
    private double evaluationScore;
    private long evaluationQuantity;
}
