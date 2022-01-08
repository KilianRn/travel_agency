package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ApiListController {

    public final ArrayList<DataUser> listDataUser = new ArrayList<DataUser>();
    public final ArrayList<PotentialDestinations> listPotentialDestinations = new ArrayList<PotentialDestinations>();

    @PostMapping("/api/inscription")
    public void inscription(@RequestBody DataUser newDataUser){
        listDataUser.add(newDataUser);
    }

    @GetMapping("/api/travels")
    public ArrayList<PotentialDestinations> travels(@RequestParam String userName){
        listPotentialDestinations.add(new PotentialDestinations("Caribbean", 32.4));
        listPotentialDestinations.add(new PotentialDestinations("Australia", 35.1));
        return listPotentialDestinations;
    }


}
