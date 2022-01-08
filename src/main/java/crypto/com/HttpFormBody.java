package crypto.com;

import okhttp3.FormBody;

import java.util.Map;

class HttpFormBody {

    public FormBody addFormBody(Map<String, String> form){
        FormBody.Builder formBodyBuilder = new FormBody.Builder();
        for (Map.Entry<String, String> entry : form.entrySet()) {
            formBodyBuilder.add(entry.getKey(), entry.getValue());
        }
        return formBodyBuilder.build();
    }

}
