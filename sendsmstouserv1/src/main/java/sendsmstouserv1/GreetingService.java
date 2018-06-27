package sendsmstouserv1;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.http.*;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class GreetingService {
	public static String  publishsms(String tonumber,String bodymessage) throws URISyntaxException
	  {
		
		String temp = tonumber;
		String tempBodyMessage = bodymessage;
		System.out.println("method called");
		System.out.println(temp);
		System.out.println(tempBodyMessage);
		Twilio.init("ACcdb5db7d8a1ae8eb61b35eed49b0485b", "33dc09f79ed678c87efb40e8c79f3c9c");
		System.out.println("twilio init been called");
		Message message = Message
              .creator(new PhoneNumber('+' +temp), // to
                      new PhoneNumber("+14159015749"), // from
                      tempBodyMessage)
              .create();
		/*Call call = Call.creator(
			    new PhoneNumber("+917331135884"),  // To number
			    new PhoneNumber("+14159015749"),  // From number

			    // Read TwiML at this URL when a call connects (hold music)
			    new URI("http://twimlets.com/holdmusic?Bucket=com.twilio.music.ambient")
			).create();*/
		System.out.println("twilio message been creted");
		return null;
		
	    //Record r = new Record();
	  
	   
	  }

}