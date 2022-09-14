package com.cts.pensionerDetails.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pensionerDetails.Model.PensionerDetails;
import com.cts.pensionerDetails.Service.PensionerDetailServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ankit Barnwal
 * 
 *         Pensioner Details Controller is to get the details of pensioner by
 *         passing the Aadhaar Number
 *
 */
@RestController
@Slf4j
@CrossOrigin
public class PensionerDetailsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PensionerDetailsController.class);

	@Autowired
	private PensionerDetailServiceImpl pensionerDetailService;

	/**
	 * @URL: http://localhost:8083/pensionerDetailByAadhaar/123456789012
	 * 
	 * @return if Aadhaar Number then return the pensioner details else throws
	 *         Exception
	 * 
	 * @Expceted: {
				  "name": "Ankit",
				  "dateOfBirth": "1956-09-11T18:30:00.000+00:00",
				  "pan": "BHMER12436",
				  "salary": 27000,
				  "allowance": 10000,
				  "pensionType": "self",
				  "bank": {
				    "bankName": "ICICI",
				    "accountNumber": 12345678,
				    "bankType": "private"
				  }
				}
	 *
	 */

	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetails getPensionerDetailByAadhaar(@PathVariable String aadhaarNumber) {
		LOGGER.info("START - getPensionerDetailByAadhaar()");
		return pensionerDetailService.getPensionerDetailByAadhaarNumber(aadhaarNumber);
	}

}
