package com.musicmanager.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// Annotation này báo cho Spring biết đây là class xử lý lỗi toàn cục
@ControllerAdvice
public class ProjectException {

    // Dùng để ghi log lỗi ra console (thực hành tốt)
    private static final Logger logger = LoggerFactory.getLogger(ProjectException.class);

    /**
     * Xử lý lỗi khi không tìm thấy tài nguyên (404).
     * Bất cứ khi nào ResourceNotFoundException được ném ra từ bất kỳ Controller nào,
     * phương thức này sẽ được gọi.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ModelAndView handleResourceNotFoundException(ResourceNotFoundException ex) {
        ModelAndView modelAndView = new ModelAndView();

        // Ghi log lỗi
        logger.warn(ex.getMessage());

        // Đặt thông báo lỗi để hiển thị trên trang HTML
        modelAndView.addObject("errorMessage", ex.getMessage());

        // Trỏ đến file HTML xử lý lỗi 404
        modelAndView.setViewName("error/404");
        return modelAndView;
    }

    /**
     * Xử lý tất cả các lỗi chung khác (500 - Internal Server Error).
     * Đây là "catch-all" (bắt tất cả).
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView handleGeneralException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView();

        // Ghi log lỗi nghiêm trọng
        logger.error("Lỗi không mong muốn xảy ra: ", ex);

        modelAndView.addObject("errorMessage", "Đã có lỗi hệ thống xảy ra. Vui lòng thử lại sau.");

        // Trỏ đến file HTML xử lý lỗi 500
        modelAndView.setViewName("error/500");
        return modelAndView;
    }
}
