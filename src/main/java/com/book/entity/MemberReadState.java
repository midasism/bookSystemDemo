package com.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("member_read_state")
public class MemberReadState {
  @TableId(type = IdType.AUTO)
  private long rsId;
  private long bookId;
  private long memberId;
  private long readState;
  private Date createTime;
}
