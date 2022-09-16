package com.kh.springhome.entity;


import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
	private int boardNo;
	private String boardWiter;
	private String boardTitle;
	private String boardContent;
	private Date boardWriteTime;
	private Date boardUpdateTime;
	private int boardRead;
	private int boardLike;
	private String boardHead;
}
