package com.shako;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController("shako/")
@RequestMapping()
public class Controller {

    @Autowired
    com.shako.service.impl.ServiceImpl service;

    /**
     * General create action.
     */
    public void create() {

    }

    /**
     * General read action.
     * @return object.
     */
    public Object read() {
        return service.read();
    }

    /**
     * General update action.
     */
    public void update() {

    }

    /**
     * General delete action.
     */
    public void delete() {

    }
}
