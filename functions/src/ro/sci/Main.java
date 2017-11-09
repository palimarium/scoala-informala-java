package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.User;
import ro.sci.service.CauciucService;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }

        CauciucController cauciucController = new CauciucController();


        SearchCauciucRequest searchCauciucRequest = new SearchCauciucRequest("D537");

        Cauciuc result2 = cauciucController.handleSearchCauciucRequest(searchCauciucRequest);

        if (result2 !=null ) {
            System.out.println("Modelul Dvs. a fost gasit!");
        }else {
            System.out.println("Ne pare rau dar modelul  " + searchCauciucRequest.modelName + "  nu exista!");

        }


    }
}
