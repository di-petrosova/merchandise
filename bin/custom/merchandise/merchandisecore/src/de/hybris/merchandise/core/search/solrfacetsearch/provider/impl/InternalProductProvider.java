package de.hybris.merchandise.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;

import java.util.ArrayList;
import java.util.Collection;

public class InternalProductProvider implements FieldValueProvider {
    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object o) throws FieldValueProviderException {
        final Collection<FieldValue> result = new ArrayList<>();

        if (o instanceof ProductModel) {
            final ProductModel productModel = (ProductModel) o;

            String name = indexedProperty.getName(); // internalOnly
            String type = indexedProperty.getType(); // boolean

            final String propertyName = name + "_" + type;
            boolean internalOnly = Boolean.TRUE.equals(productModel.getInternalOnly());

            final FieldValue fieldValue = new FieldValue(propertyName, internalOnly);

            result.add(fieldValue);
        }
        return result;
    }
}
