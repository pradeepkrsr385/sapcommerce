package  mvm.pks.mvmaddon.controllers.pages;


import mvm.pks.mvmaddon.controllers.pages.imported.ProductPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * MvmProductPageController for product details page
 */
@Scope("tenant")
@RequestMapping(value = "/**/p")
public class MvmProductPageController extends ProductPageController
{

	private static final Logger LOG = Logger.getLogger(MvmProductPageController.class);
	private static final String PRODUCT_CODE_PATH_VARIABLE_PATTERN = "/{productCode:.*}";

	/**
	 * We use this suffix pattern because of an issue with Spring 3.1 where a Uri value is incorrectly extracted if it
	 * contains one or more '.' characters. Please see https://jira.springsource.org/browse/SPR-6164 for a discussion on
	 * the issue and future resolution.
	 */
	@Override
	@RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String productDetail(@PathVariable("productCode") final String productCode, final Model model,
			final HttpServletRequest request, final HttpServletResponse response)
			throws CMSItemNotFoundException, UnsupportedEncodingException
	{
		
		LOG.info("override medthod called !!! multivendor Controller method 1");
		LOG.info("multivendor Controller method 1");
		super.productDetail(productCode,model,request,response);
		return "addon:/mvmaddon/pages/product/productLayout1Page";
	}

}
