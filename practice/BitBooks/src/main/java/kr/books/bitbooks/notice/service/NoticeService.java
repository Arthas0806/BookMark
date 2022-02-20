package kr.books.bitbooks.notice.service;


import kr.books.bitbooks.common.vo.PagingVO;
import kr.books.bitbooks.notice.mapper.NoticeMapper;
import kr.books.bitbooks.notice.vo.NoticeVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoticeService {

    private NoticeMapper mapper;

    public int getNoticeCount() throws Exception {
        return mapper.getNoticeCount();
    }

    public List<NoticeVO> getNoticeList(PagingVO page) throws Exception {
        return mapper.getNoticeList(page);
    }

}
