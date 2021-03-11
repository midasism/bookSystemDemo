package com.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("evaluation")
public class Evaluation {
  @TableId(type = IdType.AUTO)
  private long evaluationId;
  private String content;
  private long score;
  private Date createTime;
  private long memberId;
  private long bookId;
  private long enjoy;
  private String state;
  private String disableReason;
  private Date disableTime;
}
