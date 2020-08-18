package thomasmore.be.party;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private String applicationName = "Party!";
    private String welcomeMSG = "Welcome to the Party!";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", applicationName);
        return "home";
    }

    @GetMapping("/qStart")
    public String qStart() {
        return "Quickstart";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/dPage")
    public String dPage() {
        return "dPage";
    }

    @GetMapping("/blabla")
    public String blabla(Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("wMsg", welcomeMSG);
        return "blabla";
    }

    @GetMapping("/venue/{venueName}")
    public String venue() {
        return "venue";
    }
}
