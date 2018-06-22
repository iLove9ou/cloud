package com.cloud.service.controller;

import com.cloud.service.common.BaseController;
import com.cloud.service.model.DTO.RoleDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoleController extends BaseController {

    @RequestMapping(value = "/role")
    public RoleDTO getRole() {
        return new RoleDTO();
    }
}
