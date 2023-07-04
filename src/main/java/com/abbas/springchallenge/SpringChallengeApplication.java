package com.abbas.springchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringChallengeApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Please choose a doctor:" +
                "<br>" +
                "<a href='/doctor/1'>Doctor 1</a>"
                + "<br>" +
                "<a href='/doctor/2'>Doctor 2</a>"
                + "<br>" +
                "<a href='/doctor/3'>Doctor 3</a>"
                + "<br>" +
                "<a href='/doctor/4'>Doctor 4</a>";

    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String doctorOne() {

        return "William Hartnell";

    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String doctorTwo() {

        return "Patrick Troughton";

    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String doctorThree() {

        return "Jon Pertwee";

    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String doctorFour() {

        return "Tom Baker";

    }
}

