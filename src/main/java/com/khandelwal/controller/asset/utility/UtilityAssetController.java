package com.khandelwal.controller.asset.utility;

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

import com.khandelwal.domainmodel.asset.utility.UtilityAsset;
import com.khandelwal.model.asset.utility.UtilityAssetService;

/**
 * This is restful controller class calling service layer
 * 
 * @author khabh
 *
 */
@RequestMapping("/utility")
@RestController
public class UtilityAssetController {

	private UtilityAssetService utilityAssetService;

	@Autowired
	public UtilityAssetController(UtilityAssetService utilityAssetService) {
		super();
		this.utilityAssetService = utilityAssetService;
	}

	@RequestMapping(value = "/addUtilityAsset", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void addUtilityAsset(@RequestBody UtilityAsset utilityAsset) {

		utilityAssetService.addUtilityAsset(utilityAsset);
	}

	@RequestMapping(value = "/getAllUtilityAsset", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<UtilityAsset>> getAllUtilityAsset() {

		return new ResponseEntity<Collection<UtilityAsset>>(
				utilityAssetService.getAllUtilityAsset(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getUtilityAssetByNumber/{assetnumber}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UtilityAsset> getUtilityAssetByNumber(
			@PathVariable String assetnumber) {

		return new ResponseEntity<UtilityAsset>(
				utilityAssetService.getUtilityAssetByNumber(assetnumber),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getUtilityAssetByName/{assetName}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<UtilityAsset>> getUtilityAssetByName(
			@PathVariable String assetName) {

		return new ResponseEntity<Collection<UtilityAsset>>(
				utilityAssetService.getUtilityAssetByName(assetName),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getUtilityAssetByType/{assetType}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<UtilityAsset>> getUtilityAssetByType(
			@PathVariable String assetType) {

		return new ResponseEntity<Collection<UtilityAsset>>(
				utilityAssetService.getUtilityAssetByType(assetType),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteUtilityAssetById/{assetNumber}", method = RequestMethod.DELETE, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void deleteUtilityAssetByName(@PathVariable String assetNumber) {

		utilityAssetService.deleteUtilityAsset(assetNumber);
	}
}