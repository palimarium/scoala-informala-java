package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.User;

public class FindService {

    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchCauciucRequest searchCauciucRequest) {
        Cauciuc validCauciuc = null;

        if (searchCauciucRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.modelName);

            if (cauciuc != null ) {
                validCauciuc = cauciuc;
            }
        }

        return validCauciuc;
    }



}
