package com.nftbe.filter;

import com.nftbe.services.UserService;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;

import javax.servlet.*;
import java.io.IOException;

//@Component
public class SimpleFilter implements Filter {
    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.debug("Remote Host:", servletRequest.getRemoteHost());
        logger.debug("Remote Address:", servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
