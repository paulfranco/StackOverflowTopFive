package co.paulfran.paulfranco.stackoverflowtopfive.rest;

public class APIClient {
    public static final String BASE_URL = "https://api.stackexchange.com";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
