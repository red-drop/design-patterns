package com.adapter;

public class Main {

    public static void main(String[] args) {
        RequesterAdapter adapter = new RequesterAdapter(new NewWebRequester());
        WebClient wClient = new WebClient(adapter);

        wClient.doWork();
    }
}

public interface WebReqeuster {
    void requestHandler();
}

public class WebClient {
    private WebReqeuster webReqeuster;

    public WebClient(WebReqeuster webReqeuster) {
        this.webReqeuster = webReqeuster;
    }

    public void doWork() {
        webReqeuster.requestHandler();
    }
}

public class OldWebRequester implements WebReqeuster {
    @Override
    public void requestHandler() {
        System.out.println("Old Requester");
    }
}

public class NewWebRequester {
    public void newWebRequestHalder() {
        System.out.println("New Requester");
    }
}

public class RequesterAdapter implements WebReqeuster {
    private NewWebRequester newWebRequester;

    public RequesterAdapter(NewWebRequester newWebRequester) {
        this.newWebRequester = newWebRequester;
    }

    @Override
    public void requestHandler() {
        newWebRequester.newWebRequestHalder();
    }
}
