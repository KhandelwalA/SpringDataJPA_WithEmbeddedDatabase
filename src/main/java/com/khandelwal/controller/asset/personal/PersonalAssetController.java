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

		return new ResponseEntity<Collection<PersonalAsset>>(personalAssetService.getAllPersonalAsset(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getPersonalAssetById/{assetId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<PersonalAsset> getPersonalAssetById(@PathVariable Integer assetId) {

		return new ResponseEntity<PersonalAsset>(personalAssetService.getPersonalAssetById(assetId), HttpStatus.OK);
	}

	/*
	 * @RequestMapping(name = "/getPersonalAssetByName/{assetName}", method =
	 * RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE }, consumes = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	 * public ResponseEntity<PersonalAsset> getPersonalAssetByName(@PathVariable
	 * String assetName) {
	 * 
	 * return new
	 * ResponseEntity<PersonalAsset>(personalAssetService.getPersonalAssetByName
	 * (assetName), HttpStatus.OK); }
	 */

	@RequestMapping(value = "/deletePersonalAssetById/{assetId}", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void deletePersonalAssetByName(@PathVariable Integer assetId) {

		personalAssetService.deletePersonalAsset(assetId);
	}
}
