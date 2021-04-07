package ge.edu.btu.nika_mgaloblishvili;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/currency-servlet")
public class CurrencyServlet {


    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getAllCurrency() {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("GEL", 3.16f, 3.2f));
        currencyList.add(new Currency("USD", 3.42f, 3.47f));
        currencyList.add(new Currency("EUR", 3.84f, 3.94f));
        currencyList.add(new Currency("GBP", 2.22f, 5f));
        currencyList.add(new Currency("RUB", 0.1f, 0.1f));
        currencyList.add(new Currency("TRY", 0.2f, 0.2f));
        currencyList.add(new Currency("AZN", 0.5f, 0.5f));
        return currencyList;
    }

    @POST
    @Path("/buy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Float buyGel(ConverterRequest request) {
        return request.amount / 3.2f;
    }


    @POST
    @Path("/sell")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Float sellGel(ConverterRequest request) {
        return 3.16f * request.amount;
    }

}
