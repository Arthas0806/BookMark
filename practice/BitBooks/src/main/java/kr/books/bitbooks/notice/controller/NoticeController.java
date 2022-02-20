package kr.books.bitbooks.notice.controller;

import kr.books.bitbooks.common.vo.PagingVO;
import kr.books.bitbooks.notice.service.NoticeService;
import kr.books.bitbooks.notice.vo.NoticeVO;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class NoticeController {
/*
 * 의존성 주입 방법
 * 1. 주입대상 상단에 @Autowired 어노테이션을 달아준다.
 *   - 단점 : null 처리가 되지 않아서, 실제 주입이 이루어지지 않으면, 오류로 인해 프로그램이 작동안함.
 *   
 * 2. setter 를 통한 주입
 *   - @Autowried 어노테이션을 settr 위에 달아준다.
 *   - 단점 느려요
 *   
 * 3.  생성자를 통한 주입 
 *   - 추천!
 *   
 */
	
    private final NoticeService service;

    @GetMapping("/notice")
    public ModelAndView notice(@RequestParam(value = "currentPage", defaultValue = "1") Integer currentPage) {
    	
        
    	ModelAndView view = new ModelAndView();
        
        view.setViewName("views/notice/adminNoticeboard");

        try {
        	
        	//페이징 처리 객체 선언 
        	PagingVO pagingVO = new PagingVO();

        	//운영자 게시판 게시물 총 개수 
            int totalCount = service.getNoticeCount();

           // 전체 개수 넣어준다 
            pagingVO.setTotalCount(totalCount);
            // 현재 페이지 넣어준다 
            pagingVO.setCurrentPage(currentPage);

            //페이지 범위내에서 출력될 게시판 목록 리스트 가져오기 
            List<NoticeVO> noticeList = service.getNoticeList(pagingVO);
            
            //view 를 호출할때 넘겨줄 데이터  정의 
            view.addObject("currentPage", currentPage);
            view.addObject("paging", pagingVO);
            view.addObject("totalCount", totalCount);
            view.addObject("dataList", noticeList);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return view;
    }


    @GetMapping("/notice/write")
    public ModelAndView noticeWrite() {
        ModelAndView view = new ModelAndView();
        view.setViewName("views/notice/adminWriteNotice");
        return view;
    }

    @GetMapping("/notice/modify")
    public ModelAndView noticeModify() {
        ModelAndView view = new ModelAndView();
        view.setViewName("views/notice/adminModifyNotice");
        return view;
    }


}
