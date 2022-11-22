/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.merchandise.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.merchandise.fulfilmentprocess.constants.MerchandiseFulfilmentProcessConstants;

public class MerchandiseFulfilmentProcessManager extends GeneratedMerchandiseFulfilmentProcessManager
{
	public static final MerchandiseFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MerchandiseFulfilmentProcessManager) em.getExtension(MerchandiseFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
