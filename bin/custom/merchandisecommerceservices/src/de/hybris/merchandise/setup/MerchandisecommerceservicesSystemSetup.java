/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.merchandise.setup;

import static de.hybris.merchandise.constants.MerchandisecommerceservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.merchandise.constants.MerchandisecommerceservicesConstants;
import de.hybris.merchandise.service.MerchandisecommerceservicesService;


@SystemSetup(extension = MerchandisecommerceservicesConstants.EXTENSIONNAME)
public class MerchandisecommerceservicesSystemSetup
{
	private final MerchandisecommerceservicesService merchandisecommerceservicesService;

	public MerchandisecommerceservicesSystemSetup(final MerchandisecommerceservicesService merchandisecommerceservicesService)
	{
		this.merchandisecommerceservicesService = merchandisecommerceservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		merchandisecommerceservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MerchandisecommerceservicesSystemSetup.class.getResourceAsStream("/merchandisecommerceservices/sap-hybris-platform.png");
	}
}
