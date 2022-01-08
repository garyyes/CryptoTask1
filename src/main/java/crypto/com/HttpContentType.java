package crypto.com;

public class HttpContentType {
	
	private HttpContentType() {
		 throw new IllegalStateException();
	}
	
    public static final String CONTENT_TYPE_JSON="application/json";

    public static final String CONTENT_TYPE_XML="application/xml";

    public static final String CONTENT_TYPE_FORM="application/x-www-form-urlencoded";

    public static final String CONTENT_TYPE_ALL_IMAGE="image/*";

    public static final String CONTENT_TYPE_IMAGE_PNG="image/png";
}
