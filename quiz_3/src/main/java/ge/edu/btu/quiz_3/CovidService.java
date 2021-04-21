package ge.edu.btu.quiz_3;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidService {

    @WebMethod
    public List<Covid> getStatistic() {
        return CovidStatisticFakeData.getStats();
    }

    @WebMethod
    public Covid getCountryStatistic(String country) {
        for (Covid covid : CovidStatisticFakeData.getStats()) {
            if (covid.getCountry().equals(country))
                return covid;
        }
        return null;
    }

    @WebMethod
    public int getTotalConfirmed() {
        int totalConfirmed = 0;
        for (Covid covid : CovidStatisticFakeData.getStats()) {
            totalConfirmed += covid.getConfirmed();
        }
        return totalConfirmed;
    }

    @WebMethod
    public int getTotalDeath() {
        int totalDeath = 0;
        for (Covid covid : CovidStatisticFakeData.getStats()) {
            totalDeath += covid.getDeaths();
        }
        return totalDeath;
    }

    @WebMethod
    public int getTotalRecovery() {
        int totalRecovery = 0;
        for (Covid covid : CovidStatisticFakeData.getStats()) {
            totalRecovery += covid.getRecovered();
        }
        return totalRecovery;
    }

}
