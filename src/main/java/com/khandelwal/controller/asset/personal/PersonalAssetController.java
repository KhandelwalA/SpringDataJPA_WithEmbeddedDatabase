package com.khandelwal.controller.asset.personal;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khandelwal.domainmodel.asset.personal.PersonalAsset;
import com.khandelwal.model.asset.personal.PersonalAssetService;

/**
 * This is restful controller class calling service layer
 * 
 * @author khabh
 *
 */
@RequestMapping("/personal")
@RestController
public class PersonalAssetController {

	private PersonalAssetService personalAssetService;

	@Autowired
	public PersonalAssetController(PersonalAssetService personalAssetService) {
		super();
		this.personalAssetService = personalAssetService;
	}

	@RequestMapping(value = "/addPersonalAsset", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void addPersonalAsset(@RequestBody PersonalAsset personalAsset) {

		personalAssetService.addPersonalAsset(personalAsset);
	}

	@RequestMapping(value = "/getAllPersonalAsset", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<PersonalAsset>> getAllPersonalAsset() {

		return new ResponseEntity<Collection<PersonalAsset>>(
				personalAssetService.getAllPersonalAsset(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getPersonalAssetByNumber/{assetnumber}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<PersonalAsset> getPersonalAssetByNumber(
			@PathVariable String assetnumber) {

		return new ResponseEntity<PersonalAsset>(
				personalAssetService.getPersonalAssetByNumber(assetnumber),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getPersonalAssetByName/{assetName}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<PersonalAsset>> getPersonalAssetByName(
			@PathVariable String assetName) {

		return new ResponseEntity<Collection<PersonalAsset>>(
				personalAssetService.getPersonalAssetByName(assetName),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/deletePersonalAssetById/{assetNumber}", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void deletePersonalAssetByName(@PathVariable String assetNumber) {

		personalAssetService.deletePersonalAsset(assetNumber);
	}
}
