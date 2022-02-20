package kr.books.bitbooks.notice.mapper;


import kr.books.bitbooks.common.vo.PagingVO;
import kr.books.bitbooks.notice.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    int getNoticeCount() throws Exception;

    List<NoticeVO> getNoticeList(PagingVO page) throws Exception;

}
