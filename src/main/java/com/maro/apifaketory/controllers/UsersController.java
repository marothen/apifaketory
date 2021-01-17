package com.maro.apifaketory.controllers;

import com.maro.apifaketory.domain.Name;
import com.maro.apifaketory.domain.User;
import com.maro.apifaketory.domain.UserData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @GetMapping("/list")
    public UserData list(@RequestParam(name = "limit") int limit) {
        UserData data = new UserData();
        User user = new User();
        Name name = new Name();

        for(int run=0;run<limit;run++) {
            user = new User();
            name = new Name();
            name.setFirst("First" + run);
            name.setLast("Last" +  run);
            user.setName(name);
            data.getData().add(user);
        }

        return data;
    }
}
