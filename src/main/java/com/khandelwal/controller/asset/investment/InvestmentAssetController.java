package com.khandelwal.controller.asset.investment;

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

import com.khandelwal.domainmodel.asset.investment.InvestmentAsset;
import com.khandelwal.model.asset.investment.InvestmentAssetService;

/**
 * This is restful controller class calling service layer
 * 
 * @author khabh
 *
 */
@RequestMapping("/investment")
@RestController
public class InvestmentAssetController {

	private InvestmentAssetService investmentAssetService;

	@Autowired
	public InvestmentAssetController(
			InvestmentAssetService investmentAssetService) {
		super();
		this.investmentAssetService = investmentAssetService;
	}

	@RequestMapping(value = "/addInvestmentAsset", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void addInvestmentAsset(@RequestBody InvestmentAsset investmentAsset) {

		investmentAssetService.addInvestmentAsset(investmentAsset);
	}

	@RequestMapping(value = "/getAllInvestmentAsset", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<InvestmentAsset>> getAllInvestmentAsset() {

		return new ResponseEntity<Collection<InvestmentAsset>>(
				investmentAssetService.getAllInvestmentAsset(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getInvestmentAssetByNumber/{assetnumber}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<InvestmentAsset> getInvestmentAssetByNumber(
			@PathVariable String assetnumber) {

		return new ResponseEntity<InvestmentAsset>(
				investmentAssetService.getInvestmentAssetByNumber(assetnumber),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getInvestmentAssetByName/{assetName}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<InvestmentAsset>> getInvestmentAssetByName(
			@PathVariable String assetName) {

		return new ResponseEntity<Collection<InvestmentAsset>>(
				investmentAssetService.getInvestmentAssetByName(assetName),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getInvestmentAssetByType/{assetType}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<InvestmentAsset>> getInvestmentAssetByType(
			@PathVariable String assetType) {

		return new ResponseEntity<Collection<InvestmentAsset>>(
				investmentAssetService.getInvestmentAssetByType(assetType),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteInvestmentAssetById/{assetNumber}", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void deleteInvestmentAssetByName(@PathVariable String assetNumber) {

		investmentAssetService.deleteInvestmentAsset(assetNumber);
	}
}
