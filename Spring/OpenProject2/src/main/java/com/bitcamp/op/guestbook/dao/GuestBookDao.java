package com.bitcamp.op.guestbook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bitcamp.op.guestbook.domain.GuestBookListMessage;

public interface GuestBookDao {

	@Select("select count(*) from guestbook")
	public int selectTotalCount();
	
	public List<GuestBookListMessage> selectList(int index, int count);

}
