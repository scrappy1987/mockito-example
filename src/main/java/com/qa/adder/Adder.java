package com.qa.adder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Adder implements IAdder {

	/* (non-Javadoc)
	 * @see com.qa.adder.Adderable#randomNumberAdder(int)
	 */
	public int randomNumberAdder(int inputNumber) {
		int randomNum = 0;
		int total = 0;
		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/number-generator/rest/number/random");
			ClientResponse response = webResource.accept("application/text").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			randomNum = Integer.parseInt(response.getEntity(String.class));
			System.out.println("The value of random number is " + randomNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		total = inputNumber + randomNum;
		System.out.println("The value of total is " + total);
		return total;
	}
}
