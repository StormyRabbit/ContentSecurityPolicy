package hello;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
public class ReportingController {

    @PostMapping("/reporting")
    @ResponseBody
    public void reporting(HttpEntity<String> body) {
        Logger.getAnonymousLogger().log(
                Level.WARNING,
                body.getBody()
        );
    }
}
