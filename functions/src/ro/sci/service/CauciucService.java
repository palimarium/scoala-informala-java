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
        Cauciuc m1 = new Cauciuc("D603");
        m1.radius = "17x8.5";

        Cauciuc m2 = new Cauciuc("D576");
        m2.radius = "15x10";

        Cauciuc m3 = new Cauciuc("D537");
        m3.radius = "20x10";

        cauciucuri = new Cauciuc[]{m1 , m2, m3 };
    }
}
