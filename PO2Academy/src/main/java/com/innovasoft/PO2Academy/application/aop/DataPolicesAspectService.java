package com.innovasoft.PO2Academy.application.aop;

import com.innovasoft.PO2Academy.domain.api.IDataPolicesServicePort;
import com.innovasoft.PO2Academy.domain.model.DataPolices;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@RequiredArgsConstructor
public class DataPolicesAspectService {
    private final HttpSession httpSession;
    private final IDataPolicesServicePort dataPolicesServicePort;

    @Before("execution(* com.innovasoft.PO2Academy.infrastructure.input.mvc..*(..)) && !target(com.innovasoft.PO2Academy.infrastructure.input.mvc.LoginController)")
    public void verifyDataPolicy() {
       if (httpSession.getAttribute("DataPolicies") == null || !(boolean) httpSession.getAttribute("DataPolicies")) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            List<DataPolices> dataPolicies = dataPolicesServicePort.getDataPoliciesByUsernameFromLast30Days(authentication.getName());
            if (dataPolicies.isEmpty()) {
                httpSession.setAttribute("DataPolicies", false);
            } else {
                httpSession.setAttribute("DataPolicies", true);
            }
        }
    }

}
