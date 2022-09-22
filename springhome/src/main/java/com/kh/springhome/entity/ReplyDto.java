package com.kh.springhome.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @Builder @NoArgsConstructor @ AllArgsConstructor

public class ReplyDto {
	private int replyNo;
	private String replyContent;
	private Date replyWritetime;
	private String replyWriter;
	private int replyOrigin;
	private boolean replyBlind;
}
