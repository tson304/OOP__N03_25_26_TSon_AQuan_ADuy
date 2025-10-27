package com.musicmanager.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ProjectException {
    // TODO: TRY-CATCH
    // Dùng để ghi log lỗi ra console
    private static final Logger logger = LoggerFactory.getLogger(ProjectException.class);

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
