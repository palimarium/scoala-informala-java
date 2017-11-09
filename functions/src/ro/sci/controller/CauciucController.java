package ro.sci.controller;

import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.Cauciuc;
import ro.sci.service.AuthenticationService;
import ro.sci.service.CauciucService;
import ro.sci.service.FindService;

public class CauciucController {

    private FindService findService = new FindService();

    public Cauciuc handleSearchCauciucRequest (SearchCauciucRequest searchCauciucRequest) {
        Cauciuc cauciuc = this.findService.search(searchCauciucRequest) ;
        return cauciuc;

    }

}
