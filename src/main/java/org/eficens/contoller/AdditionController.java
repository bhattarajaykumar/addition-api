package org.eficens.contoller;

import org.eficens.model.AdditionResponse;
import org.eficens.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perform")
public class AdditionController {

    @Autowired
    AdditionService additionService;

    @PostMapping("/add")
    public AdditionResponse add(@RequestParam int num1, @RequestParam int num2) {
        return new AdditionResponse(num1, num2, additionService.add(num1, num2));
    }
}
