/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package mvm.pks.mvmaddon.controllers;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import de.hybris.platform.commerceservices.delivery.impl.DefaultDeliveryService;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import org.apache.log4j.Logger;
import java.util.List;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import java.io.IOException;  
import javax.servlet.ServletException;  

/**
 */
@Controller
@Resource(name="mvmController")
public  class  MvmController extends AbstractPageController
{
	// implement here controller constants used by this extension
	
	private static final Logger LOG = Logger.getLogger(MvmController.class);
	
	// public List<DeliveryModeModel>  getSupportedDeliveryModeListForOrder(AbstractOrderModel abstractOrder){
	// 	LOG.error("log by Pradeep Kumar Srivastava ");
    //     	return super.getSupportedDeliveryModeListForOrder(abstractOrder);
    // 	}

	@RequestMapping( value= "/mvm" , method=RequestMethod.GET)
    public String test(final Model model ,HttpServletRequest request, HttpServletResponse response) throws CMSItemNotFoundException,ServletException,IOException
    {

		LOG.info("multivendor Controller method 1");
		final ContentPageModel page = getContentPageForLabelOrId(null); 
		storeCmsPageInModel(model, page);
		setUpMetaDataForContentPage(model, page);
		model.addAttribute("name", "Pradeep Kumar Srivastava");

		// return "hello pradeep kumar srivastava, here is a trick !!";
		// return "addon:/mvmaddon/pages/product/productLayout1Page";
		return "addon:/mvmaddon/pages/sellerProfile";


    }


	@RequestMapping( value="/mvm/{name}" , method=RequestMethod.GET)
    public String test2(final Model model ,HttpServletRequest request, HttpServletResponse response,@PathVariable("name") final String username) throws CMSItemNotFoundException,ServletException,IOException
    {


		final ContentPageModel page = getContentPageForLabelOrId(null); 
		storeCmsPageInModel(model, page);
		setUpMetaDataForContentPage(model, page);
		model.addAttribute("name", username);

		// return "hello pradeep kumar srivastava, here is a trick !!";
		// return "addon:/mvmaddon/pages/product/productLayout1Page";
		return "addon:/mvmaddon/pages/sellerProfile";


    }



	// @RequestMapping( value="/**/p/{productCode}" , method=RequestMethod.GET)
    // public String test3(final Model model ,HttpServletRequest request, HttpServletResponse response) throws CMSItemNotFoundException,ServletException,IOException
    // {

	// 	LOG.info("multivendor Controller method 3");
	// 	final ContentPageModel page = getContentPageForLabelOrId(null); 
	// 	storeCmsPageInModel(model, page);
	// 	setUpMetaDataForContentPage(model, page);

	// 	return "addon:/mvmaddon/pages/product/productLayout1Page";

    // }
	
	
}
