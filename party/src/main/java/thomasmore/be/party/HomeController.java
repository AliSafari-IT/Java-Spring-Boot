package thomasmore.be.party;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import thomasmore.be.party.model.PartyGuest;
import thomasmore.be.party.model.Venue;

@Controller
public class HomeController {
    private final String applicationName = "Party!";
    private final String welcomeMSG = "Welcome to the Party!";
    private String venueName;
    private int venueId = 0;
    private String vID;
    private int pGuestID = 0;
    private final String[] venueNames = {"De Club", "De Loods", "De Hanger", "Zapoi", "Kuub", "Cuba Libre"};
    private Venue[] venueArray = {
            new Venue(0, "De Club", true, 150, false, true, "https://transitm.mechelen.be/infofiche_declubpdf"),
            new Venue(1, "De Loods", true, 1000, false, true, "https://transitm.mechelen.be/infofiche-deloodspdf"),
            new Venue(2, "Zapoi", true, false, "http://www.kafeezapoi.be/"),
            new Venue(3, "De Kuub", false, true, "http://www.dekuub.be/"),
            new Venue(4, "t'Ile Maline", false, true, "https://www.tilemalines.be/")
    };


    private PartyGuest[] pGuests = {
            new PartyGuest(1, "Ali", "Male"),
            new PartyGuest(2, "Anja", "Female"),
            new PartyGuest(3, "Kian", "Male"),
            new PartyGuest(4, "Tara", "Female")};

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("vNames", venueNames);
        model.addAttribute("venArr", venueArray);
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

    @GetMapping({"/venue", "/venue/{venueName}"})
    public String venue(
            @PathVariable(required = false) String venueName,
            Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("wMsg", welcomeMSG);
        model.addAttribute("vName", (venueName != null) ? venueName : "Boesj");
        model.addAttribute("venArr", venueArray);
        model.addAttribute("venue", venueArray[venueId]);
        model.addAttribute("idOfPrevVenue", venueId > 0 ? venueId - 1 : venueArray.length - 1);
        model.addAttribute("idOfNextVenue", venueId < venueArray.length - 1 ? venueId + 1 : 0);
        return "venue";
    }

    @GetMapping({"/venueIF", "/venueIF/{venueName}"})
    public String venueIF(@PathVariable(required = false) String venueName, Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("wMsg", welcomeMSG);
        model.addAttribute("vName", venueName);
        return "venueIF";
    }

    @GetMapping({"/guest", "/guest/{pGuestID}"})
    public String guest(@PathVariable(required = false) int pGuestID, Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("wMsg", welcomeMSG);
        model.addAttribute("pGuests", pGuests);
        model.addAttribute("pGuestID", (pGuestID > 0 && pGuestID < pGuests.length) ? pGuestID : 0);
        return "guest";
    }
}
