package com.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("member")
public class Member {
  @TableId(type = IdType.AUTO)
  private long memberId;
  private String username;
  private String password;
  private long salt;
  private Date createTime;
  private String nickname;
}
