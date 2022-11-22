/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.merchandise.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.merchandise.core.constants.MerchandiseCoreConstants;
import de.hybris.merchandise.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class MerchandiseCoreManager extends GeneratedMerchandiseCoreManager
{
	public static final MerchandiseCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MerchandiseCoreManager) em.getExtension(MerchandiseCoreConstants.EXTENSIONNAME);
	}
}
