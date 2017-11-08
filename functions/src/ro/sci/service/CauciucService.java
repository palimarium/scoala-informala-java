package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.User;

public class CauciucService {

    private Cauciuc [] cauciucuri;

    public CauciucService() {
        initCauciucuri();
    }

    public Cauciuc findCauciuc(String modelName) {
        Cauciuc foundCauciuc = null;
        for (Cauciuc cauciuc: cauciucuri) {
            if (modelName != null && modelName.equals(cauciuc.modelName)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;
    }

    private void initCauciucuri() {
        // declaring some cauciucuri so that we can search through them
        Cauciuc m1 = new Cauciuc();
        m1.radius = "17x8.5";
        m1.modelName = "D603 HYDRO";

        Cauciuc m2 = new Cauciuc();
        m2.radius = "15x10";
        m2.modelName ="D576 LETHAL";

        Cauciuc m3 = new Cauciuc();
        m3.radius = "20x10";
        m3.modelName = "D537 MAVERICK";

        cauciucuri = new Cauciuc[]{m1 , m2, m3 };
    }
}
