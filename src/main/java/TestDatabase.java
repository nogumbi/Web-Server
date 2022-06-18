import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDatabase implements QuoteDB {
    private Map<Integer, Quote> quotes;

    public TestDatabase() {
        quotes = new HashMap<>();
        this.add(Quote.create("https://www.unisa.ac.za/sites/corporate/default/Apply-for-admission", "University of South Africa (UNISA)"));
        this.add(Quote.create("https://www.northwestu.edu/admissions/apply","North-West University"));
        this.add(Quote.create("https://www.up.ac.za/online-application", "University of Pretoria"));
        this.add(Quote.create("https://www.tut.ac.za/study-at-tut/i-want-to-study/appli-info/application-form", "Tshwane University of Technology"));
        this.add(Quote.create("https://www.uj.ac.za/about/about/internationalisation/international-students-2/applying-to-uj/", "University of Johannesburg"));
        this.add(Quote.create("http://applications.ukzn.ac.za/Homepage.aspx", "University of KwaZulu-Natal"));
        this.add(Quote.create("https://apply.ufs.ac.za/Application/Start", "University of the Free State"));
        this.add(Quote.create("https://self-service.wits.ac.za/psc/csprodonl/UW_SELF_SERVICE/SA/c/VC_OA_LOGIN_MENU.VC_OA_LOGIN_FL.GBL?&", "University of the Witwatersrand"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Stellenbosch"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Cape Town"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Nelson Mandela Metropolitan University"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Walter Sisulu University"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Durban University of Technology"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Limpopo"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Vaal University of Technology"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Zululand"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of the Western Cape"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Central University of Technology"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Fort Hare"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Venda"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Rhodes University"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "University of Mpumalanga"));
        // this.add(Quote.create("There is no snooze button on a cat who wants breakfast.", "Sol Plaatje University"));
    }

    @Override
    public Quote get(Integer id) {
        return quotes.get(id);
    }

    @Override
    public List<Quote> all() {
        return new ArrayList<>(quotes.values());
    }

    @Override
    public Quote add(Quote quote) {
        Integer index = quotes.size() + 1;
        quote.setId(index);
        quotes.put(index, quote);
        return quote;
    }
}